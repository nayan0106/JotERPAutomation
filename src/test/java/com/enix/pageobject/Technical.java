package com.enix.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Technical 
{
	
WebDriver driver;
	
	//Constructor
	public Technical(WebDriver ldriver)
	{
		
		driver= ldriver;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//*[text()='Technical'])[1]")WebElement Technical;
	@FindBy(xpath="//*[text()='Planned Maintenance']")WebElement P_M;
	@FindBy(xpath="(//*[text()='PMS Jobs Status'])[2]")WebElement PMS_JS;
	@FindBy(xpath="//*[text()='PMS Followup Index']")WebElement PMS_FI;
	@FindBy(xpath="//*[text()='Running Hours Weekly Update']")WebElement RHWU;
	@FindBy(xpath="//*[text()='PMS Deferment Log']")WebElement PMS_DL;
	@FindBy(xpath="(//*[text()='Defect List'])[2]")WebElement DL;
	@FindBy(xpath="(//*[text()='Index'])[9]")WebElement INDEX;
	@FindBy(xpath="//*[text()='VMP/PMS Change Request Index']")WebElement PMS_CRI;
	@FindBy(xpath="//*[text()='Engine Log Book']")WebElement ELB;
	@FindBy(xpath="//*[text()='L.O.Samples - Lab Tests']")WebElement LOS_LT;
	@FindBy(xpath="//*[text()='Daily Meeting']")WebElement DM;
	@FindBy(xpath="//*[text()='Meeting Index']")WebElement MI;
	@FindBy(xpath="//*[text()='TimeLapse']")WebElement TL;
	@FindBy(xpath="//*[text()='Newbuild Weekly Report']")WebElement NWR;
	@FindBy(xpath="//*[text()='Weekly Report Index']")WebElement WRI;
	@FindBy(xpath="//*[text()='Mooring Winches Brake Holding Tests']")WebElement MWBHT;
	@FindBy(xpath="//*[text()='Critical Alarm/Trip Log']")WebElement CATL;
	@FindBy(xpath="(//*[text()='Reports'])[10]")WebElement REPO;
	@FindBy(xpath="//*[text()='Technical KPIs']")WebElement TKPI;
	@FindBy(xpath="//*[text()='Vessel Monthly Summary Report']")WebElement VMSR;
	@FindBy(xpath="//*[text()='Machinery Search']")WebElement MS;
	@FindBy(xpath="//*[text()='Machinery w/o PMS Jobs']")WebElement M_PMS_JOBS;
	@FindBy(xpath="//*[text()='Machinery R/Hours - Current/History']")WebElement MRCH;
	@FindBy(xpath="//*[text()='Machinery R/Hours - Monthly']")WebElement MRM;
	@FindBy(xpath="(//*[text()='Libraries'])[8]")WebElement LIBRARIES;
	@FindBy(xpath="//*[text()='PMS - Vessel Locations']")WebElement PMS_VL;
	@FindBy(xpath="//*[text()='PMS Jobs List']")WebElement PMS_JL;
	@FindBy(xpath="//*[text()='PMS Jobs - Excel Import']")WebElement PMS_EI;
	@FindBy(xpath="//*[text()='Critical Alarm/Trip Library']")WebElement CAT_LIBRARIES;
	@FindBy(xpath="//*[text()='Mooring Winches/Windlass Library']")WebElement MWWL;
	@FindBy(xpath="//*[text()='Lube Oil Sample Names']")WebElement LOSN;
	@FindBy(xpath="//*[text()='SFI List']")WebElement SFI_LIST;

	public void technical()
	{
		Technical.click();
	}
	public void planned_maintainance()
	{
		P_M.click();
	}
	public void pms_job_status()
	{
		PMS_JS.click();
	}
	public void pms_followup_index()
	{
		PMS_FI.click();
	}
	public void ruuning_hours_weekly_update()
	{
		RHWU.click();
	}
	public void pms_deferment_log()
	{
		PMS_DL.click();
	}
	public void defect_list()
	{
		DL.click();
	}
	public void index()
	{
		INDEX.click();
	}
	public void pms_change_request_index()
	{
		PMS_CRI.click();
	}
	public void engine_log_book()
	{
		ELB.click();
	}
	public void L_O_Samples_Lab_Tests()
	{
		LOS_LT.click();
	}
	public void daily_meetting()
	{
		DM.click();
	}
	public void meeting_index()
	{
		MI.click();
	}
	public void timelapse()
	{
		TL.click();
	}
	public void newbuild_weekly_report()
	{
		NWR.click();
	}
	public void weekly_report_index()
	{
		WRI.click();
	}
	public void Mooring_Winches_Brake_Holding_Tests()
	{
		MWBHT.click();
	}
	public void critical_alarm_trip_log()
	{
		CATL.click();
	}
	public void reports()
	{
		REPO.click();
	}
	public void technical_kpi()
	{
		TKPI.click();
	}
	public void Vessel_Monthly_Summary_Report()
	{
		VMSR.click();
	}
	public void machinery_search()
	{
		MS.click();
	}
	public void machinery_pms_jobs()
	{
		M_PMS_JOBS.click();
	}
	public void machinery_current_history()
	{
		MRCH.click();
	}
	public void machinery_monthly()
	{
		MRM.click();
	}
	public void libraries()
	{
		LIBRARIES.click();
	}
	public void pms_vessel_connections()
	{
		PMS_VL.click();
	}
	public void pms_job_list()
	{
		PMS_JL.click();
	}
	public void pms_excel_import()
	{
		PMS_EI.click();
	}
	public void critical_alarm_trip_library()
	{
		CAT_LIBRARIES.click();
	}
	public void mooring_winches_library()
	{
		MWWL.click();
	}
	public void Lube_Oil_Sample_Names()
	{
		LOSN.click();
	}
	public void sfi_list()
	{
		SFI_LIST.click();
	}
	public void Action()
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click().build().perform();
	}

}
