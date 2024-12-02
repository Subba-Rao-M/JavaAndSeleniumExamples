package introductionSelenumWD.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollingPageDemo_1 {

	public static void main(String[] args) {
		/**
		 * Scrollbar belongs to browser not application 
		 * Scrollbar appears based on size of contents in UI
		 * Scrollbar is not webelement and it cannot be located using inspect option
		 * 3 ways:
		 * using pixels
		 * until the element is visible
		 * scroll till end of page
		 * scroll back to initial point(top)
		 */
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		driver.manage().window().maximize();
		JavascriptExecutor js =  driver;
		
		//Scroll down the page using pixel number
		js.executeScript("window.scrollBy(0, 3000)","");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Scroll down the page to particular element
		
		WebElement el = driver.findElement(By.xpath("//div[text()='Sri Lanka']"));
		js.executeScript("arguments[0].scrollIntoView();",el);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Scroll till bottom of page
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll back to top or initial position
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//for horizontal scroll bar in rare cases use Xoffset and width in above example scripts

	}

}
