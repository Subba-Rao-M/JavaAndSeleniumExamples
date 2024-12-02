package testngintegration;

import org.testng.annotations.Test;

public class FirstTestngTestCase {
	
	@Test(priority=1)
	void openapp() {
		System.out.println(" Open App");
		
	}
	
	
	@Test(priority=3)
	void logout() {
		System.out.println(" Logout from App");
	}
	//Order of test method is not considered when priority is given, based on priority value test method executes
	@Test(priority=2)
	void login() {
		System.out.println(" Login to App");
	}
}
