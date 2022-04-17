package com.test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.mustache.BaseChunk;

import com.base.BaseClass;
import com.pages.LoginPage;
import com.report.ReportEx;

public class LoginTest extends BaseClass {

	LoginPage lp=null;
	@BeforeSuite
	public void setup() throws Exception{
		initialization();
		ReportEx.reportInit();
		lp= new LoginPage(driver);
	}
	
	@AfterSuite
	public void tearDown() {
		driver.close();
		ReportEx.report.flush();
	}
	
	@Test
	public void failTest() {
		Assert.assertEquals(driver.getTitle(), "ABC");
	}

	@Test
	public void login() {
		lp.loginToApplication();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	@Test
	public void skipTest() {
		throw new SkipException("skipping a test");
	}
	
	
	
}
