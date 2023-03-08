package com.enix.testcases;

import org.testng.annotations.Test;

import com.enix.pageobject.HRM;
import com.enix.pageobject.Loginpage;
import com.enix.pageobject.Supplier_Portal;

public class TC_LOGINPAGE extends BaseClass
{
	@Test
	public void VerifyLogin() throws InterruptedException
	{
		driver.get(url);
		logger.info("url opened");
		
		Loginpage LP = new Loginpage(driver);
		LP.enterusername("nayan0106");
		LP.enterpassword("Welcome123");
		LP.clicklogin();
		logger.info("login successfulL");
		
		HRM HR = new HRM(driver);
		HR.HRM();
		Thread.sleep(500);
		HR.REPORT();
		Thread.sleep(500);
		HR.ELS();
		HR.Action();
		Thread.sleep(500);
		HR.HRM();
		Thread.sleep(500);
		HR.REPORT();
		Thread.sleep(500);
		HR.HRMKPI();
		HR.Action();
		Thread.sleep(500);
		HR.HRM();
		Thread.sleep(500);
		HR.HRM2();
		HR.Action();
	
	
	Supplier_Portal sp = new Supplier_Portal(driver);
	sp.supplier_portal();
	Thread.sleep(500);
	sp.Procurement();
	Thread.sleep(500);
	sp.Procurement_index();
	sp.Action();
	Thread.sleep(500);
	sp.supplier_portal();
	Thread.sleep(500);
	sp.Travel();
	Thread.sleep(500);
	sp.Travel_Index();
	sp.Action();
		
		
		
		
	}

}
