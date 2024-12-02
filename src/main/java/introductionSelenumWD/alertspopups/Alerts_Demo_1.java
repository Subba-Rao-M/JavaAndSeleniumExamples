package introductionSelenumWD.alertspopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/***
 * Without closing alert cannot proceed further in script execution
 * 3 types of alerts - Java script alerts
 * Normal alert with OK button
 * Confirmation alert with ok and cancel 
 * Prompting alert with input field and ok and cancel button
 * Alert is not an web element, cannot get any field attributes
 */

public class Alerts_Demo_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); 
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/**
		 * Normal alert with ok button
		 */
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		//driver.switchTo().alert().accept();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		

		/**
		 * Confirmation alert
		 * accept to click ok an dismiss to cancels
		 */
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert1.dismiss();
		
		/**
		 * Prompt alert
		 * sendkeys to send text
		 * accept to click ok an dismiss to cancels
		 */
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert2.sendKeys("Welcome!");
		Thread.sleep(2000);
		alert2.accept();
		Thread.sleep(3000);
		
		
		driver.close();

	}

}
