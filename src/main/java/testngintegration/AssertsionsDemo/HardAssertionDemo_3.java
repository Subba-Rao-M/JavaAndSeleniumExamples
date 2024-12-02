package testngintegration.AssertsionsDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo_3 {
	
	@Test
	void testAsert() {
		System.out.println("First line");
		System.out.println("Next line");
		Assert.assertTrue(false); //hard Assertion
		System.out.println("Last line");
		System.out.println("Next line");
	}

}
