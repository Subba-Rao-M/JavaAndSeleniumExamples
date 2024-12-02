package introductionSelenumWD.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkTextDemo {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver(); //WebDriver is interface and EdgeDriver class
		driver.get("https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		
		/** LinkTexts and Partial Link Texts
		 * Applicable only for links
		 * in html it is represented by a tag and href attribute
		 * href refers to target link and use value related to this in test script
		 * link text is different from innertext has different tag
		 * link text is not an attribute of an element
		 * link text will perform click action on an element
		 * Partial link text may return multiple elements and return may not be unique
		 * Prefer partial link text if it returns single value only or else use linktext
		 * 
		 */
		
		driver.findElement(By.linkText("Tablets")).click();
		
		driver.findElement(By.partialLinkText("Desk")).click();
		
		Thread.sleep(3000);
		driver.close();

}
}
