package rsUdemyCourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class TC_01_Locators_Demo_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Test"); //Find by ID
		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); //Find by name
		
		//class=""submit signInBtn" - use class name without space
		driver.findElement(By.className("signInBtn")).click();
		
		//<p class="error">* Incorrect username or password </p>
		/**
		 * CSS Selector
		 * id -> tagname#id
		 * classname - tagname.classname
		 * attribute value - tagname[attribute='value']
		 * Selenium scans element from top left and first locator will be picked if multiple elements
		 * in console enter css locator like $(p.error). the field will be highlighted in screen and number of matching elements will be retrieved
		 */
		String errorMessage = driver.findElement(By.cssSelector("p.error")).getText(); //fails due to load time
		System.out.println(errorMessage);
		
		driver.findElement(By.linkText("Forgot your password?")).click(); //anchor text a with text for link
		
		/***
		 * xpath and css are generic locators which will be constructed based on html code attributes
		 * //tagname[@attribute='value']
		 * to chcek in console $x('//tagname[@attribute="value"]')
		 * Xpath will ignore hidden attribute and css will consider so there may be difference when using index
		 * CSS  tagname[attribute='value']:nth-child(index)
		 * xpath //tagname[@attribute='value'][index]
		 */
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Subba"); //Xpath
		WebElement email = driver.findElement(By.cssSelector("input[placeholder='Email']"));//CSS locator, compare with above
		email.clear(); //to clear the data in email field
		email.sendKeys("subbaraw@gmail.com"); 
	
		//If locator matching multiple elements
		driver.findElement(By.xpath("//input[@type='text'][3]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1111111111");
		/**
		 * Xpath Traversing using tags form parent to child
		 * //form/h2 -- for page title
		 * //form/input[3] -- for phone number above
		 * In CSS parent_tag_name child_tag_name // no tags only space in between tags
		 */
		
		//class name using css
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //If error for this wait for page load after sliding
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		String inputUsername = "subbaraw@gmail.com";
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(inputUsername);
		//attribute with * acts as regular expression and partial value matching is checked
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		
		//Regular expression using xpath
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		Thread.sleep(1000);
		//tag name can be used if single element present in page with particular tag name
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+inputUsername+",");
		String confMessage = driver.findElement(By.tagName("p")).getText();
		System.out.println(confMessage);
		//If testng used for assertion
		Assert.assertEquals(confMessage, "You are successfully logged in.");
		
		//driver.findElement(By.xpath("//button[text()='LOG OUT']")).click();
		//If tag name is unique then tag name can be entered as *
		//element can be identified using text function
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		driver.close();
		System.out.println("End");
	}
	
	
}
