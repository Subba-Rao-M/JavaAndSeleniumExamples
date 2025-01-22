package rs_PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import rs_AbstractComponents.AbstractComponent;

public class ProductCataloguePage  extends AbstractComponent {
	WebDriver driver;
	
	@FindBy(css=".mb-3")
	List <WebElement> listOfProducts;
	
	@FindBy(css=".ng-animating")
	WebElement spinner;

	
	By productsBy = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.cssSelector("#toast-container");
	
	public ProductCataloguePage(WebDriver driver) {	
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public List<WebElement> getProductList() {
		waitForElementToAppear(productsBy);
		return listOfProducts;
	}
	
	public WebElement getProductByName(String productName) {
		WebElement prod = getProductList().stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		return prod;
	}
	
	public void addProductToCart(String productName) {
		WebElement prod = getProductByName(productName);
		prod.findElement(addToCart).click();
		//page factory cannot be applied within webelement
		waitForElementToAppear(toastMessage);
		waitForElementToDisappear(spinner);
	}


}
