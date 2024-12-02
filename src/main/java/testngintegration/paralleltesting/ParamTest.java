package testngintegration.paralleltesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParamTest {
WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setUp(String br) throws InterruptedException {
		switch(br.toLowerCase()){
		case "edge": 		driver = new EdgeDriver();	
							break;
		case "chrome" :  driver = new ChromeDriver(); break;
		default : System.out.println("Invalid browser"); return; //return will exit from complete method and remaining code will not be executed
		}
		//driver = new EdgeDriver();		
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
	
	@Test(priority=1)
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority=3)
	void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
