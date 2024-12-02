package cIAndCD;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridDemo {
	
	//Start the selenium grid before running the program

	public static void main(String[] args) throws MalformedURLException {
		
		//HUB URL localhost or ip address of hub machine
		String hubURL= "http://localhost:4444/wd/hub";
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WIN11); //For mac or linux machine configure here
		cap.setBrowserName("MicrosoftEdge");
		
		//convert the hub url to URL format
		WebDriver driver = new RemoteWebDriver(new URL(hubURL), cap);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
