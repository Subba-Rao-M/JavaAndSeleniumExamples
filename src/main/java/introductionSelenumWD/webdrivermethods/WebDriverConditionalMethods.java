package introductionSelenumWD.webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
		driver.manage().window().maximize();
		
		WebElement we = driver.findElement(By.id("input-firstname"));
		System.out.println(we.isDisplayed());
		System.out.println(we.isEnabled());
		
		System.out.println(driver.findElement(By.id("input-firstname")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")).isSelected());
		
		driver.close();

	}

}
