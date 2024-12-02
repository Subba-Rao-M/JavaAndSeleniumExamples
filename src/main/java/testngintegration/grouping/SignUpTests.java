package testngintegration.grouping;

import org.testng.annotations.Test;

public class SignUpTests {
	
	@Test(priority=1, groups = {"regression"})
	void testSignUpByEmail() {
		System.out.println("testSignUpByEmail");
	}
	
	@Test(priority=2, groups = {"regression"})
	void testLSignUpByFB() {
		System.out.println("testLSignUpByFB");
	}
	
	@Test(priority=3, groups = {"regression"})
	void testSignUpByGH() {
		System.out.println("testSignUpByGH");
	}
}
