package selenium.threadsafety;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverTest1 {
	
	private static ThreadLocal <WebDriver> tlDriver = new ThreadLocal<>();
	
	WebDriver driver;
	
	public void setDriver(WebDriver driver) {
		tlDriver.set(driver);
	}
	
	public WebDriver getDriver() {
		return tlDriver.get();
	}
	
	@AfterClass
	public void tearDown() {
		tlDriver.remove();
	}
	
	@Test
	public void myTest1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		setDriver(driver);
		WebDriver lDriver = getDriver();
		lDriver.get("https://www.google.com");
		System.out.println(lDriver.getTitle());
		lDriver.close();
	}
	
	@Test
	public void myTest2() {
		driver = new EdgeDriver();
		driver = new ChromeDriver();
		setDriver(driver);
		//getDriver();
		getDriver().get("https://www.bing.com");
		System.out.println(getDriver().getTitle());
		getDriver().close();
	}

}
