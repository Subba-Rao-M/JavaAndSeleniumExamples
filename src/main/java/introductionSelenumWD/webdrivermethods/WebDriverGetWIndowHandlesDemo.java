package introductionSelenumWD.webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebDriverGetWIndowHandlesDemo {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver(); 
		
		//get method returns void and takes 1 parameter
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("OrangeHRM"))).click().perform();
		//driver.findElement(By.linkText("OrangeHRM")).click();
		
		Set<String> windowIds= driver.getWindowHandles();
		for(String ws: windowIds) {
			System.out.println(ws);
		}
		
		driver.close();

	}

}
