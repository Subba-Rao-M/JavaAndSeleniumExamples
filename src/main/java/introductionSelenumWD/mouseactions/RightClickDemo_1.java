package introductionSelenumWD.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo_1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		
		act.contextClick(btn).build().perform(); //Right click
		
		//Click on copy option
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		driver.switchTo().alert().accept(); //close the alert box
		
	}

}
