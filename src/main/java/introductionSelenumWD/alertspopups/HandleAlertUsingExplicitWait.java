package introductionSelenumWD.alertspopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Alert handing without using driver.switchTo().alert() command
 *
 */
public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver(); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
		driver.close();
		
		/**
		 * another option using java script executor
		 */

	}

}
