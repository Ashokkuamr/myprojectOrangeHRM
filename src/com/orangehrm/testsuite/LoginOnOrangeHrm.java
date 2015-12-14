package com.orangehrm.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class LoginOnOrangeHrm 
 {
	@FindBy(id="txtUsername") 
	WebElement Username;
	@FindBy(id="txtPassword")
	WebElement Password;
	@FindBy(id="btnLogin")
	WebElement Login;
	
	public void loginpanel1(String u, String p)
	{
		Username.sendKeys(u);
		Sleeper.sleepTightInSeconds(2);
		Password.sendKeys(p);
		Sleeper.sleepTightInSeconds(2);
		Login.click();
	}
 }
