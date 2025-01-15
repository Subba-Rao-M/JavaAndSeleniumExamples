package rsUdemyCourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_18_MouseInteractionsUsingActionsClass_Demo_1 {
	/****
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement elAccountList = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(elAccountList).build().perform();
		// using actions class object move to element and build the code to operate and perform to execute the action
		
		WebElement elSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		//Enter the text in search box in capital letters
		a.moveToElement(elSearchBox).click().keyDown(Keys.SHIFT).sendKeys("macbook").build().perform();
		//TO select the work typed in above step
		a.moveToElement(elSearchBox).doubleClick().build().perform();
		//Right click on element
		a.moveToElement(elSearchBox).contextClick().build().perform();
	}

}
