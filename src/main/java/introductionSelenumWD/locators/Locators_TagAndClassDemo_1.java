package introductionSelenumWD.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators_TagAndClassDemo_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver(); //WebDriver is interface and EdgeDriver class
		driver.get("https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		
		//classname
		List<WebElement> headersList = driver.findElements(By.className("list-inline"));
		System.out.println(headersList.size()); //TO find total number of elements
		
		for(WebElement s: headersList) {
			System.out.println("Link Text : >>> " +s.getText());
			
		}
		
		//tag name
		//To capture links a page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links in page : >>> "+links.size());
		
		//To capture total number of images
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images in page : >>> "+images.size());
		driver.close();
	}

}
