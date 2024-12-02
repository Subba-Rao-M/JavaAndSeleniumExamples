package introductionSelenumWD.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutorDemo_1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		
		/**
		 * JavascriptExecutor is interface so we cannot create object
		 * but driver object of edge driver above is child of java script executor based on web driver interface
		 * So upcasting can be done to achieve this
		 * WebDriver driver = new EdgeDriver();
		 * JavascriptExecutor js = (JavascriptExecutor) driver
		 * 
		 * If in above statement 
		 * EdgeDriver driver = new EdgeDriver(); is written then parent class can hold child class variable
		 * so directly write
		 * JavascriptExecutor js = driver;
		 */
		
		//Alternative for sendkeys method if there is element intercepted exception
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', 'Subba')", inputbox);
		
		//Alternative for click method if there is element intercepted exception
		
		WebElement radbutton = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", radbutton);
		
	}

}
