package rsUdemyCourse;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class TC_25_WebTableSortingUsingJavaStreams_Demo_1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on Web Table first column header to sort first
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//Capture all web elements into list for first column
		List <WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		//Capture text of all web elements captured above
		List <String> originalListValues = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(originalListValues);
		//Sort the values from list captured
		List <String> sortedListValues  = originalListValues.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedListValues);
		Assert.assertTrue(originalListValues.equals(sortedListValues));
			
		//To get the price for an element  value which is present in next column example for selected vegetable price
		List <String> price ;
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getVegPrice(s)).collect(Collectors.toList());
			price.stream().forEach(s->System.out.println(s));
		//Click on Next button
			if(price.size()<1){
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while(price.size()<1);
		
		driver.quit();
	}

	private static String getVegPrice(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}
}
