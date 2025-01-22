package rs_StandAloneTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import rs_PageObjects.CartPage;
import rs_PageObjects.ProductCataloguePage;
import rs_TestComponents.BaseTest;
import rs_TestComponents.Retry;

public class TC_03_TestErrorValidations extends BaseTest {
	
	/**
	 * Create module specific test cases related to error messages in one test case
	 * Club page specific all validations in one test case
	 * club happy flows related to 1 module in one test case
	 * @throws IOException
	 */
	
	@Test(groups= {"ErrorHandling"})
	public void testInValidLoginForErrorMessage() throws IOException {
	landingPage.loginApplication("subbaraw@gmail.com", "Span@12345");
	Assert.assertEquals(landingPage.getLoginErrorMessage(), "Incorrect email or password.");
	}
	
	@Test(groups= {"ErrorHandling"}, retryAnalyzer=Retry.class) //Add retry option only for flaky test cases
	public void testSubmitOrderWithInvalidProduct() throws IOException {
	String productName = "IPHONE 13 PRO";
	ProductCataloguePage productCataloguePage=landingPage.loginApplication("subbaraw@gmail.com", "Span@1234");
	productCataloguePage.getProductList();
	productCataloguePage.getProductByName(productName);
	productCataloguePage.addProductToCart(productName);
	CartPage cartPage =productCataloguePage.goToCartPage();
	boolean match= cartPage.verifyProductDisplay("ZARA COAT 3");
	Assert.assertTrue(match);
	}
}
