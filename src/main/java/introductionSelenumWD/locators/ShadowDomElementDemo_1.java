package introductionSelenumWD.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ShadowDomElementDemo_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://dev.automationtesting.in/shadow-dom");
		driver.manage().window().maximize();
		
		//The shadow element is inside single shadow down
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(5000);
		shadow.findElement(By.cssSelector("#shadow-element")).click();
		
		// The shadow element is nested inside above shadow root i.e 2 nested shadow doms
		SearchContext shadow0 = shadow.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(5000);
		shadow0.findElement(By.cssSelector("#nested-shadow-element")).click();
		
		// The shadow element is nested inside above shadow root i.e 3 nested shadow doms
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		Thread.sleep(5000);
		shadow1.findElement(By.cssSelector("#multi-nested-shadow-element")).click();
		
		System.out.println("Test passed");

	}

}
