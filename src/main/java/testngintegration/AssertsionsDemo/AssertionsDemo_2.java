package testngintegration.AssertsionsDemo;
import org.testng.Assert;
import org.testng.annotations.*;
public class AssertionsDemo_2 {
	
	@Test
	void testTitle() {
		String exp_title = "OpenCart";
		String act_title = "OpenShop";
		Assert.assertEquals(exp_title, act_title);
		
	}
	

}
