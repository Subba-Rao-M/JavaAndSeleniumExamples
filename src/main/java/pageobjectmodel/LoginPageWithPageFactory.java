package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
	
	//This is with using PageFactory
	WebDriver driver; 
	//Constructor
	LoginPageWithPageFactory(WebDriver driver){ 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	
	
	@FindBy(xpath= "//input[@placeholder ='Username']") WebElement txt_username_loc;
	@FindBy(xpath="//input[@placeholder ='Password']") WebElement txt_password_loc;
	@FindBy(xpath="//button[@type='submit']") WebElement btn_login_loc;
	@FindBy(tagName = "a") List<WebElement> lists;
	//Single or group of elements can be found by using find by
	//Another way to identify the fields using find by and how class
	//@FindBy(how = How.XPATH, using="//input[@placeholder ='Username']") WebElement txt_username_loc1;
	//Action Methods
	
	public void setUserName(String user) {
		txt_username_loc.sendKeys(user);
	}
	
	public void setPassword(String pwd) {
		txt_password_loc.sendKeys(pwd);
	}
	
	public void clickLogin() {
		 btn_login_loc.click();
	}

}
