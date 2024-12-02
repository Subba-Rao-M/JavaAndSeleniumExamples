package introductionSelenumWD.alertspopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


/***
 * http://the-internet.herokuapp.com/basic_auth
 * Inject the user name and password in url
 * http://username:password@the-internet.herokuapp.com/basic_auth
 * 
 *
 */

public class AuthenticatedPopup {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver(); 
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		driver.close();
		
		

	}

}
