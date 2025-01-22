package rs_PageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import rs_AbstractComponents.AbstractComponent;

public class CheckOutPage extends AbstractComponent {

	WebDriver driver;
	
	@FindBy(xpath="//button[contains(@class, 'ta-item')][2]")
	WebElement selectCountry;
	
	@FindBy(css="[placeholder='Select Country']")
	WebElement ddCountry;
	
	@FindBy(css=".action__submit")
	WebElement btnPlaceOrder;
	
	By ddFilteredResult = By.cssSelector(".ta-results");
	
	public CheckOutPage(WebDriver driver) {	
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public void selectCountry(String countryName) {
	Actions a = new Actions(driver);
	a.sendKeys(ddCountry, countryName).build().perform();
	waitForElementToAppear(ddFilteredResult);
	selectCountry.click();
	

	}
	
	public ConfirmationPage submitOrder() {
		btnPlaceOrder.click();
		return new ConfirmationPage(driver);
	}
}
