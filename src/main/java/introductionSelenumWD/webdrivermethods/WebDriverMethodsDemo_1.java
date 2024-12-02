package introductionSelenumWD.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverMethodsDemo_1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver(); 
		
		//get method returns void and takes 1 parameter
		driver.get("https://awesomeqa.com/ui/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(" TItle of Page : "+title);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL "+currentURL);
		
		String pageSource = driver.getPageSource();
		System.out.println("\n Page source    : "+pageSource);
		
		String windowID = driver.getWindowHandle();
		System.out.println(" \n Window Handle ID   "+windowID);
		
		driver.getWindowHandles();
		
		driver.close();

	}

}
