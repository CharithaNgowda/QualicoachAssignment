package qualicoach;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import java.io.IOException;

import org.openqa.selenium.WebDriver;



import resources.Base;
import resources.ExtentReporterNG;

public class Listeners extends Base implements ITestListener {

	
	
		// TODO Auto-generated method stub
		ExtentTest test;
		ExtentReports extent=ExtentReporterNG.getReportObject();
	//	ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			test= extent.createTest(result.getMethod().getMethodName());
			
		
	}


	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS,"Test Passed");
		
	}


	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	test.fail(result.getThrowable());
		WebDriver driver =null;
		String testMethodName =result.getMethod().getMethodName();
		
		try {
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch(Exception e)
		{
			
		}
		try {
			//extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName,driver), result.getMethod().getMethodName());
			getScreenShotPath(testMethodName,driver);
		}
			
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
