package introductionSelenumWD.browseroptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserOptionsDemo_1 {

	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		//options.addArguments("--headless=new");
		options.setAcceptInsecureCerts(true);
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		options.addArguments("--incognito");
		
		WebDriver driver = new EdgeDriver(options); 
		
		driver.get("https://www.opencart.com/");
		String Title = driver.getTitle();
		System.out.println(Title);
		if(Title.equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		driver.quit();
		

	}

}
