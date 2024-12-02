package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_AccountRegistrationTest extends BaseClass {


	
	@Test(groups={"Regression","Master"})
	public void verify_Account_Registration() {
		logger.info("Starting test case *** verify_Account_Registration *** ");
		try {
		
		HomePage hp = new HomePage(driver);
		logger.info("Home Page -- > Click on My Account");
		hp.clickMyAccount();
		logger.info("Home Page -- > Click on Register Account");
		hp.clickRegister();
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		logger.info("Register Account Page -- > Start Entering registration details");
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString()+"@email.com");
		regpage.setTelePhone(randomNumber());
		String pwd = randomAlpaNum()+"$";
		regpage.setPassword(pwd);
		regpage.setConfirmPassword(pwd);
		regpage.setPrivacyPolicy();
		logger.info("Register Account Page -- > End Entering registration details");
		regpage.clickContinue();
		logger.info("Register Account Page -- > End Entering registration details");
		String actmsg = regpage.getConfirmationMsg();
		logger.info("validating expected message");
		if(actmsg.equals("Your Account Has Been Created!")) {
			Assert.assertTrue(true);
			logger.info("Test Case Passed");
		}
		else {
			logger.info("Test Case Failed");
			logger.debug("Debug Logs");
			Assert.assertTrue(false);
		}
		
		
	
	}
	catch(Exception e) {
	
		Assert.fail();
	}
	logger.info("Ending test case *** verify_Account_Registration *** ");
	
	}
	
}
