package rsUdemyCourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_07_DynamicDropDown_Demo_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Click on First from drop down
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		//Click on value inside drop down selection layout. Since xpath scans form top left by default first value is considered
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		//After clicking first drop down list value, 2 drop down opens by default to select to value and for 2nd time index should be provided to select drop down specific value as page has multiple same values
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		/**
		 * most of the peoples dont recommend using indexes even though its correct
		 * to overcome this parent and child relationship node is considered and above can be rewritten as 
		 *    //parent node //a[@value='BLR'])
		 *    enter parent expath give space and enter child xpath
		 *    child xpath will be scanned within parent xpath only
		 */
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		driver.close();
		System.out.println("End of Test");

		
	}

}
