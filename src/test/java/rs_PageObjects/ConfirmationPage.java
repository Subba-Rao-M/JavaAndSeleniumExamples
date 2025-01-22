package rs_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rs_AbstractComponents.AbstractComponent;

public class ConfirmationPage extends AbstractComponent{
	WebDriver driver;
	
	@FindBy(css=".hero-primary")
	WebElement msgConfirmation;
	
	public ConfirmationPage(WebDriver driver) {	
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getConfirmationMessage() {
		String confirmMessage = msgConfirmation.getText();
		return confirmMessage;
	}
	
	

}
