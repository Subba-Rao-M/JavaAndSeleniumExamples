package rsUdemyCourse;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

public class TC_25_TestBorkenLinks_Demo_1 {

	/**
	 * Broken Link = broken URL = the url tied to link is not working
	 * In n/w tab the status for broken link is 4xx series
	 * Selenium with Java method used to call url without hitting url in browser and get the status code
	 * @throws IOException 
	 *
	 */
	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a = new SoftAssert();
		
		//Step 1: Get all urls in page using href reference
		//Step 2: Get the status code for all urls
		//Step 3: If status code is greater than 4xx series then the url is broken
		/**
		String urlSoap = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getDomAttribute("href");
		System.out.println(urlSoap);
		URL url = new URL(urlSoap);
		HttpURLConnection	connection = (HttpURLConnection) url.openConnection();
		//HttpURLConnection	con = (HttpURLConnection)new URL(urlSoap).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int resCode = connection.getResponseCode();
		System.out.println(resCode);
		
		**/
		List <WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		
		for(WebElement link : links) {
			String linkURL = link.getDomAttribute("href");
			System.out.println("Link "+linkURL);
			if(linkURL.equals("#") || linkURL.isEmpty() || linkURL.equals(null)) {
				System.out.println(" Href attribute is not valid");
			}
			else {
				URL url = new URL(linkURL);
				HttpURLConnection	connection = (HttpURLConnection) url.openConnection();
				//HttpURLConnection	connection = (HttpURLConnection)new URL(linkURL).openConnection();
				connection.setRequestMethod("HEAD");
				connection.connect();
				int resCode = connection.getResponseCode();
				System.out.println(resCode);
				a.assertTrue(resCode<400, "The link with Text"+linkURL+" is broken with code" +resCode);
			}
			
			/*if(resCode>400) {
				System.out.println("Link "+url+" with text is broken with code : "+resCode);
				Assert.assertTrue(false, "Link is broken");
			}*/
			
		}
		
		a.assertAll();
	}

}
