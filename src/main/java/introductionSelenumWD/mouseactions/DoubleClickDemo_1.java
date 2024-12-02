package introductionSelenumWD.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


/***
 * tfield2.getText() vs tfield2.getAttribute("attribute")
 * <input id="xyz"> Welcome </input>
 * getText - returns innertext - Welcome
 * getAttribute("id") -- returns value of id attribute - xyz
 * 
 * 
 *
 */

public class DoubleClickDemo_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement tfield1 = driver.findElement(By.cssSelector("#field1"));
		WebElement tfield2 = driver.findElement(By.cssSelector("#field2"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		tfield1.clear();
		tfield1.sendKeys("WELCOME");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.doubleClick(button).build().perform();
		
		//String datainText2 = tfield2.getText(); // gettext Captures the inner text from text field
		//Instead use below method to get the value of value attribute since copy happens in run time
		String datainText2 = tfield2.getAttribute("value");
		if(datainText2.equals("WELCOME")) {
			System.out.println(" Text Copied and test passed");
		}
		else {
			System.out.println(" Test failed");
		}

	}

}
