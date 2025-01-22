package testngintegration.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener{
	 
	public void onStart(ITestContext context) {
		 System.out.println("onStart:  Test Case File execution Started --->"); 
		  }
	 
	 public void onTestStart(ITestResult result) {
		    
		 System.out.println("onTestStart : Test Case execution started --->");
		  }
	 
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("onTestSuccess : Pass--->");
		  }
	 
	 public void onTestFailure(ITestResult result) {
		 System.out.println("onTestFailure : Fail --->");
		  }
	 
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("onTestSkipped : Skip--->");
		  }
	 
	 public void onFinish(ITestContext context) {
		 System.out.println("onFinish Test Case File execution Finished --->");
		  }


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 System.out.println("onTestFailedButWithinSuccessPercentage Test Case File execution Finished --->");
		
	}

}
