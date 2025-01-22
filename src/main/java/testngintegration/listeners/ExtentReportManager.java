package testngintegration.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReporter; //UI of Report is supported by this class
	public ExtentReports extent; //Populating common information in report
	public ExtentTest test; //Creating test case entries in report and updating test status for method 

	
	public void onStart(ITestContext context) {
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html"); //specify location of report
		sparkReporter.config().setDocumentTitle("Automation Report"); //Report title at browser tab
		sparkReporter.config().setReportName("Functional Testing"); //name of the report in report header section
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Subba Rao");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Browser", "Chrome");
		
	}
	 

	 
	 public void onTestSuccess(ITestResult result) {
		 test = extent.createTest(result.getName()); //create a new entry in report
		 test.log(Status.PASS, "Test Case Passed is"+result.getName()); //Update status pass
			}
	 
	 public void onTestFailure(ITestResult result) {
		 test = extent.createTest(result.getName()); 
		 test.log(Status.FAIL, "Test Case Failed is"+result.getName());
		 test.log(Status.FAIL, "Test Case failure reason is"+result.getThrowable());
		 
		  }
	 
	 public void onTestSkipped(ITestResult result) {
		 test = extent.createTest(result.getName()); 
		 test.log(Status.SKIP, "Test Case Skipped is"+result.getName());
		
		  }
	 
	 public void onFinish(ITestContext context) {
		 extent.flush(); //Publish the report with updates
		  }




	public void onTestStart(ITestResult result) {
		System.out.println("On test start");
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
}
