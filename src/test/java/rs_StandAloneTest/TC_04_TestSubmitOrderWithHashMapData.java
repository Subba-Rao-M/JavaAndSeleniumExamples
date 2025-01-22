package rs_StandAloneTest;

import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import rs_PageObjects.CartPage;
import rs_PageObjects.CheckOutPage;
import rs_PageObjects.ConfirmationPage;
import rs_PageObjects.OrderPage;
import rs_PageObjects.ProductCataloguePage;
import rs_TestComponents.BaseTest;

public class TC_04_TestSubmitOrderWithHashMapData extends BaseTest {
	String productName = "IPHONE 13 PRO";
	@Test(dataProvider="getData", groups= {"Purchase"})
	public void testSubmitOrder(HashMap<String, String> input) throws IOException {
	
	//LandingPage landingPage = launchApplication(); //Initialized in parent class with public variable and before method options
	
	ProductCataloguePage productCataloguePage=landingPage.loginApplication(input.get("email"), input.get("password"));
	
	//ProductCataloguePage productCataloguePage = new ProductCataloguePage(driver);
	productCataloguePage.getProductList();
	productCataloguePage.getProductByName(input.get("productName"));
	productCataloguePage.addProductToCart(input.get("productName"));
	CartPage cartPage =productCataloguePage.goToCartPage();
	
	//CartPage cartPage = new CartPage(driver);
	boolean match= cartPage.verifyProductDisplay(input.get("productName"));
	Assert.assertTrue(match);
	
	CheckOutPage checkOutPage = cartPage.goToCheckOutPage();
	checkOutPage.selectCountry("india");
	ConfirmationPage confirmationPage = checkOutPage.submitOrder();
	String confirmMessage = confirmationPage.getConfirmationMessage();
	confirmMessage.equalsIgnoreCase("Thankyou for the order.");
	Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));

	}
	
	@Test(dependsOnMethods= {"testSubmitOrder"}, dataProvider="getData", groups= {"Purchase"})
	public void OrderHistoryTest(HashMap<String, String> input)
	{
		//"ZARA COAT 3";
		ProductCataloguePage productCataloguePage=landingPage.loginApplication(input.get("email"), input.get("password"));
		OrderPage ordersPage = productCataloguePage.goToOrdersPage();
		Assert.assertTrue(ordersPage.VerifyOrderDisplay(input.get("productName")));
		
	}
	
	@DataProvider()
	public Object[][] getData() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", "subbaraw@gmail.com");
		map.put("password", "Span@1234");
		map.put("productName", "IPHONE 13 PRO");
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("email", "subbaraw@gmail.com");
		map1.put("password", "Span@1234");
		map1.put("productName", "QWERTY");
		return new Object[][] {{map}, {map1}};
		
	}
}
