package browserDevTools;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v115.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDevTools_LocalizationTesting {


	public static void main(String[] args) throws InterruptedException {
		
	
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools= driver.getDevTools();
		devTools.createSession();
		Map<String, Object> coordinates = new HashMap<String, Object>();
		coordinates.put("latitude", 40);
		coordinates.put("longitude", 3);
		coordinates.put("accuracy", 1);
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride",coordinates);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		String title = driver.findElement(By.cssSelector(".our-story-card-title")).getText();
		System.out.println(title);
		
		driver.close();

	}

}
