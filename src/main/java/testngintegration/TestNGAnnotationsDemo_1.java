package testngintegration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/***
 * Login -- @BeforeMethod
 * Search - @Test
 * LogOut - @AfterMethod
 * Login
 * Adv Search -- @Test
 * LogOut
 */
		
public class TestNGAnnotationsDemo_1 {
	@BeforeMethod
	void login() {
		System.out.println("Login Method");
	}
	
	@AfterMethod
	void Logout() {
		System.out.println("Logout Method");
	}
	
	@Test
	void search() {
		System.out.println("Search Method");
	}
	
	@Test
	void advsearch() {
		System.out.println("Advance Search Method");
	}
	
	/**
	 * In console window and testng tree see only test methods are considered
	 * other annotations are not considered, login and logout considered as entry and exit for test cases
	 * only in test methods validations are added
	 */

}
