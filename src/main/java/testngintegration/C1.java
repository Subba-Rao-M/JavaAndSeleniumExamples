package testngintegration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
	@BeforeTest
	void bt() {
		System.out.println("Before test");
	}
	@AfterTest
	void at() {
		System.out.println("After test");
	}
	@Test
	void test1() {
		System.out.println("test1");
	}

}
