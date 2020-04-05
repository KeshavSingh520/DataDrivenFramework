package listener;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import base.base;
import testcase.AddCustomerTest;

public class CustomeListener  extends base implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.setProperty("org.uncommons.reportng.escape-output", "false");

		Reporter.log("<a target=\"_blank\" href=\"E:\\Images.jpeg\">Screenshot captured</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href=\"E:\\Images.jpeg\"><img src=\"E:\\Images.jpeg\" height=200 width=200></a>");
		Reporter.log("<br>");
		Alert alert=driver.switchTo().alert();
		
		Reporter.log(alert.getText());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		
		
		try {
			base.captureScreenshot();
		} catch (Exception e) {
			
			Reporter.log("Alert Text is: "+AddCustomerTest.alertText);
		}
		
	}

}
