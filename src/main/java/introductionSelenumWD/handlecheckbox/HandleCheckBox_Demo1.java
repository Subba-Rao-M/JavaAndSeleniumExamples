package introductionSelenumWD.handlecheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleCheckBox_Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); 
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//To check specific single checkbox or radio buttons
		
		driver.findElement(By.cssSelector("#sunday")).click();
		driver.findElement(By.cssSelector("#male")).click();
		
		//To check multiple check boxes
		
		//to capture all check boxes use combination of attributes filter only required checkboxes
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class = 'form-check-input' and @type = 'checkbox']"));
		
		for(int i=0; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();
			
		}
		
		//Using advanced for loop for above and unchecks previios check
		
		for (WebElement ch : checkboxes) {
			ch.click(); // no indexing option in enhanced for loop
		}
		
		
		/***
		 * TO select last 3 checkboxes
		 * index starts from 0
		 * total number of checkboxes 7
		 * check 3 checboxes 
		 * calc: 7 - 3 = 4 (total number of checkboxes - how many checkboxes to be selected)
		 * index starts from 4
		 */
		
		
		for(int i=4; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();
			
		}
		
		/***
		 * TO select first 3 checkboxes
		 * index 0 to 2
		 */
		
		for(int i=0; i<3; i++) {
			checkboxes.get(i).click();
			
		}
		
		/***
		 * To un select checkboxes  if checkbox/radio button is checked 
		 * 
		 */
		
		for(int i=0; i<checkboxes.size(); i++) {
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
			
		}
		
		driver.findElement(By.cssSelector("#male")).click();
		driver.findElement(By.cssSelector("#female")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
