package introductionSelenumWD.keyboardactions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenPageInNewTabDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		
		WebElement actLink = driver.findElement(By.linkText("Returns"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(actLink).keyUp(Keys.CONTROL).perform();
		//click method from action class accepts parameter and direct click method does not accept any parameter
		
		//Switch to new browser tab
		
		List < String> ids = new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1));
		
		driver.findElement(By.id("input-firstname")).sendKeys("Subba");
		driver.switchTo().window(ids.get(0));
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		act.moveToElement(desktop).moveToElement(mac).click().build().perform();
		
		driver.quit();

	}

}
