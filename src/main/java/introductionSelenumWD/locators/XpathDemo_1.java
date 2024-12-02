package introductionSelenumWD.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathDemo_1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver(); //WebDriver is interface and EdgeDriver class
		driver.get("https://awesomeqa.com/ui/index.php?route=common/home");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		driver.findElement(By.xpath("//img[@title = 'MacBook']")).isDisplayed();
		
		//Xpath with multiple attributes
		
		//driver.findElement(By.xpath("//input[@type='text'][@placeholder='Search']")).isDisplayed();
		
		//Xpath with 'and' operator
		
		//driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search']")).isDisplayed();
		
		//Xpath with 'or' operator
		
		driver.findElement(By.xpath("//input[@type='search' or @placeholder='Search']")).isDisplayed();
		
		
		//Xpath using inner text
		
		driver.findElement(By.xpath("//a[text()='MacBook']")).isDisplayed();
		driver.findElement(By.xpath("//a[text()='Desktops']")).isDisplayed();
		
		String s = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(s);
		
		
		//Xpath with contains method
		driver.findElement(By.xpath("//input[contains(@placeholder, 'arc')]")).sendKeys("Mac");
		
		//xpath with starts -with 
		
		driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]")).sendKeys("Mac");
		
		//X-Path chaining
		
		boolean imageStatus = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(imageStatus);
		
		driver.findElement(By.xpath("//h3[contains(.,'Featured')]")).isDisplayed();
		
		driver.close();

	}

}
