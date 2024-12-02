package introductionSelenumWD.datePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class DatePickerDemo_1 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		// Using send keys method
		
		driver.switchTo().frame(0); // since date picker is inside single frame in page
		
		//driver.findElement(By.id("datepicker")).sendKeys("11/26/2024");
		
		// Using Date picker calendar value selector
		//Define the date value to be selected in string format
		
		//Expected data
		String year = "2026" ;
		String month = "April";
		String date = "15";
		
		//Click on Date picker field to open the calendar
			driver.findElement(By.id("datepicker")).click();
		//Get month and year element from date picker
		while(true) {
		String currentMonth = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();
		String currentYear = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
			if(currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
		//If above month and year is not matching then click on next icon to move to next month
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Next
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Previous for fast dates
		}
		List <WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
			for (WebElement day : dates) {
				if(day.getText().equals(date)) {
					day.click();
					break;
				}
			}
		
	}

}
