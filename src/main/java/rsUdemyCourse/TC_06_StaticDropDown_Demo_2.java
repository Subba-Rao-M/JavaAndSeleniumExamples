package rsUdemyCourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TC_06_StaticDropDown_Demo_2 {
	/**
	 * Verify the scenario where use is able to click on down pick the user type
	 * option enter the number of passengers by clicking on + icon Click on
	 * add/close button
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement expandDropDown = driver.findElement(By.id("divpaxinfo"));
		expandDropDown.click(); // drop down opened

		Thread.sleep(2000L);

		/*
		 * int i=1; // since already 1 is selected by default
		 * 
		 * while(i<5) // to add 4 more
		 * 
		 * {
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click();
		 * 
		 * i++;
		 * 
		 * }
		 */

		System.out.println(expandDropDown.getText());

		for (int i = 1; i < 5; i++)

		{

			driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(expandDropDown.getText());
		Assert.assertEquals(expandDropDown.getText(), "5 Adult");
		driver.close();
	}

}
