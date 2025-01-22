package rs_PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import rs_AbstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent{
	
	WebDriver driver;
	
	@FindBy(css=".cartSection h3")
	List <WebElement> titlesOfCartProduct;
	
	@FindBy(css=".totalRow button")
	WebElement btnCheckOut;
	
	public CartPage(WebDriver driver) {	
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyProductDisplay(String productName) {
		boolean match = titlesOfCartProduct.stream().anyMatch(cartProd->cartProd.getText().equals(productName));
		return match;
	}
	
	public CheckOutPage goToCheckOutPage() {
		btnCheckOut.click();
		return new CheckOutPage(driver);
	}
	
	
}
