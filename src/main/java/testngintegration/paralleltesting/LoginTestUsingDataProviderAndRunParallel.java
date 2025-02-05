package testngintegration.paralleltesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestUsingDataProviderAndRunParallel {
	
	WebDriver driver;
	@Test(dataProvider="loginData")
	public void loginTest(String userName, String password) {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.className("login-button")).click();
		
		boolean loginStatus;
		try {
			loginStatus = driver.findElement(By.xpath("//a[normalize-space()='Log out']")).isDisplayed();
			Assert.assertTrue(loginStatus);
		}
		catch(Exception e){
			System.out.println(e);
			loginStatus=false;
			Assert.assertTrue(loginStatus);
		}
		finally {
			driver.quit();
		}
	}
	
	/** *
	 * In data provider make parallel = true
	 * In xml file make data provider thread count value wiht required thread count
	 * To make run particular record use indecies with index value starting from 0
	 */
	@DataProvider(name="loginData", parallel=true, indices = {0, 2})
	public String[][] getData() {
		String[][] data = {{"john.doe1234@example.com", "test123"}, {"jame.smith321@example.com", "test321"},
				{"laura.taylor1234@example.com", "test123"}};
		return data;
	}

}
