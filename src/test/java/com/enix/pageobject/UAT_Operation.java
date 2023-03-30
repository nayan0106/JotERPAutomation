package com.enix.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UAT_Operation
{

	WebDriver driver;

	public UAT_Operation(WebDriver ldriver)
	{

		driver= ldriver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="(//*[text()='Operations'])[1]") WebElement OPN;
	@FindBy(xpath="//*[text()=\"Vessel Info DB (VID)\"]") WebElement VID;
	@FindBy(xpath="//*[text()=\"Vessel Voyage\"]") WebElement VY;
	@FindBy(xpath="//*[text()=\"Vessel Port Calls\"]") WebElement VPC;
	@FindBy(xpath="(//*[text()=\"Index\"])[7]") WebElement INDEX;
	@FindBy(xpath="(//*[text()=\"Vessel Port Calls\"])[2]") WebElement VPC2;
	@FindBy(xpath="(//*[text()=\"Vessel Port Call Reports_History\"])[2]") WebElement VPCRH;
	@FindBy(xpath="//*[text()=\"Vessel Port Call Checklist Index\"]") WebElement VPCCI;
	@FindBy(xpath="(//*[text()='Noon Reports'])[2]") WebElement NR;
	@FindBy(xpath="(//*[text()='Index'])[8]") WebElement INDEX1;
	@FindBy(xpath="//*[text()=\"ASM - Excel Noon Report\"]") WebElement ENR;
	@FindBy(xpath="//*[text()='Bunker ROBs and Costs']") WebElement BROBC;
	@FindBy(xpath="//*[text()=\"NAD Consumptions' Threshold\"]")WebElement NADCT;
	@FindBy(xpath="//*[text()=\"SEEMP Resource Data\"]")WebElement SEEMPRD;
	@FindBy(xpath="//*[text()=\"CP Activity Log\"]")WebElement CPAL;
	@FindBy(xpath="//*[text()=\"CP Consumptions' Index\"]")WebElement CPCI;
	@FindBy(xpath="//*[text()=\"CP Thresholds\"]")WebElement CPT;
	@FindBy(xpath="//*[text()=\"CO2 Permits\"]")WebElement COP;
	@FindBy(xpath="//*[text()=\"CO2 Emission Multiplier Factor\"]")WebElement COEMF;
	@FindBy(xpath="(//*[text()=\"CII Reduction Factor\"])[1]")WebElement CIIRF;
	@FindBy(xpath="(//*[text()=\"CII Details\"])[1]")WebElement CIIDetails;
	@FindBy(xpath="//*[text()=\"CII Calculation\"]")WebElement CIICalculation;
	@FindBy(xpath="//*[text()=\"Offshore Midnight Report\"]")WebElement OMR;
	@FindBy(xpath="//*[text()=\"Fleet Location - Map\"]")WebElement FLM;
	@FindBy(xpath="//*[text()=\"Deck Log Book\"]")WebElement DLB;
	@FindBy(xpath="//*[text()=\"Voyage Cargo Log\"]")WebElement VCL;
	@FindBy(xpath="//*[text()=\"Barge Voyage Log\"]")WebElement BVL;
	@FindBy(xpath="(//*[text()=\"Report/Form Index\"])[2]")WebElement RFI;
	@FindBy(xpath="//*[text()=\"Report/Form Followup Index\"]")WebElement RPFI;
	@FindBy(xpath="(//*[text()=\"Defect List\"])[2]")WebElement DL;
	@FindBy(xpath="(//*[text()='Index'])[9]")WebElement INDEX2;
	@FindBy(xpath="//*[text()=\"Port Agents' List\"]")WebElement PAL;
	@FindBy(xpath="(//*[text()=\"Security Alerts\"])[1]")WebElement SA;
	@FindBy(xpath="//*[text()=\"Dashboard\"]")WebElement DASHBOARD;
	@FindBy(xpath="(//*[text()=\"Security Alerts\"])[2]") WebElement SA2;
	@FindBy(xpath="//*[text()=\"Vessels List\"]")WebElement VL;
	@FindBy(xpath="//*[text()=\"Manage High Risk Areas\"]")WebElement MHRA;
	@FindBy(xpath="//*[text()=\"FireArms Log\"]")WebElement FL;
	@FindBy(xpath="//*[text()=\"Kit Index\"]")WebElement KI;
	@FindBy(xpath="//*[text()=\"Items\"]")WebElement ITEMS;
	
	@FindBy(xpath="(//*[text()=\"Reports\"])[10]")WebElement REPORTS;

	@FindBy(xpath="//*[text()=\"Voyage Abstract Daily Report\"]")WebElement VADR;
	@FindBy(xpath="//*[text()=\"Operations KPIs\"]")WebElement OKPI;
	@FindBy(xpath="(//*[text()=\"Libraries\"])[8]")WebElement LIBRARIES;
	@FindBy(xpath="//*[text()=\"VID Lib New\"]")WebElement VIDLN;
	@FindBy(xpath="//*[text()=\"NAD Custom Fields\"]")WebElement NADCF;
	@FindBy(xpath="//*[text()=\"NAD Custom Fields Vessel Assignment\"]")WebElement NADCFVA;
	@FindBy(xpath="//*[text()=\"NAD Documents\"]")WebElement NADDO;
	@FindBy(xpath="//*[text()=\"NAD Document Vessel Assignment\"]")WebElement NADDVA;
	@FindBy(xpath="//*[text()=\"OMR Product Name\"]")WebElement OMRPN;
	@FindBy(xpath="//*[text()=\"Deck Log Tanks/Hold Mgmt\"]")WebElement DLTH;
	@FindBy(xpath="//*[text()=\"Port-Call Checklist\"]")WebElement PCC;
	@FindBy(xpath="//*[text()=\"Report/Forms List Mgmt\"]")WebElement RFLM;
	@FindBy(xpath="//*[text()=\"Report/Form Vessel Assign\"]")WebElement RFVA;
	
	public void operation()
	{
		OPN.click();
	}
	public void Vessel_Info_DB()
	{
		VID.click();
	}
	public void Vessel_Voyage()
	{
		VY.click();
	}
	public void vessel_port_calls()
	{
		VPC.click();
	}
	public void index()
	{
		INDEX.click();
	}
	public void vessel_port_calls2()
	{
		VPC2.click();
	}

	public void vessel_port_call_history()
	{
		VPCRH.click();
	}
	public void vessel_port_call_index()
	{
		VPCCI.click();
	}
	public void noon_reports()
	{
		NR.click();
	}
	public void index1()
	{
		INDEX1.click();
	}
	public void Excel_noon_reports()
	{
		ENR.click();
	}
	public void bunker_robs()
	{
		BROBC.click();
	}
	public void NAD_Consumptions_Threshold()
	{
		NADCT.click();
	}
	public void SEEMP_Resource_Data()
	{
		SEEMPRD.click();
	}
	public void CP_Activity_Log()
	{
		CPAL.click();
	}
	public void CP_Consumptions_Index()
	{
		CPCI.click();
	}
	public void CP_Thresholds()
	{
		CPT.click();
	}
	public void CO2_Permits()
	{
		COP.click();
	}
	public void CO2_Emission_Multiplier_Factor()
	{
		COEMF.click();
	}
	public void reduction_factor()
	{
		CIIRF.click();
	}
	public void Details()
	{
		CIIDetails.click();
	}
	public void Calculation()
	{
		CIICalculation.click();
	}
	public void Offshore_Midnight_Report()
	{
		OMR.click();
	}
	public void Fleet_Location_Map()
	{
		FLM.click();
	}
	public void Deck_Log_Book()
	{
		DLB.click();
	}
	public void Voyage_Cargo_Log()
	{
		VCL.click();
	}
	public void Barge_Voyage_Log()
	{
		BVL.click();
	}
	public void Report_Form_Index()
	{
		RFI.click();
	}
	public void Report_Form_Followup_Index()
	{
		RPFI.click();
	}
	public void Defect_List()
	{
		DL.click();
	}
	public void Index2()
	{
		INDEX2.click();
	}
	public void Port_Agents()
	{
		PAL.click();
	}
	public void Security_Alerts()
	{
		SA.click();
	}
	public void Dashboard()
	{
		DASHBOARD.click();
	}
	public void Security_Alerts2()
	{
		SA2.click();
	}
	public void Vessels_List()
	{
		VL.click();
	}
	public void Manage_High_Risk_Areas()
	{
		MHRA.click();
	}
	public void FireArms_Log()
	{
		FL.click();
	}
	public void Kit_Index()
	{
		KI.click();
	}
	public void Items()
	{
		ITEMS.click();
	}
	public void Reports()
	{
		REPORTS.click();
	}
	public void Voyage_Abstract_Daily_Report()
	{
		VADR.click();
	}
	public void Operations_KPI()
	{
		OKPI.click();
	}
	public void Libraries()
	{
		LIBRARIES.click();
	}
	public void VID_Lib_New()
	{
		VIDLN.click();
	}
	
	public void NAD_Custom_Fields()
	{
		NADCF.click();
	}
	
	public void NAD_Custom_Fields_Vessel_Assignment()
	{
		NADCFVA.click();
	}
	
	public void NAD_Documents()
	{
		NADDO.click();
	}
	
	public void NAD_Document_vessel_assignment()
	{
		NADDVA.click();
	}
	public void OMR_Product_Name()
	{
		OMRPN.click();
	}
	public void Deck_Log_Tanks_Hold_Mgmt()
	{
		DLTH.click();
	}
	public void Port_Call_Checklist()
	{
		PCC.click();
	}
	public void Report_Forms_List_Mgmt()
	{
		RFLM.click();
	}
	public void Report_Form_Vessel_Assign()
	{
		RFVA.click();
	}
	
	public void Action()
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click().build().perform();
	}

