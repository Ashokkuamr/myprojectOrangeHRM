package com.orangehrm.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu 
 {
	@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']/b")
	WebElement admin;
	public void admin()
	{
		admin.click();
	}
	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']/b")
	WebElement pim;
	public void pim()
	{
		pim.click();
	}
	@FindBy(xpath="//*[@id='menu_leave_viewLeaveModule']/b")
	WebElement leave;
	public void leave()
	{
		leave.click();
	}
	@FindBy(xpath="//*[@id='menu_time_viewTimeModule']/b")
	WebElement time;
	public void time()
	{
		time.click();	
	}
	@FindBy(xpath="//*[@id='menu_recruitment_viewRecruitmentModule']/b")
	WebElement Recruitment;
	public void Recruitment()
	{
		Recruitment.click();
		
	}
	@FindBy(xpath="//*[@id='menu_performance_viewMyAppraisals']/b")
	WebElement performance;
	public void performance()
	{
		performance.click();
		
	}
	@FindBy(id="welcome")
	WebElement welAdmin;
	@FindBy(xpath="//*[@id='welcome-menu']/ul/li[2]/a")
	WebElement logout;
	public void Logout()
	{
		welAdmin.click();
		logout.click();
	}

 }
