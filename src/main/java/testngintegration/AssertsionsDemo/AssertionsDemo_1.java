package testngintegration.AssertsionsDemo;
import org.testng.Assert;
import org.testng.annotations.*;
public class AssertionsDemo_1 {
	
	@Test
	void testTitle() {
		String exp_title = "OpenCart";
		String act_title = "OpenShop";
		
		if(exp_title.equals(act_title)) {
			System.out.println("Test passed");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
	}
	/***
	 * Test failed printed in console but testng test case is passed considering execution of test method
	 * To overcome this assertions from Assert class should be used in tesng test cases
	 * Assertions will fail the test cases which is not done by conditional statement
	 * Assertions can be used along with conditional statement
	 */

}
