package introductionSelenumWD.javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;

public class ZoomBrowserDemo_1 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		//driver.manage().window().minimize();
		JavascriptExecutor js =  driver;
		
		js.executeScript("document.body.style.zoom='50%'");
	

	}

}
