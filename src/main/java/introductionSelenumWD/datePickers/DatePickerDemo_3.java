package introductionSelenumWD.datePickers;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo_3 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver(); 
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("SelectedDate")).click();
	selectDateValue(driver, "2026", "Apr", "15");	
}

static void selectDateValue(WebDriver driver, String expYear, String expmonth, String expdate ) throws InterruptedException {
	
	//Select year from drop down
	
		WebElement yearDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select yearValue = new Select(yearDD);
		yearValue.selectByVisibleText(expYear);
		Thread.sleep(3000);
		//Check the month and select required month value
		//Get the current month and compare if the required value is greater than or less than current month to select
		
		while(true) {
			
		String curMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']//option[@selected = \"selected\"]")).getText();
		//convert display month and expected month to Month ojects
		System.out.println(curMonth);
		Month expectedMonth = convertMonth(expmonth);
		Month currentMonth = convertMonth(curMonth);
		
		//Compare both values
		
		int result = expectedMonth.compareTo(currentMonth);
		System.out.println(result);
		
		/**
		 * 0 = both equal
		 * 0 > current month - future month
		 * 0< current month -- past month
		 * 
		 */
		
		if(result < 0) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		else if (result > 0) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		else 
		{
			break;
		}
	}
		
		//Select date
		
		List <WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
		for (WebElement day : dates) {
			if(day.getText().equals(expdate)) {
				day.click();
				break;
			}
		}
	
}

	//Months cannot be compared as string as it considers alphabetical order so need to convert month value to object
	
	static Month convertMonth(String month) {
		
		HashMap<String, Month> monthMap = new HashMap<String, Month> ();
		
		monthMap.put("Jan", Month.JANUARY);
		monthMap.put("Feb",Month.FEBRUARY);
		monthMap.put("Mar",Month.MARCH);
		monthMap.put("Apr",Month.APRIL);
		monthMap.put("May",Month.MAY);
		monthMap.put("Jun",Month.JUNE);
		monthMap.put("Jul",Month.JULY);
		monthMap.put("Aug",Month.AUGUST);
		monthMap.put("Sep",Month.SEPTEMBER);
		monthMap.put("Oct",Month.OCTOBER);
		monthMap.put("Nov",Month.NOVEMBER);
		monthMap.put("Dec",Month.DECEMBER);
		
		Month vmonth = monthMap.get(month); // To get the month object for string value passed for key value
		
		if(vmonth == null){
			System.out.println("***Enter valid Month: ***");
		}
		
		return vmonth; //Return month object
	}
}
