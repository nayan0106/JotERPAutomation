package com.enix.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Supplier_Portal 
{
WebDriver driver;
	
	//Constructor
	public Supplier_Portal(WebDriver ldriver)
	{
		
		driver= ldriver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Supplier Portal']")WebElement SP;
	@FindBy(xpath="(//*[text()='Procurement'])[3]")WebElement PRO;
	@FindBy(xpath="//*[text()='Procurement Index']")WebElement PROINDX;
	@FindBy(xpath="(//*[text()='Travel'])[2]")WebElement TR;
	@FindBy(xpath="//*[text()='Travel Index']")WebElement TRVINDX;
	
	
	public void supplier_portal()
	{
		SP.click();
	}
	public void Procurement()
	{
		PRO.click();
	}
	public void Procurement_index()
	{
		PROINDX.click();
	}
	public void supplier_portal2()
	{
		SP.click();
	}
	public void Travel()
	{
		TR.click();
	}
	public void Travel_Index()
	{
		TRVINDX.click();
	}
	
	public void Action()
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click().build().perform();
	}
	

}
