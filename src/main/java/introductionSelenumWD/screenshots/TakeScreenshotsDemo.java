package introductionSelenumWD.screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TakeScreenshotsDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Capture full page screenshot
		
		TakesScreenshot ts = (TakesScreenshot) driver; 
		// TakesScreenshot ts =  driver; // for EdgeDriver instead of web driver
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile); //copy the source file to target 
		
		//Capture screenshot for specific version
		WebElement el =driver.findElement(By.xpath("//*[@id=\"carousel0\"]"));
		File sourcefile1 = el.getScreenshotAs(OutputType.FILE);
		File targetfile1 = new File(System.getProperty("user.dir")+"\\screenshots\\specificarea.png");
		sourcefile1.renameTo(targetfile1); 
		
		//Take Screenshot of specific element

		WebElement logo =driver.findElement(By.xpath("//img[@title='TheTestingAcademy eCommerce']"));
		File sourcefile2 = logo.getScreenshotAs(OutputType.FILE);
		File targetfile2 = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		sourcefile2.renameTo(targetfile2);
		
	}

}
