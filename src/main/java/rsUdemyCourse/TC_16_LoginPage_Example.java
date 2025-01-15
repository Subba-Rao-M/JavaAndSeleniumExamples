package rsUdemyCourse;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_16_LoginPage_Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@type='radio' and @value='user']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement userType = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dd = new Select(userType);
		dd.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("app-card-list.row")));
		
		List <WebElement> products = driver.findElements(By.cssSelector("h4 a"));
		
		for(int i=0; i< products.size(); i++) {
			products.get(i).getText();
			driver.findElement(By.cssSelector(".card-footer button")).click();
		}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Checkout']")).click();
		driver.findElement(By.id("country")).sendKeys("Ind");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='suggestions']")));
		List <WebElement> locations = driver.findElements(By.xpath("//div[@class='suggestions']//a"));
		for(WebElement option : locations) {
			if(option.getText().equalsIgnoreCase("India")){
				option.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='checkbox2']//label")).click();
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();
		String text = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		String act = "Success! Thank you! Your order will be delivered in next few weeks :-).";
		Assert.assertEquals(text, act);
		driver.close();
		
	}

}
