package rsUdemyCourse;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TC_15_ExplicitWait_Demo_1 {

		public static void main(String[] args) {
			WebDriver driver = new EdgeDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/");

			String vegetablesToAdd[] = { "Cucumber", "Brocolli", "Walnuts" };
			addItem(driver, vegetablesToAdd);
			driver.findElement(By.cssSelector("img[alt='Cart']")).click();
			driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
			driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
			driver.findElement(By.cssSelector("button.promoBtn")).click();
			
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
			
			System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
			driver.close();

		}
		
		public static void addItem(WebDriver driver, String[] vegetablesToAdd) {
			List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
			for (int i = 0; i < products.size(); i++) {
				String prodNameValue[] = products.get(i).getText().split("-");
				String prodName = prodNameValue[0].trim();
				List<String> itemsList = Arrays.asList(vegetablesToAdd);
				int j=0;
				if (itemsList.contains(prodName)) {
					driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
					j++;
					if (j == vegetablesToAdd.length) {
						break;
					}

				}
			}
		}

	

}
/****
 * 
 * Synchronization Issue:
 * 
 * Explicit Wait: 
 * Applicable only for specific element not global
 * 2 approaches:
 * 1 using webdriverwait class
 * 2 using fluent wait
 * Advantages:
 * Performance issues can be caught as it is applied wherever required
 * Wait is applied only for targetted elements
 * Disadvantages: Multiple lines of code specific to elements
 * 
 */


