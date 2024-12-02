package introductionSelenumWD.dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestionDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); 
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		System.out.println("Size of items"+list.size());
		
		for(int i=0; i< list.size(); i++) {
			System.out.println(" Value of text "+list.get(i).getText());
			
			if (list.get(i).getText().equals("selenium")) {
				list.get(i).click();
				break;
			}
		}
		
		

	}

}
