package browserDevTools;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v115.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDevTools_EmulateDevice {
	/**
	 * After Selenium 4
	 * Can call console logs
	 * can listen api calls
	 * Chrome dev tool protocol(CDP) - provide tools to inspect 
	 * Selenium has written wrapper around CDP methods
	 * Mocking the response is possible
	 * Inject session cookies for login
	 * Using CDP can emulate browser view
	 * 
	 * Uses: 
	 * Capture, monitor and stub network request and responses
	 * Inject session cookies and perform basic auth
	 * Mock device coordinates for mobile/tab view
	 * Check and monitor sites performance
	 * Mock geo location of the user
	 * Block the network requests
	 * Mock faster/slower network speeds
	 * Execute and debug java scripts
	 * 
	 * Chromium driver has pre defined methods to access to dev tools
	 * Chrome and edge driver are inherited from chromium driver
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws InterruptedException {
		
		//Initiate chrome driver
	
		ChromeDriver driver = new ChromeDriver();
		
		//Create object for devtools using driver
		
		DevTools devTools= driver.getDevTools();
		
		//Create session using dev tools
		devTools.createSession();
		
		//Send commands to CDP methods - > CDP method will get access to chrome dev tools
		//Refer for commands in https://chromedevtools.github.io/devtools-protocol/tot/Emulation/
		
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty()));
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".navbar-toggler")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Library")).click();
		
		driver.close();

	}

}
