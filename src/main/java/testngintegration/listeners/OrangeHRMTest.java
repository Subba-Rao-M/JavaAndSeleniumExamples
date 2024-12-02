package testngintegration.listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//@Listeners(testngintegration.listeners.MyListner.class)
public class OrangeHRMTest {
WebDriver driver;
	
	@BeforeClass

	void setUp() throws InterruptedException {
	
		driver = new EdgeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@Test(priority=4, dependsOnMethods={"testURL"})
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority=2)
	void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive1.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
		driver.quit();
	}
}
