package com.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.PropertiesUtils;

public class BaseClass {

	public static WebDriver driver=null;
	public static Logger log= Logger.getLogger(BaseClass.class);
	
	public static void initialization() throws Exception{
		System.out.println("reading a property file for browser");
		log.info("reading a property file for browser");
		
		String br_name= PropertiesUtils.readProperty("browser");
		if(br_name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			driver= new ChromeDriver();
		}
		if(br_name.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:/firefoxdrive.exe");
			driver= new FirefoxDriver();
		}
		driver.get(PropertiesUtils.readProperty("url"));
		driver.manage().window().maximize();
		
	}
	public static void main(String[] args) throws Exception{
		initialization();
	}
	
}
