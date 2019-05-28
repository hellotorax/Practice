package HandsOn.Handson;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.qa.base.pkg.TestBase;


public class ExecuteTest extends TestBase {
		TestBase tb;
	
	

	
	@Test
	public  void mExcute() throws IOException{
		
	//	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(f, new File("/Users/Documents/test.png"));
		
		tb.startSelenium();	}

}
