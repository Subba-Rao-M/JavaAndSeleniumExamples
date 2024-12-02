package testngintegration.grouping;

import org.testng.annotations.Test;

public class PaymentsTest {
	
	@Test(priority=1, groups = {"sanity", "regression", "functional"})
	void testpaymentInRupees() {
		System.out.println("testpaymentInRupees");
	}
	
	@Test(priority=2, groups = {"sanity", "regression", "functional"})
	void testpaymentInDollars() {
		System.out.println("testpaymentInDollars");
	}

}
