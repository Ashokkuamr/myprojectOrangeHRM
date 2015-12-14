package com.orangehrm.testsuite;



import org.openqa.selenium.remote.RemoteWebDriver;

import com.orangehrm.utility.ExcelOperations;

public class Constants
 {
	ExcelOperations eo=new ExcelOperations();
	String emplistpath="C:\\Users\\Ashok\\workspace\\orangehrm\\src\\com\\orangehrm\\excelfiles\\EmployeeList.xlsx";
	String dataenginepath="C:\\Users\\Ashok\\workspace\\orangehrm\\src\\com\\orangehrm\\dataengine\\DataEngine.xlsx";
	static RemoteWebDriver driver=null;
    Screenshot screen=new Screenshot();
    
    
	
 }