//	public void window()
//	{
//	Set<String> handles = driver.getWindowHandles();
//	Iterator<String> it = handles.iterator();
//	String parent = it.next();
//	String child = it.next();
//	String child1 = it.next();
//	String child2 = it.next();
//	String child3= it.next();
//	//Thread.sleep(500);
//	String child4= it.next();
//	//Thread.sleep(500);
//	String child5= it.next();
//	//Thread.sleep(500);
//	String child6= it.next();
//	//Thread.sleep(500);
//	String child7= it.next();
//	//Thread.sleep(500);
//	String child8= it.next();
//	//Thread.sleep(500);
//	String child9= it.next();
////	Thread.sleep(500);
//	String child10= it.next();
////	Thread.sleep(500);
//	String child11= it.next();
////	Thread.sleep(500);
//	String child12= it.next();
//	//Thread.sleep(500);
//	
//	
//	driver.switchTo().window(parent);
//	System.out.println(driver.getTitle()+"  : "+driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child);
//	System.out.println(driver.getTitle()+"  : "+driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child1);
//	System.out.println(driver.getTitle()+"  : "+driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child2);
//	System.out.println(driver.getTitle()+"  :  "+driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child3);
//	System.out.println(driver.getTitle()+"  :   "+driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child4);
//	System.out.println(driver.getTitle()+"  :   "+driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child5);
//	System.out.println(driver.getTitle()+"  :   "+driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child6);
//	System.out.println(driver.getTitle()+"  :   "+driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child7);
//	System.out.println(driver.getTitle()+"  :   "+driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child8);
//	System.out.println(driver.getTitle()+"  :   "+driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child9);
//	System.out.println(driver.getTitle()+"  :   "+driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child10);
//	System.out.println(driver.getTitle()+"  :   "+driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child11);
//	System.out.println(driver.getTitle()+"  :   "+driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child12);
//	System.out.println(driver.getTitle()+"  :   "+driver.getCurrentUrl());
//	System.out.println();
//}

}
