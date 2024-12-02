package introductionSelenumWD.browseroptions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class EnableExtentiosDemo {

	public static void main(String[] args) {
		/**
		 * Add CRX Extractor/downloader manually in chrome browser
		 * Add selectors hub manually
		 * Capture crx extractor for selectors hub
		 * Pass crx file path in chrome browser options
		 */
		
		ChromeOptions options = new ChromeOptions();
		File file = new File("C:\\automation\\crx files\\selectorshub.crx"); //Enter valid path here
		options.addExtensions(file);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
	}

}
