package com.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportEx {

	public static ExtentReports report= null;
	public static ExtentTest test=null;
	public static ExtentSparkReporter spark=null;
	
	public static void reportInit() {
		
		report = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/ExtentReports.html");
		report.attachReporter(spark);
	}
	
	
}
