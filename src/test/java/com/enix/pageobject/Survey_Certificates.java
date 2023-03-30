package com.enix.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Survey_Certificates 
{
	
WebDriver driver;
	
	//Constructor
	public Survey_Certificates(WebDriver ldriver)
	{
		
		driver= ldriver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//*[text()='Surveys & Certificates']") WebElement SC;
	@FindBy(xpath="(//*[text()='Index'])[9]") WebElement INDEX;
	@FindBy(xpath="(//*[text()='Reports'])[10]") WebElement REPO;
	@FindBy(xpath="//*[text()='Surveys & Certificates KPIs']") WebElement SCKPI;
	@FindBy(xpath="(//*[text()='Libraries'])[8]") WebElement LIBRARIES;
	@FindBy(xpath="//*[text()='Survey Categories']") WebElement SCATEG;
	@FindBy(xpath="//*[text()='Survey Tenures']") WebElement ST;
	@FindBy(xpath="//*[text()='Survey-Certificates Listing']") WebElement SCL;
	@FindBy(xpath="//*[text()='Survey-Vessel Assignment']") WebElement STV;
	
	
	public void survey_certificates()
	{
		SC.click();
	}
	public void Index()
	{
		INDEX.click();
	}
	public void Reports()
	{
		REPO.click();
	}
	public void Survey_Certificates_KPI()
	{
		SCKPI.click();
	}
	public void Libraries()
	{
		LIBRARIES.click();
	}
	public void Survey_Categories()
	{
		SCATEG.click();
	}
	public void Survey_Tenures()
	{
		ST.click();
	}
	public void Survey_Certificates_Listning()
	{
		SCL.click();
	}
	public void Survey_Vessel_Assignment()
	{
		STV.click();
	}
	
	public void Action()
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click().build().perform();
	}
	
	public void window()
	{
	
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	String parent = it.next();
	String child = it.next();
	String child1 = it.next();
	String child2 = it.next();
	String child3 = it.next();
	
	
	driver.switchTo().window(parent);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child1);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child2);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child3);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	
	
	
	
	
	}
	
	
}
