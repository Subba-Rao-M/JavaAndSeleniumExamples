package rs_StandAloneTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import rs_PageObjects.CartPage;
import rs_PageObjects.CheckOutPage;
import rs_PageObjects.ConfirmationPage;

import rs_PageObjects.OrderPage;
import rs_PageObjects.ProductCataloguePage;
import rs_TestComponents.BaseTest;

public class TC_02_TestSubmitOrderUpdated extends BaseTest {
	String productName = "IPHONE 13 PRO";
	@Test(dataProvider="getData", groups= {"Purchase"})
	public void testSubmitOrder(String email, String password, String productName) throws IOException {
	
	//LandingPage landingPage = launchApplication(); //Initialized in parent class with public variable and before method options
	
	ProductCataloguePage productCataloguePage=landingPage.loginApplication(email, password);
	
	//ProductCataloguePage productCataloguePage = new ProductCataloguePage(driver);
	productCataloguePage.getProductList();
	productCataloguePage.getProductByName(productName);
	productCataloguePage.addProductToCart(productName);
	CartPage cartPage =productCataloguePage.goToCartPage();
	
	//CartPage cartPage = new CartPage(driver);
	boolean match= cartPage.verifyProductDisplay(productName);
	Assert.assertTrue(match);
	
	CheckOutPage checkOutPage = cartPage.goToCheckOutPage();
	checkOutPage.selectCountry("india");
	ConfirmationPage confirmationPage = checkOutPage.submitOrder();
	String confirmMessage = confirmationPage.getConfirmationMessage();
	confirmMessage.equalsIgnoreCase("Thankyou for the order.");
	Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));

	}
	
	@Test(dependsOnMethods= {"testSubmitOrder"}, dataProvider="getData", groups= {"Purchase"})
	public void OrderHistoryTest(String email, String password, String productName)
	{
		//"ZARA COAT 3";
		ProductCataloguePage productCataloguePage=landingPage.loginApplication(email, password);
		OrderPage ordersPage = productCataloguePage.goToOrdersPage();
		Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));
		
	}
	
	@DataProvider()
	public Object[][] getData() {
		return new Object[][] {{"subbaraw@gmail.com", "Span@1234", "IPHONE 13 PRO"}, {"subbaraw@gmail.com", "Span@1234", "QWERTY"}};
		
	}
}
