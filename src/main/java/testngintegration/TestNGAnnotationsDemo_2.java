package testngintegration;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/***
 * Login -- @BeforeClass
 * Search - @Test
 * Adv Search -- @Test
 * LogOut - @AfterClass
 *
 *Search and Adv Search are part of test methods in test classes
 */
		
public class TestNGAnnotationsDemo_2 {
	@BeforeClass
	void login() {
		System.out.println("Login Method - Before Class");
	}
	
	@AfterClass
	void Logout() {
		System.out.println("Logout Method - After Class");
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
	 * Other than Test annotations remaining will participate in execution and not in result
	 * Afterclass or Aftermethod is not mandatory only before can be used
	 * It depends on test case scenarios
	 * Beforemethod and class can be used in class level
	 * Beforetest and suite should have more than 1 test cases
	 */

}
