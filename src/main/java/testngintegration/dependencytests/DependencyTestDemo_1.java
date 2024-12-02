package testngintegration.dependencytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestDemo_1 {
	@Test(priority=1)
	void testOpenApp() {
		Assert.assertTrue(true);
	}
	@Test(priority=2, dependsOnMethods= {"testOpenApp"})
	void testLogin() {
		Assert.assertTrue(true);
	}
	@Test(priority=3, dependsOnMethods= {"testLogin"})
	void testSearch() {
		Assert.assertTrue(false);
	}
	@Test(priority=4, dependsOnMethods= {"testLogin", "testSearch"})
	void testAdvSearch() {
		Assert.assertTrue(true);
	}
	@Test(priority=5, dependsOnMethods= {"testLogin"})
	void testLogout() {
		Assert.assertTrue(true);
	}


}
