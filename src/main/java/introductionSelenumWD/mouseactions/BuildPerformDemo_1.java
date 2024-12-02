package introductionSelenumWD.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BuildPerformDemo_1 {
	
	/***
	 * Build vs Perform
	 * Action is interface vs Actions is a class
	 * 
	 * Actions - Class - Used to perform all mouse actions
	 * 			- Can create object for this
	 * Action - interface - Used to store created actions
	 * 			- Cannot create object for this
	 * 			- Used to create variables 
	 * 
	 * 
	 */

	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
	
	WebElement btn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	Actions act = new Actions(driver);
	
	act.contextClick(btn).build().perform(); //Right click
	act.contextClick(btn).perform(); //Right click
	
	Action myaction = act.contextClick(btn).build(); // hold the action created by build in Action interface
	myaction.perform();

	//Click on copy option
	driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
	driver.switchTo().alert().accept(); //close the alert box
}
}
