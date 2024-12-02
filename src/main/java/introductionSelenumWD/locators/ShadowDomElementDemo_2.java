package introductionSelenumWD.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ShadowDomElementDemo_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("#input")).sendKeys("Welcome!"); //No such element exception
		
		//The shadow element of main root is captured and in between remaining ignored
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle=\"BOOKS\"]")).getShadowRoot();
		Thread.sleep(5000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("Welcome!");
		
		
		System.out.println("Test passed");
		driver.close();

	}

}
