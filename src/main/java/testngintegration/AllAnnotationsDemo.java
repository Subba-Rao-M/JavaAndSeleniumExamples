package testngintegration;

import org.testng.annotations.*;

public class AllAnnotationsDemo {
	@BeforeMethod
	void login() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	void Logout() {
		System.out.println("After Method");
	}
	
	@Test
	void search() {
		System.out.println("Search Method");
	}
	
	@Test
	void advsearch() {
		System.out.println("Advance Search Method");
	}
	
	@BeforeClass
	void bc() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	void ac() {
		System.out.println("After Class");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("Before test");
	}
	@AfterTest
	void at() {
		System.out.println("After test");
	}
	@BeforeSuite
	void bs() {
		System.out.println("Before test suite");
	}
	@AfterSuite
	void as() {
		System.out.println("After test suite");
	}
	

}
