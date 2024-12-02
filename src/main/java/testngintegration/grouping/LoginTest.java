package testngintegration.grouping;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority=1, groups = {"sanity"})
	void testLoginByEmail() {
		System.out.println("testLoginByEmail");
	}
	
	@Test(priority=2, groups = {"sanity"})
	void testLoginByFB() {
		System.out.println("testLoginByFB");
	}
	
	@Test(priority=3, groups = {"sanity"})
	void testLoginByGH() {
		System.out.println("testLoginByGH");
	}
}
