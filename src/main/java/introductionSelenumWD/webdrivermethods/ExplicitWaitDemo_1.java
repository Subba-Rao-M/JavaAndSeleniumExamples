package introductionSelenumWD.webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo_1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit wait
		
		//Declare explicit wait
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//Usage
		
		WebElement searchField = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search")));
		searchField.sendKeys("MAC");
		
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		driver.close();

	}

}
