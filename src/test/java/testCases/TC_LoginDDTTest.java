package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

/*Data is valid  - login success - test pass  - logout
	login failed - test fail

Data is invalid - login success - test fail  - logout
	login failed - test pass
*/

public class TC_LoginDDTTest extends BaseClass {
	
	@Test(dataProvider="LoginData", dataProviderClass= DataProviders.class, groups="DataDriven")
	public void verify_login(String email, String pwd, String exp) throws InterruptedException {
		try {
		logger.info("*** TC_LoginDDTTest -- Start");
		HomePage hp = new HomePage(driver);
		logger.info("Click on My Account");
		hp.clickMyAccount();
		logger.info("Click on Login Link");
		hp.clickLogin();
		
		logger.info("Enter user name and password");
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		logger.info("Click on Login Button");
		lp.clickLogin();
		
		
		MyAccountPage map = new MyAccountPage(driver);
		boolean targetPage = map.isMyAccountPageExists();
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetPage==true)
			{			
				map.clickLogOut();
				Assert.assertTrue(true);
				logger.info("*** TC_LoginTest -- Pass");
			}
			else
			{
				Assert.assertTrue(false);
				logger.info("*** TC_LoginTest -- Fail");
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetPage==true)
			{
				map.clickLogOut();
				Assert.assertTrue(false);
				logger.info("*** TC_LoginTest -- Fail");
			}
			else
			{
				Assert.assertTrue(true);
				logger.info("*** TC_LoginTest -- Pass");
			}
		}
		
		}
		catch(Exception e) {
			logger.info("*** TC_LoginTest -- Failed due to exception");
			Assert.fail();
		}
		Thread.sleep(3000);
		logger.info("*** TC_LoginDDTTest -- End");
	}


}
