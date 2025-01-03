package introductionSelenumWD;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTestDemo_2 {

	public static void main(String[] args) {
		//Invoking Browser

		//Chrome - ChromeDriver exten->Methods close get

		//Firefox- FirefoxDriver ->methods close get

		// WebDriver interface and chromedriver and firefox drvier classes implemented the interface methods  close  get 

		//WebDriver methods + class methods present for each driver specific classes
		//Class specific methods will not work for other classes


		// Chrome

		         ChromeOptions options = new ChromeOptions();

		         options.addArguments("--remote-allow-origins=*");

		//System.setProperty("webdriver.chrome.driver", "path/Documents/chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);




		//Firefox

		//System.setProperty("webdriver.gecko.driver", "path/Documents/geckodriver.exe");

		WebDriver driver1 = new FirefoxDriver();



		//Microsoft Edge

		//System.setProperty("webdriver.edge.driver", "path/Documents/msedgedriver");

		WebDriver driver2 = new EdgeDriver();






		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();

		//driver.quit();


	}

}
