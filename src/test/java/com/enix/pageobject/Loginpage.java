package com.enix.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
	
	//object of Webdriver
	WebDriver driver;
	
	//Constructor
	public Loginpage(WebDriver ldriver)
	{
		
		driver= ldriver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	//identify WebElements
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtUserName']") WebElement Username;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtPassword']") WebElement Password;
	@FindBy(xpath="//input[@value='Log In']") WebElement login;
	
	
	//Nonstatic methods for WebElements
	public void enterusername(String Uname)
	{
		Username.sendKeys("nayan0106");
	}
	
	public void enterpassword(String PWD)
	{
		Password.sendKeys("Welcome123");
	}
	
	public void clicklogin()
	{
		login.click();
	}
	

}
