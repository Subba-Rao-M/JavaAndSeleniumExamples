package introductionSelenumWD.dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownDemo_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='country']"));
		Select dropdownValue = new Select(dropDownElement);
		
		/***
		 * 3 methods to select drop down value using select option : 
		 * selectByVisibleText() -- value which can be seen in UI
		 * selectByValue() -- attribute of text some times both can be same
		 * selectByIndex()
		 */
		
		
		dropdownValue.selectByVisibleText("France");
		Thread.sleep(1000);
		dropdownValue.selectByValue("usa");
		Thread.sleep(1000);
		dropdownValue.selectByIndex(1); //index starts from 0
		
		//To find the number of options in dropdown list using getOptions()
		
		List<WebElement> options = dropdownValue.getOptions();
		System.out.println("Number of elements in drop down : "+options.size());
		
		//Printing the options value using getText()
		
		for (int i = 0; i< options.size(); i++) {
			System.out.println("Option values : "+options.get(i).getText());
		}
		
		//Enhanced for loop
		for(WebElement op : options) {
			System.out.println(op.getText());
		}
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
