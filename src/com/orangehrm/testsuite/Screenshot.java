package com.orangehrm.testsuite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class Screenshot 
  {
	public void getscreenshot(WebDriver driver,String filename) throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\Ashok\\workspace\\orangehrm\\src\\com\\orangehrm\\screenshot"+filename+".png"));
	
		Sleeper.sleepTightInSeconds(4);
		
	}

  }
