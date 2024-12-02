package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_LoginTest extends BaseClass {
	
	@Test(groups={"Sanity","Master"})
	public void verify_login() {
		try {
			
		
		logger.info("*** TC_LoginTest -- Start");
		HomePage hp = new HomePage(driver);
		logger.info("Click on My Account");
		hp.clickMyAccount();
		logger.info("Click on Login Link");
		hp.clickLogin();
		
		logger.info("Enter user name and password");
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(prop.getProperty("email"));
		lp.setPassword(prop.getProperty("password"));
		logger.info("Click on Login Button");
		lp.clickLogin();
		logger.info("Check if My Account page loaded");
		
		MyAccountPage map = new MyAccountPage(driver);
		Assert.assertTrue(map.isMyAccountPageExists(), "Login Failed");
		logger.info("*** TC_LoginTest -- Pass");
		}
		catch(Exception e) {
			logger.info("*** TC_LoginTest -- Failed");
			Assert.fail();
		}
		
		logger.info("*** TC_LoginTest -- End");
	}

}
