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
	
	
	
	protected TestBase(){
		
//		try{
//			
//			prop = new Properties();
//			FileInputStream fis = new FileInputStream("/Users/bhagyashreedas/Documents/workspace/Handson/config.properties");
//			prop.load(fis);
//			
//		}catch(Exception e){
//			
//			System.out.println(e.getMessage());
//		}
//			
//		
//	}
//	
//	
//	public static void initiaLization(){
//		
//		String browserName = prop.getProperty("browser");
//		//if(browserName.equalsIgnoreCase("chrome")){
//				
//			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "/Users/bhagyashreedas/Downloads/chromedriver");	
				driver = new ChromeDriver(); 
//			}
//			else if(browserName.equals("FF")){
//				System.setProperty("webdriver.gecko.driver", "/Users/bhagyashreedas/Documents/SeleniumServer/geckodriver");	
//				driver = new FirefoxDriver(); 
			
			
		//driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		//	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			
			driver.quit();
		}
		
	
	
	}
	


