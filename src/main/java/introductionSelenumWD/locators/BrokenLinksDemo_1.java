package introductionSelenumWD.locators;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinksDemo_1 {
	
	/**
	 * link should have href attribute
	 * status of hitting the href url and getting back response should be less than 400 for valid links
	 * If status is  > 400 or 500 the link is said to be broken
	 * @throws IOException 
	 * 
	 */

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int noOfBrokenLink = 0;
		for(WebElement linkElement : links) {
			String hrefvalue = linkElement.getAttribute("href");
			
			if(hrefvalue== null || hrefvalue.isEmpty()) {
				System.out.println("No valid links to test");
				continue;
			}
			try {
			// Hit url to server by converting above href value from string to URL format
			URL linkURL = new URL(hrefvalue);
			
			// Open the connection to server using above link url
			HttpURLConnection conn = (HttpURLConnection)linkURL.openConnection();
			conn.connect(); //sends request to server
			int statusCode = conn.getResponseCode();
			if(statusCode >=400) {
				System.out.println(" Broken Link --- >"+hrefvalue);
				noOfBrokenLink++;
				
				
			}
			else {
				System.out.println(" Link is not broken --->"+hrefvalue);
			}
			
			
		}
			catch(Exception e) {
				System.out.println("Exception occurred");
			}
		}
		System.out.println(" Number broken links "+noOfBrokenLink);

	}

}
