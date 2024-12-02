package testngintegration.AssertsionsDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo_1 {
	@Test
	void testAsert() {
		Assert.assertEquals("Subba", "Subba");
		Assert.assertEquals(123, 123);
		Assert.assertNotEquals("Subba", 123);
		Assert.assertNotEquals("Subba", "123");
		//Can be used to compare numbers, strings, boolean values,etc
		
		Assert.assertTrue(true);
		Assert.assertFalse(false, "Test -ve passed");
		
		Assert.assertTrue(1==1);
		Assert.assertFalse(1==2);
		
		//To directly fail the test method
		Assert.fail();
		
		//All hard assertion methods are static methods so can be directly called using Assert class
	}

}
