package rsUdemyCourse;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class TC_17_ExplicitFluentWait_Demo_2 {

		public static void main(String[] args) {
			WebDriver driver = new EdgeDriver();
			driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement elToWait = driver.findElement(By.cssSelector("[id='finish'] h4"));
			
			driver.findElement(By.cssSelector("[id='start'] button")).click();
			
			Wait <WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
			
			WebElement foo = wait.until(new Function<WebDriver, WebElement> (){
				
				public WebElement apply(WebDriver driver) {
					if(elToWait.isDisplayed()) {
						return elToWait;
					}
					else {
						return null;
					}
					
				}
				
			});
			
		

			String text = elToWait.getText();
			System.out.println(text);
		driver.close();
		}

}
/****
 * 
 * Synchronization Issue:
 * 
 * Fluent Wait: 
 * Similar to explicit wait
 * listens to DOM in regular interval of time using polling
 * Fluent wait example like payment flow where your card is submitted, your order is processed and thank you with order id
 * 3 messages with same html property using loading icon and confirmation page
 * Very rare scenario this scenario will appear in automation with good performance oriented application
 * Wait interface is implemented by WebDriverWait and FluentWait classes

 * in above example every 3 seconds until 30 seconds for display of element is checked and 
 * after 3 seconds only at 6 second it is checked and not in 4th and 5th second
 * in between if you get no such element exception is ignored
 * fluent wait will not have pre defined functions unlike web driver wait
 */


