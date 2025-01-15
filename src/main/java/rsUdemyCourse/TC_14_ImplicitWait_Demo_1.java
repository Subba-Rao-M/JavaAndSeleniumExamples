package rsUdemyCourse;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TC_14_ImplicitWait_Demo_1 {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/");

			String vegetablesToAdd[] = { "Cucumber", "Brocolli", "Walnuts" };
			addItem(driver, vegetablesToAdd);
			driver.findElement(By.cssSelector("img[alt='Cart']")).click();
			driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
			driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
			driver.findElement(By.cssSelector("button.promoBtn")).click();
			Thread.sleep(3000);
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
 * Implicit wait wait for n seconds before throwing any error. This information is given to driver as global parameter.
 * Advantages: Defined at global level and applicable for all steps until web driver object is killed
 * If 5 seconds is given, it will wait until 5 secs and if it displayed in 2 seconds then it will come out of loop of waiting dom of web driver
 * Time is given maximum time and it comes out when element is visible will not wait for complete 5 secs
 * Code looks simple, optimized and readable
 * Disadvantages: if for some test case scenario if it takes more than 5 secs or SLA defined time. It cannot be caught if implicit time is increased to make application to work
 * Performance issues can be hidden where fields take time to load and waits until given implicit wait
 * 
 * Dont give more than 10 secs in implicit wait
 * 
 * Explicit Wait: 
 * Applicable only for specific element not global
 * 
 * Combination of both waits is ideal scenario
 * 
 * Thread.sleep() - No logic and not part of selenium. Its java logic where execution halts for given sec
 * 
 * 
 */


