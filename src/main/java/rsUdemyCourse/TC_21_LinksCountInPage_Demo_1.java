package rsUdemyCourse;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TC_21_LinksCountInPage_Demo_1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		
		//Scenario 1 - Number of links in entire page
		int noOfLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("Links in entire page : "+noOfLinks);
		
		//Scenario 2 - To list the links in footer section
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope using above element
		System.out.println("Links in footer section : "+footerdriver.findElements(By.tagName("a")).size());
		
		//Scenario 3 - Get the count of links in footer sections first column
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int linksInFirstCol = coloumndriver.findElements(By.tagName("a")).size();
		System.out.println("Links in footer sections first column : "+linksInFirstCol);
		
		//Scenario 4 - Click on each link from above scenario of first column
		
		for(int i=1; i< linksInFirstCol; i++) {
			String openLinkInNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(openLinkInNewTab); //Instead of click send keys should be used to pass above string value for keyboard events
		}
		
		//Scenario 5 - Grab the title of each tab/window
		
		Set <String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			String title = driver.getTitle();
			System.out.println("Title of window is : "+title);
			
		}
		
		System.out.println("Test Completed");
		driver.quit();

	}

}
