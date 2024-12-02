package introductionSelenumWD.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver(); //WebDriver is interface and EdgeDriver class
		driver.get("https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		
		//name
		
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//To Store the element in field and then operate on it
		
		WebElement logo = driver.findElement(By.id("logo"));
		Boolean status = logo.isDisplayed();
		System.out.println(status);
		
		//driver.findElement(By.id("logo")).isDisplayed();
		
		/** LinkTexts and Partial Link Texts
		 * Applicable only for links
		 * in html it is represented by a tag and href attribute
		 * href refers to target link
		 * linktext is different from innertext has different tag
		 * linktext is not an attribute of an element
		 * linktext will perform click action on an element
		 * Partiallink text may return multiple elements and return may not be unique
		 * Prefer partial link text if it returns single value only or else use linktext
		 */
		
		driver.findElement(By.linkText("Tablets")).click();
		
		driver.findElement(By.partialLinkText("Desk")).click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
