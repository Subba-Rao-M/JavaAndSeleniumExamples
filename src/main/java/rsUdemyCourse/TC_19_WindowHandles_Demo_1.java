package rsUdemyCourse;

import java.time.Duration;
import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class TC_19_WindowHandles_Demo_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		// Thread.sleep(3000);
		String text = driver.findElement(By.cssSelector(".im-para.red")).getText();
		String email = text.split("at")[1].trim().split(" ")[0];
		// driver.switchTo().defaultContent();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.quit();

	}

}
