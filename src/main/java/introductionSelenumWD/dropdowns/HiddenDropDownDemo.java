package introductionSelenumWD.dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		//Selectors hub use turn on debug option and when screen freezed go to elements and inspect element
		//Another option in chrome browser event listener seach for blur option and remove it to get fieldss
		
		//Click on drop down
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]")).click();
		
		//To select the value
		//driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		
		Thread.sleep(3000);
		//To count number of options in drop down
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("Option lenght : "+options.size());
		
		
		for(WebElement op : options) {
			System.out.println(op.getText());
		}
		
	}

}
