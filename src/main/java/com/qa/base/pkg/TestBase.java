package com.qa.base.pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.apache.log4j.Logger;


  public class TestBase {
	
	
	
	public static Properties prop;
	public static WebDriver driver;
	
	
	
	public static void startSelenium() throws IOException{
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/Shared/Jenkins/Home/workspace/chromedriver");	
		driver = new ChromeDriver(); 
		
		driver.get("https:www.facebook.com");
		ScreenShot.screenShot(driver, "/Users/Shared/Screenshots"+System.currentTimeMillis()+"test.png");
		driver.quit();
	}
	
	
	
	}
	


