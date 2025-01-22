package rs_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rs_AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userEmail")
	WebElement txtUserEmail;
	
	@FindBy(id="userPassword")
	WebElement txtUserPassword;
	
	@FindBy(id="login")
	WebElement btnLogin;
	
	@FindBy(css="[class*='flyInOut']")
	WebElement msgError;
	
	public ProductCataloguePage loginApplication(String email, String password) {
		txtUserEmail.sendKeys(email);
		txtUserPassword.sendKeys(password);
		btnLogin.click();
		return new ProductCataloguePage(driver);
	}
	
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	public String getLoginErrorMessage() {
		waitForWebElementToAppear(msgError);
		String loginErrorMessage = msgError.getText();
		return loginErrorMessage;
	}
}
