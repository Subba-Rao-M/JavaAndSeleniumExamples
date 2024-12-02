package testngintegration.AssertsionsDemo;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo_1 {
	
	@Test
	void testAsert() {
		System.out.println("First line");
		System.out.println("Next line");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false); //soft Assertion
		System.out.println("Last line");
		System.out.println("Next line");
		sa.assertAll(); //To make test case fail if any test step is failed
	}

}
