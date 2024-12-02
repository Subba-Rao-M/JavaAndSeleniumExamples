package testngintegration.parameterization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderDemo_1 {
	
	WebDriver driver;
	
	@BeforeMethod
	void setUp() {
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(dataProvider="dp") //name from Data provider annotation
	void testLogin(String email, String password) {
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder ='Username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder ='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	@AfterMethod
	void tearDown() {
		driver.close();
	}
	

	@DataProvider(name="dp", indices= {0,1}) //Give name for data provider
	Object[][] loginData(){
	Object data[][] = { // Test Data can be anything prefer to use object type
			{"Admin", "admin123"},
			{"Admin1", "admin123"},
			{"Admin", "admin12"},
			{"Admin", "admin123"}
	};
	
	return data; // String 2 dimentional data
	}

}
