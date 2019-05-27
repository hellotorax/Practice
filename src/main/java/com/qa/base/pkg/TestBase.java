package com.qa.base.pkg;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.apache.log4j.Logger;


  public class TestBase {
	
	
	
	public static Properties prop;
	public static WebDriver driver;
	
	
	
	public static void startSelenium(){
		
		System.setProperty("webdriver.chrome.driver", "/Users/Shared/Jenkins/Home/workspace/chromedriver");	
		driver = new ChromeDriver(); 
		driver.get("https:www.facebook.com");
		driver.quit();
	}
	
	
	}
	


