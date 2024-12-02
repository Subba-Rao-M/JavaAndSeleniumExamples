package introductionSelenumWD.datePickers;
import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo_3_3 {

    private static final Map<String, Month> MONTH_MAP = createMonthMap();

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://testautomationpractice.blogspot.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
            driver.findElement(By.name("SelectedDate")).click();
            selectDateValue(driver, "2026", "Apr", "15");
        } finally {
            driver.quit();
        }
    }

    private static void selectDateValue(WebDriver driver, String expYear, String expMonth, String expDate) {
        selectYear(driver, expYear);
        selectMonth(driver, expMonth);
        selectDay(driver, expDate);
    }

    private static void selectYear(WebDriver driver, String expYear) {
        WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        new Select(yearDropdown).selectByVisibleText(expYear);
    }

    private static void selectMonth(WebDriver driver, String expMonth) {
        Month expectedMonth = convertMonth(expMonth);
        
        while (true) {
            String curMonthText = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']//option[@selected = \"selected\"]")).getText();
            System.out.println("\n curMonthText -----> "+curMonthText);
            Month currentMonth = convertMonth(curMonthText);
            System.out.println(currentMonth);
            
            if (currentMonth == null || expectedMonth == null) {
            	System.out.println(currentMonth + "<--------->"+expectedMonth);
                System.err.println("Invalid month specified.");
                return;
            }

            int comparison = expectedMonth.compareTo(currentMonth);

            if (comparison < 0) {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            } else if (comparison > 0) {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            } else {
                break;
            }
        }
    }

    private static void selectDay(WebDriver driver, String expDate) {
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
        for (WebElement day : dates) {
            if (day.getText().equals(expDate)) {
                day.click();
                break;
            }
        }
    }

    private static Month convertMonth(String month) {
        return MONTH_MAP.get(month);
    }

    private static Map<String, Month> createMonthMap() {
        Map<String, Month> monthMap = new HashMap<>();
        monthMap.put("Jan", Month.JANUARY);
        monthMap.put("Feb", Month.FEBRUARY);
        monthMap.put("Mar", Month.MARCH);
        monthMap.put("Apr", Month.APRIL);
        monthMap.put("May", Month.MAY);
        monthMap.put("Jun", Month.JUNE);
        monthMap.put("Jul", Month.JULY);
        monthMap.put("Aug", Month.AUGUST);
        monthMap.put("Sep", Month.SEPTEMBER);
        monthMap.put("Oct", Month.OCTOBER);
        monthMap.put("Nov", Month.NOVEMBER);
        monthMap.put("Dec", Month.DECEMBER);
        return monthMap;
    }
}
