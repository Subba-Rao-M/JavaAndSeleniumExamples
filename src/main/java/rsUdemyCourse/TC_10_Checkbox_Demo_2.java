package rsUdemyCourse;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class TC_10_Checkbox_Demo_2 {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * All checkbox or radio buttons may have type as checkbox or radio
		 * 
		 */

		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement firstCheckBox = driver.findElement(By.id("checkBoxOption1"));
		firstCheckBox.click();
		Assert.assertTrue(firstCheckBox.isSelected());
		if(firstCheckBox.isSelected()) {
			firstCheckBox.click();
			Assert.assertFalse(firstCheckBox.isSelected());
		}
		
		
		int noOfCheckbox= driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(noOfCheckbox);
		driver.close();
		System.out.println("End");
		

	}

}
