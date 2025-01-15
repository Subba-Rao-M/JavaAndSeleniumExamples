package rsUdemyCourse;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class TC_23_JavaScriptExecutor_Demo_1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)"); //scroll web page scroll bar
		//In console to check java script executor locator document.querySelector("css locator").checkfor options
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); //scrollbar for an element
		
		List<WebElement> amountColumnValues = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for(int i=0; i<amountColumnValues.size(); i++) {
			sum = sum+ Integer.parseInt(amountColumnValues.get(i).getText());
			
			
		}
		System.out.println(sum);
		
		int totalAmount = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		System.out.println(totalAmount);
		
		Assert.assertEquals(sum, totalAmount);
		driver.close();
	}

}
