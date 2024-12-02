package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
	WebDriver driver ;

	@BeforeClass
	void setup() {
		driver = new EdgeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	void testLogin() {
		//LoginPage lp = new LoginPage(driver); //Without page factory
		LoginPageWithPageFactory lp = new LoginPageWithPageFactory(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
