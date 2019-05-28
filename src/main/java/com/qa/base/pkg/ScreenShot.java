package com.qa.base.pkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {


	
	
	public static  void screenShot(WebDriver driver, String filePath) throws IOException{
		
		TakesScreenshot src = ((TakesScreenshot)driver);
		
		File fs = src.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs, new File(filePath));
		
		
	}

}
