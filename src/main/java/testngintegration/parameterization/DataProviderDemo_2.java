package testngintegration.parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo_2 {
	
	@Test(dataProvider="testData")
	public void testDataProvider(String msg1, String msg2, int id) {
		System.out.println(msg1+ " "+msg2+"            "+id);
		
	}
	
	@DataProvider(name="testData")
	public Object[][] getData() {
	Object[][]	data = {{"hello", "msg", 1}, {"greetings", "comm", 111}, {"solo", "call", 101}};
	return data;
		
	}

}
