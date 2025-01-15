package rsUdemyCourse;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class TC_09_Checkbox_Demo_1 {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * All checkbox or radio buttons may have type as checkbox or radio
		 * 
		 */

		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement isSeniorCitizen = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		System.out.println(isSeniorCitizen.isSelected());
		Assert.assertFalse(false);
		
		isSeniorCitizen.click();
		System.out.println(isSeniorCitizen.isSelected());
		Assert.assertTrue(true);
		
		Thread.sleep(3000);
		int noOfCheckbox= driver.findElements(By.xpath("//div[@id='discount-checkbox']//input[starts-with(@id, 'ctl00_mainContent_chk_')]")).size();
		System.out.println(noOfCheckbox);
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='discount-checkbox']//input[starts-with(@id, 'ctl00_mainContent_chk_')]"));
		for (WebElement checkbox : checkboxes) {
            
            if (!checkbox.isSelected() ) {

                checkbox.click();
            }
        }
		driver.close();
		System.out.println("End");
		

	}

}
