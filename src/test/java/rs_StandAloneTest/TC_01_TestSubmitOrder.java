package rs_StandAloneTest;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import rs_PageObjects.CartPage;
import rs_PageObjects.CheckOutPage;
import rs_PageObjects.ConfirmationPage;
import rs_PageObjects.LandingPage;
import rs_PageObjects.ProductCataloguePage;
import rs_TestComponents.BaseTest;

public class TC_01_TestSubmitOrder extends BaseTest {
	
	public static void main(String[] args)  {
	String productName = "IPHONE 13 PRO";
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	//WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	LandingPage landingPage = new LandingPage(driver);
	landingPage.goTo();
	ProductCataloguePage productCataloguePage=landingPage.loginApplication("subbaraw@gmail.com", "Span@1234");
	
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
	driver.close();
	}
}
