package com.orangehrm.testsuite;

import java.io.IOException;
/*import java.net.URL;

import org.junit.runners.Parameterized.Parameters;*/
import org.openqa.selenium.firefox.FirefoxDriver;
/*import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;*/
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

/*import com.sun.jna.Platform;*/

public class Login extends Constants
{

   @Test
   public void LoginTest() throws IOException

   {
	   /*DesiredCapabilities cap=null;
	   if(b.equals("firefox"))
	   {
		   cap=DesiredCapabilities.firefox();
		   cap.setBrowserName("firefox");
		   cap.setPlatform(Platform.WINDOWS); 
	   }
	   else 
	   {
		   cap=DesiredCapabilities.chrome();
		   cap.setBrowserName("chrome");
		   cap.setPlatform(Platform.WINDOWS);
		   	
	   }*/
	   
	   driver=new /*RemoteWebDriver(new URL("http://localhost:4444/wb/hub"),cap);*/ FirefoxDriver();
	   driver.get("http://enterprise.demo.orangehrmlive.com/");
	   LoginOnOrangeHrm login=PageFactory.initElements(driver, LoginOnOrangeHrm.class);
	   
	   String runMode=eo.getCellData(dataenginepath,0,1,2);
	   if(runMode.equals("N"))
	   {
		   throw new SkipException("Login test case skipped");    
	   }
	   else
	   {
		   login.loginpanel1("Admin","admin");
	   }
	
   }
 }
