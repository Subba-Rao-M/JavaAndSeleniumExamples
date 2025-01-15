package rsUdemyCourse;


import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
public class TC_24_HandleSSLError_Demo_1 {

public static void main(String[] args) {

	EdgeOptions options = new EdgeOptions();
	options.setAcceptInsecureCerts(true);
	//options.addExtensions();
	//Proxy proxy = new Proxy();
	//Proxy httpProxy = proxy.setHttpProxy("");
	//options.setCapability("proxy", httpProxy);
	//Block popups
	//Set download directory path to download the file from automation script
	
	WebDriver driver = new EdgeDriver(options);
	driver.get("https://expired.badssl.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies(); // delete all or specific cookie using manage options or add cookies
	//After delete cookie session should be logged out and user should be navigated to home page if done in between steps
	System.out.println(driver.getTitle());
	driver.close();


}

}