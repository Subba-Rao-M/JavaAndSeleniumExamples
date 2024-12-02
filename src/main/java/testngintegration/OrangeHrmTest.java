package testngintegration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OrangeHrmTest {
	WebDriver driver ;
	@Test(priority=1)
	void openapp() {
		driver = new EdgeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(priority=2)
	void testlogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Status --->"+status);
	}
	@Test(priority=3)
	void testlogin() {
		driver.findElement(By.xpath("//input[@placeholder ='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder ='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority=4)
	void closeapp() {
		driver.close();
	}
}
