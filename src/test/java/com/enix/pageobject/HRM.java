package com.enix.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HRM 
{
	WebDriver driver;
	
	//Constructor
	public HRM(WebDriver ldriver)
	{
		
		driver= ldriver;
		
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="(//*[text()='HRM'])[1]") WebElement hrm;
	@FindBy(xpath="//*[text()='Employee Leave Status']") WebElement els;
	@FindBy(xpath="(//*[text()=\"Reports\"])[10]") WebElement reports;
	@FindBy(xpath="//*[text()='HRM KPIs']") WebElement hrmkpi;
	@FindBy(xpath="(//*[text()=\"HRM\"])[2]")WebElement hrm2;
	

	public void HRM()
	{
		hrm.click();
	}
	public void REPORT()
	{
		reports.click();
	
	}
	public void ELS()
	{
		els.click();
		
	}
	public void HRMKPI()
	{
		hrmkpi.click();
		
	}
	public void HRM1()
	{
		hrm.click();
		
	}
	public void HRM2()
	{
		hrm2.click();
	}
	
	public void Action()
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click().build().perform();
	}
	
//	public void window()
//	{
//	
//	Set<String> handles = driver.getWindowHandles();
//	Iterator<String> it = handles.iterator();
//	String parent = it.next();
//	String child = it.next();
//	String child1 = it.next();
//	driver.switchTo().window(parent);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	driver.switchTo().window(child);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	driver.switchTo().window(child1);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	
//	
//	}
//	
//	
	
	

}
