package com.enix.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Travel 
{
	WebDriver driver;
	public Travel(WebDriver ldriver)
	{
		
		driver= ldriver;
		
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="(//*[text()=\"Travel\"])[1]") WebElement TRAVEL;
	@FindBy(xpath="(//*[text()=\"Index\"])[9]") WebElement INDEX;
	@FindBy(xpath="(//*[text()=\"Reports\"])[10]") WebElement REPORTS;
	@FindBy(xpath="//*[text()=\"Travel KPIs\"]") WebElement TRKPIS;

	public void travel()
	{
		TRAVEL.click();
	}
	
	public void index()
	{
		INDEX.click();
	}
	
	public void reports()
	{
		REPORTS.click();
	}
	public void travel_kpis()
	{
		TRKPIS.click();
	}
	public void Action()
	{
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click().build().perform();
	}
	
//	public void windows()
//	{
//		Set<String> handles = driver.getWindowHandles();
//		Iterator<String> it = handles.iterator();
//		String parent = it.next();
//		String child = it.next();
//		driver.switchTo().window(parent);
//		System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//		driver.switchTo().window(child);
//		System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	
//	}
//	
	
	
	
	
}
