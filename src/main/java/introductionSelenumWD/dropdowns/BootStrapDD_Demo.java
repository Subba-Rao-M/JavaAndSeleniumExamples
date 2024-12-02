package introductionSelenumWD.dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BootStrapDD_Demo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To Open drop down options
		driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click();
		
		//To select one option using checkbox
		driver.findElement(By.xpath("//input[@value = 'Java']")).click();
		
		//To capture all options in dropdown and find size
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
		System.out.println("Number of options in list : "+options.size());
		
		//To print options from dropdown
		for(WebElement op : options) {
			String optionValue = op.getText();
			System.out.println("Available options to select " +optionValue);
			
			if(optionValue.equals("C#") || optionValue.equals("Python") || optionValue.equals("MySQL")) {
				op.click();
			}
			
			
		}

	}

}
