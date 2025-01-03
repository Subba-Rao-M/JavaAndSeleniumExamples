package introductionSelenumWD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTestDemo_1 {

	public static void main(String[] args) {
		System.out.println("Test");
		
		//ChromeDriver driver = new ChromeDriver(); //Can store only chrome browser variable and methods
		WebDriver driver = new EdgeDriver(); //Valid child storing in parent and other browser also can be stored here
		driver.get("https://www.opencart.com/");
		String Title = driver.getTitle();
		System.out.println(Title);
		if(Title.equals("Your Store")) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		driver.quit();
		
	}

}
