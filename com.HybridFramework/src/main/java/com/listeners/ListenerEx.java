package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.report.ReportEx;
import com.utility.DriverUtils;

public class ListenerEx implements ITestListener{

	public void onFinish(ITestContext arg0) {
		
		
	}
	public void onStart(ITestContext arg0) {
		
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}
	public void onTestFailure(ITestResult result) {
		ReportEx.test.log(Status.FAIL, "testcase failed");
		ReportEx.test.addScreenCaptureFromPath(DriverUtils.getScreenshot(result.getName()));
	}
	public void onTestSkipped(ITestResult arg0) {
		ReportEx.test.log(Status.SKIP, "testcase skipped");
		
	}
	public void onTestStart(ITestResult result) {
		ReportEx.test= ReportEx.report.createTest(result.getName());
		
	}
	public void onTestSuccess(ITestResult arg0) {
		ReportEx.test.log(Status.PASS, "testcase passed");
		
	}

}
