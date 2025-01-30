package autoIT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

/****
 * Shift the focus to file upload window set the file path click open to upload
 * the file
 * 
 * 
 * Au3info- record window component objects
 * 
 * Build Script -scite.exe
 * 
 * Save it- .au3 extenstion
 * 
 * Convert file into .exe by compiling .au3 file
 * 
 * Call .exe file with Runtime class in java into your selenium tests
 * 
 * 
 * ControlFocus("Open","","Edit1")
 * 
 * ControlSetText("Open","","Edit1","‪C:\Users\raooosub\Downloads\doc.txt")
 * 
 * ControlClick("Open","","Button1")
 * 
 * 
 * 
 */

public class AutoIT_UploadFileDemo {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String downloadPath = System.getProperty("user.dir");
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://altoconvertpdftojpg.com/");

		driver.findElement(By.cssSelector("[class*='btn--choose']")).click();
		Thread.sleep(3000);

		Runtime.getRuntime().exec("C:\\Users\\raooosub\\Downloads\\UploadFile.exe");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));

		driver.findElement(By.cssSelector("button[class*='medium']")).click();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));
		driver.findElement(By.linkText("Download Now")).click();

		Thread.sleep(5000);

		File f = new File(downloadPath + "/converted.zip");

		if (f.exists()){
			Assert.assertTrue(f.exists());
			if (f.delete())
				System.out.println("file deleted");
		}

	}
}
