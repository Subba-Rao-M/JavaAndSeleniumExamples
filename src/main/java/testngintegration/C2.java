package testngintegration;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {
	
	@BeforeSuite
	void bs() {
		System.out.println("Before test suite");
	}
	@AfterSuite
	void as() {
		System.out.println("After test suite");
	}
	
	@Test
	void test2() {
		System.out.println("test2");
	}

}
