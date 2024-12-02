package introductionSelenumWD.webdrivermethods;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationsMethodsDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		WebDriver driver = new EdgeDriver(); 
		driver.get("https://awesomeqa.com/ui/index.php?route=account/register"); //URL accepted only in string format
		driver.manage().window().maximize();
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/"); //URL accepted in string format
		
		//URL myurl = new URL("https://testautomationpractice.blogspot.com/");
		//driver.navigate().to(myurl); // accepts url in object format received from oher application
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		

	}

}
