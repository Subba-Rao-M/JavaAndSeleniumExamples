package rsUdemyCourse;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TC_13_AddProductsToCartDynamic {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String vegetablesToAdd[] = { "Cucumber", "Brocolli", "Walnuts" };
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String prodNameValue[] = products.get(i).getText().split("-");

			// Check if the name extracted is present in array or not
			// Convert array into array list for easy search as array list supports contains
			// array takes less memory and in run time convert it to arraylist as it takes
			// less memory
			// When using arraylist product name should contain only prod name not weight ,
			// so split the text to get only prod name
			String prodName = prodNameValue[0].trim();
			List<String> itemsList = Arrays.asList(vegetablesToAdd);

			// if(prodName.contains("Cucumber")) { //Update to below to capture multiple
			// elements
			int j = 0; // to eliminate extra code run
			if (itemsList.contains(prodName)) { // Check if array list item matches with required prod name received
												// from application
				// driver.findElements(By.xpath("//button[text() = 'ADD TO
				// CART']")).get(i).click();
				// This remains in added state for some time so index changes in run time and in
				// debug mode it works fine
				// If text locator remains static this works fine
				// break; //Cannot use with arrays to select multiple values
				// Re[;ace above text locator to other static locator
				driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
				j++;
				if (j == vegetablesToAdd.length) {
					break;
				}

			}
		}
		driver.close();

	}

	/***
	 * Ctrl+Shift + F - formatting the code
	 * 
	 * Defining class name and variable name - Follow camel case 
	 * Class name - First  letter Capital letter and remaining small - TC_1_TestUserRegistration
	 * Variable Name - should start with small letter ex: isEnabled = true 
	 * Method Name - should start with small letter ex: doLogin()
	 * Debugging- Debug as after adding break points in code Step by step execution 
	 * - F6 ; Exit step by step execution and go to next break point - f8;  Step into to
	 * move inside methods step - F5
	 */

}
