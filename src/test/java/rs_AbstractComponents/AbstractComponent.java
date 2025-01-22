package rs_AbstractComponents;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import rs_PageObjects.CartPage;
import rs_PageObjects.OrderPage;

public class AbstractComponent {
	WebDriver driver;
	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="[routerlink*='cart']")
	WebElement lnkCart;
	
	@FindBy(css = "[routerlink*='myorders']")
	WebElement lnkOrder;
	
	public void waitForElementToAppear(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitForWebElementToAppear(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOf(we));
	}
	public void waitForElementToDisappear(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(we));
	}

	
	
	/***
	 * Common headers in application
	 * @return 
	 */
	
	public CartPage goToCartPage() {
		lnkCart.click();
		return new CartPage(driver);
	}
	
	public OrderPage goToOrdersPage()
	{
		lnkOrder.click();
		OrderPage orderPage = new OrderPage(driver);
		return orderPage;
	}
}
