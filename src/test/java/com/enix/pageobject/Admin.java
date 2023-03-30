package com.enix.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin 
{

WebDriver driver;
	
	//Constructor
	public Admin(WebDriver ldriver)
	{
		
		driver= ldriver;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='Admin']")WebElement ADMIN;
	@FindBy(xpath="//*[text()='Users & Menu']")WebElement UM;
	@FindBy(xpath="//*[text()='Menu Management']")WebElement MM;
	@FindBy(xpath="//*[text()='User Management']")WebElement U_M;
	@FindBy(xpath="//*[text()='User-Menu Relationship']")WebElement UMR;
	@FindBy(xpath="//*[text()='User Approval Limits']")WebElement UAL;
	@FindBy(xpath="//*[text()='PO-User Relationship']")WebElement PUR;
	@FindBy(xpath="//*[text()='User Dashboard Button Access']")WebElement UDBA;
	@FindBy(xpath="//*[text()='User-Vessel Relationship']")WebElement UVR;
	@FindBy(xpath="//*[text()='User-Mobile Devices']")WebElement UMD;
	@FindBy(xpath="//*[text()='HR User-Company Access']")WebElement HRUCA;
	@FindBy(xpath="//*[text()='User-Alert Relationship']")WebElement UAR;
	@FindBy(xpath="//*[text()='Crew Portal Menu Access']")WebElement CPMA;
	@FindBy(xpath="//*[text()='Onboard Module - Menu Access']")WebElement OMMA;
	@FindBy(xpath="//*[text()='Administrative Panel']")WebElement AP;
	@FindBy(xpath="//*[text()='Application Settings']")WebElement AS;
	@FindBy(xpath="//*[text()='Manage Scheduler']")WebElement MS;
	@FindBy(xpath="//*[text()='File Size Reduction']")WebElement FSR;
	@FindBy(xpath="//*[text()='Sync Packet Viewer ']")WebElement SPV;
	@FindBy(xpath="//*[text()='Training Log']")WebElement TL;
	@FindBy(xpath="//*[text()='User Log']")WebElement UL;
	@FindBy(xpath="//*[text()='Feedback']")WebElement FEEDBACK;
	@FindBy(xpath="//*[text()='Change Log']")WebElement CL;
	@FindBy(xpath="//*[text()='Site Map']")WebElement SM;
	@FindBy(xpath="//*[text()='Jot ERP Implementation']")WebElement JERPI;
	@FindBy(xpath="//*[text()='Implementation Report']")WebElement IR;
	@FindBy(xpath="//*[text()='Implementation Report - Grid']")WebElement IRG;
	@FindBy(xpath="//*[text()='Manage Task']")WebElement MT;
	@FindBy(xpath="//*[text()='Manage Project']  ")WebElement MP;
	@FindBy(xpath="(//*[text()='Reports'])[10]")WebElement REPO;
	@FindBy(xpath="//*[text()='Sister Vessel Report']")WebElement SVR;
	@FindBy(xpath="//*[text()='Manage Report Connection']")WebElement MRC;
	@FindBy(xpath="//*[text()='Manage Reports']")WebElement MR;
	@FindBy(xpath="//*[text()='View Reports']")WebElement VR;
	@FindBy(xpath="(//*[text()='Libraries'])[8]")WebElement LIBRARIES;
	@FindBy(xpath="//*[text()='Companies']")WebElement COMPANIES;
	@FindBy(xpath="//*[text()='Company Offices']")WebElement CO;
	@FindBy(xpath="//*[text()='Company Bank Accounts']")WebElement CBA;
	@FindBy(xpath="//*[text()='Company Office Holidays']")WebElement COH;
	@FindBy(xpath="//*[text()='Fleets']")WebElement FLEETS;
	@FindBy(xpath="//*[text()='Vessel Flags']")WebElement VF;
	@FindBy(xpath="//*[text()='VesselFlag-Vessel Manager Relation']")WebElement VVMR;
	@FindBy(xpath="//*[text()='Vessels']")WebElement VESSELS;
	@FindBy(xpath="//*[text()='Office Departments']")WebElement OD;
	@FindBy(xpath="//*[text()='Vessel Departments']")WebElement VD;
	@FindBy(xpath="//*[text()='Countries']")WebElement COUNTRIES;
	@FindBy(xpath="//*[text()='Cities']")WebElement CITIES;
	@FindBy(xpath="//*[text()='Airports']")WebElement AIRPORTS;
	@FindBy(xpath="//*[text()='Ports']")WebElement PORTS;
	@FindBy(xpath="//*[text()='System Parameters']")WebElement SP;
	@FindBy(xpath="//*[text()='Dashboard Notification Buttons']")WebElement DNB;
	@FindBy(xpath="//*[text()='KPIs & Report']")WebElement KPR;
	@FindBy(xpath="//*[text()='Manage Personal Alerts']")WebElement MPA;
	
	public void admin()
	{
		ADMIN.click();
	}
	public void user_menu()
	{
		UM.click();
	}
	public void menu_management()
	{
		MM.click();
	}
	public void user_management()
	{
		U_M.click();
	}
	public void user_management_relationship()
	{
		UMR.click();
	}
	public void user_approval_limits()
	{
		UAL.click();
	}
	public void po_user_relationship()
	{
		PUR.click();
	}
	public void user_dashboard_button_access()
	{
		UDBA.click();
	}
	public void user_vessel_relationship()
	{
		UVR.click();
	}
	public void User_Mobile_Devices()
	{
		UMD.click();
	}
	public void HR_User_Company_Access()
	{
		HRUCA.click();
	}
	public void User_Alert_Relationship()
	{
		UAR.click();
	}
	public void Crew_Portal_Menu_Access()
	{
		CPMA.click();
	}
	public void Onboard_Module_Menu_Access()
	{
		OMMA.click();
	}
	public void Administrative_Panel()
	{
		AP.click();
	}
	public void Application_Settings()
	{
		AS.click();
	}
	public void Manage_Scheduler()
	{
		MS.click();
	}
	public void File_Size_Reduction()
	{
		FSR.click();
	}
	public void Sync_Packet_Viewer()
	{
		SPV.click();
	}
	public void Jot_ERP_Implementation()
	{
		JERPI.click();
	}
	public void Implementation_Report()
	{
		IR.click();
	}
	public void Implementation_Report_Grid()
	{
		IRG.click();
	}
	public void Manage_Task()
	{
		MT.click();
	}
	public void Manage_Projects()
	{
		MP.click();
	}
	public void Training_Log()
	{
		TL.click();
	}
	public void User_Log()
	{
		UL.click();
	}
	public void Feedback()
	{
		FEEDBACK.click();
	}
	public void Reports()
	{
		REPO.click();
	}
	public void Sister_vessel_reports()
	{
		SVR.click();
	}
	public void Manage_report_connection()
	{
		MRC.click();
	}
	public void Manage_Reports()
	{
		MR.click();
	}
	public void View_Reports()
	{
		VR.click();
	}
	public void Libraries()
	{
		LIBRARIES.click();
	}
	public void Companies()
	{
		COMPANIES.click();
	}
	public void Company_Offices()
	{
		CO.click();
	}
	public void Company_Bank_Accounts()
	{
		CBA.click();
	}
	public void Company_Office_Holidays()
	{
		COH.click();
	}
	public void Fleets()
	{
		FLEETS.click();
	}
	public void Vessel_Flags()
	{
		VF.click();
	}
	public void VesselFlag_Vessel_Manager_Relation()
	{
		VVMR.click();
	}
	public void Vessels()
	{
		VESSELS.click();
	}
	public void Office_Departments()
	{
		OD.click();
	}
	public void Vessel_Departments()
	{
		VD.click();
	}
	public void Countries()
	{
		COUNTRIES.click();
	}
	public void Cities()
	{
		CITIES.click();
	}
	public void Airports()
	{
		AIRPORTS.click();
	}
	public void Ports()
	{
		PORTS.click();
	}
	public void System_parameters()
	{
		SP.click();
	}
	public void Dashboard_Notification_Buttons()
	{
		DNB.click();
	}
	public void KPIs_Report()
	{
		KPR.click();
	}
	public void Manage_Personal_Alerts()
	{
		MPA.click();
	}
	public void Change_Log()
	{
		CL.click();
	}
	public void Site_Map()
	{
		SM.click();
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
	String child4 = it.next();
	String child5 = it.next();
	String child6 = it.next();
	String child7 = it.next();
	String child8 = it.next();
	String child9 = it.next();
	String child10 = it.next();
	String child11 = it.next();
	String child12 = it.next();
	String child13 = it.next();
	String child14 = it.next();
	String child15 = it.next();
	String child16 = it.next();
	String child17= it.next();
	String child18= it.next();
	String child19 = it.next();
	String child20 = it.next();
	String child21 = it.next();
	String child22 = it.next();
	String child23 = it.next();
	String child24 = it.next();
	String child25 = it.next();
	String child26 = it.next();
	String child27 = it.next();
	String child28 = it.next();
	String child29 = it.next();
	String child30 = it.next();
	String child31= it.next();
	String child32= it.next();
	String child33 = it.next();
	String child34 = it.next();
	String child35 = it.next();
	String child36 = it.next();
	String child37 = it.next();
	
	
	
	
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
	driver.switchTo().window(child4);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child5);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child6);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child7);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child8);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child9);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child10);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child11);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child12);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child13);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child14);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child15);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child16);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child17);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child18);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child19);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child20);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child21);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child22);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child23);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child24);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child25);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child26);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child27);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child28);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child29);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child30);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child31);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child32);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child33);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child34);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child35);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child36);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	driver.switchTo().window(child37);
	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
	
	}
	
	
	
	
}
