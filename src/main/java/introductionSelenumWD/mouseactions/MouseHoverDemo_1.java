package introductionSelenumWD.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo_1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		
		/**Mouse over by moving over element
		// build and perform is mandatory for action class
		 * Build - create an action
		 * perform - complete the action
		 * perform - internally calls build action and adding build is not mandatory
		 * 
		 */
		//act.moveToElement(desktop).moveToElement(mac).build().perform();
		//act.moveToElement(desktop).moveToElement(mac).click().build().perform();
		act.moveToElement(desktop).moveToElement(mac).perform();
	}

}
