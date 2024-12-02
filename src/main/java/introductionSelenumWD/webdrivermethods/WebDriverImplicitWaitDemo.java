package introductionSelenumWD.webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverImplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit wait
		
		driver.close();

	}

}
