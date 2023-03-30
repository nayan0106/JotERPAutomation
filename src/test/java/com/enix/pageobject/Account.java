package com.enix.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account 
{
	
	
WebDriver driver;
	
	//Constructor
	public Account(WebDriver ldriver)
	{
		
		driver= ldriver;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='Accounts']")WebElement Account;
	@FindBy(xpath="//*[text()=\"Manage Exchange Rates\"]")WebElement MER;
	@FindBy(xpath="//*[text()=\"Vessel Budgeting\"]")WebElement VB;
	@FindBy(xpath="//*[text()=\"DRC Definitions\"]")WebElement DD;
	@FindBy(xpath="//*[text()='Quotation & Invoicing']")WebElement QI;
	@FindBy(xpath="(//*[text()='Index'])[9]")WebElement INDEX;
	@FindBy(xpath="//*[text()='Q&I Templates']")WebElement QIT;
	@FindBy(xpath="(//*[text()='Reports'])[10]")WebElement REPO;
	@FindBy(xpath="//*[text()='Accounts KPIs']")WebElement AKPI;
	@FindBy(xpath="//*[text()='DRC/Budget Report, Tree-view']")WebElement DBRT ;
	@FindBy(xpath="//*[text()='DRC/Budget Report, Month-wise']")WebElement DBRM;
	@FindBy(xpath="//*[text()='DRC/Budget Report, Calendar-wise']")WebElement DBRC;
	@FindBy(xpath="//*[text()='DRC/Budget Report, Calendar-Wise_New']")WebElement DBRCN;
	@FindBy(xpath="//*[text()='Mnth-on-Mnth PO Report']")WebElement MMPOR;
	@FindBy(xpath="//*[text()='MIS Report']")WebElement MIS;
	@FindBy(xpath="(//*[text()='Approved POs'])[2]")WebElement APO;
	@FindBy(xpath="//*[text()='Approved Invoices']")WebElement AI;
	@FindBy(xpath="//*[text()='Paid Invoices']")WebElement PI;
	@FindBy(xpath="//*[text()='Invoice Summary']")WebElement IS;
	@FindBy(xpath="(//*[text()='Libraries'])[8]") WebElement LIBRARIES;
	@FindBy(xpath="//*[text()='Manage Currencies']")WebElement MC;
	@FindBy(xpath="//*[text()='DRC Account Codes']")WebElement DAC;
	@FindBy(xpath="//*[text()='DRC Report ACC Categorization']")WebElement DRCRAC;
	@FindBy(xpath="//*[text()='Debit/Credit Card List']")WebElement DCL;
	@FindBy(xpath="//*[text()='Q&I Service Providers']")WebElement QISP;
	@FindBy(xpath="//*[text()='Q&I Items']")WebElement QII;
	@FindBy(xpath="//*[text()='Q&I Foot notes']")WebElement QIFN;
	
	public void account()
	{
		Account.click();
	}
	
	public void manage_exchange_rates()
	{
		MER.click();
	}
	public void vessel_budgeting()
	{
		VB.click();
	}
	public void drc_definitions()
	{
		DD.click();
	}
	public void quotation_invoicing()
	{
		QI.click();
	}
	public void index()
	{
		INDEX.click();
	}
	public void q_i_templates ()
	{
		QIT.click();
	}
	public void report()
	{
		REPO.click();
	}
	public void account_kpis ()
	{
		AKPI.click();
	}
	public void drc_report_tree_view ()
	{
		DBRT.click();
	}
	public void drc_report_month_wise ()
	{
		DBRM.click();
	}
	public void drc_report_calender_wise()
	{
		DBRC.click();
	}
	public void drc_report_calender_wise_new()
	{
		DBRCN.click();
	}
	public void month_on_month_po_report()
	{
		MMPOR.click();
	}
	public void mis_report()
	{
		MIS.click();
	}
	public void approved_pos()
	{
		APO.click();
	}
	public void approved_invoices()
	{
		AI.click();
	}
	public void paid_invoices()
	{
		PI.click();
	}
	public void invoiced_summary ()
	{
		IS.click();
	}
	public void libraries()
	{
	    LIBRARIES.click();
	}
	public void mannage_currencies ()
	{
		MC.click();
	}
	public void DRC_account_codes()
	{
		DAC.click();
	}	
	public void DRC_report_acc_categorization()
	{
		DRCRAC.click();
	}
	public void debit_card_list()
	{
		DCL.click();
	}
	public void QI_service_providers()
	{
		QISP.click();
	}
	public void QI_items()
	{
		QII.click();
	}
	public void QI_foot_notes()
	{
		QIFN.click();
	}
	
	public void Action()
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click().build().perform();
	}
	
	
//		public void window()
//		{
//		
//		Set<String> handles = driver.getWindowHandles();
//		Iterator<String> it = handles.iterator();
//		String parent = it.next();
//		String child = it.next();
//		String child1 = it.next();
//		driver.switchTo().window(parent);
//		System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//		driver.switchTo().window(child);
//		System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//		driver.switchTo().window(child1);
//		System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//		
//		
//		}
		
		
}
