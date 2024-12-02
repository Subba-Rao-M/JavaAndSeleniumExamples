package introductionSelenumWD.datePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePickerDemo_2 {
	
static void selectMonthAndYear(WebDriver driver, String year, String month) {
	while(true) {
		String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Previous for fast dates
	
	}
}

static void selectDate(WebDriver driver, String date) {
	List <WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
	for (WebElement day : dates) {
		if(day.getText().equals(date)) {
			day.click();
			break;
		}
	}
}

static void selectFastDate(WebDriver driver, String year, String month, String date) {
	while(true) {
		String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Previous for fast dates
		}
		List <WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
		for (WebElement day : dates) {
			if(day.getText().equals(date)) {
				day.click();
				break;
			}
		}
		
	
}
	public static void main(String[] args) {
		
		
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0); // since date picker is inside single frame in page
		String year = "2025" ;
		String month = "April";
		String date = "15";
			
		driver.findElement(By.id("datepicker")).click();
		selectMonthAndYear(driver, year, month);
		selectDate(driver, date);
		driver.findElement(By.id("datepicker")).click();
		selectFastDate(driver, "2023", "April", "25");
		
		}
}
