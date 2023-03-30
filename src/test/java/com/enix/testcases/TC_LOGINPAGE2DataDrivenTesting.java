package com.enix.testcases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.enix.pageobject.Account;
import com.enix.pageobject.Admin;
import com.enix.pageobject.HRM;
import com.enix.pageobject.Loginpage;
import com.enix.pageobject.Supplier_Portal;
import com.enix.pageobject.Survey_Certificates;
import com.enix.pageobject.Technical;

public class TC_LOGINPAGE2DataDrivenTesting extends BaseClass
{


	@BeforeClass
	@Test(dataProvider="")
	public void verifylogin() throws InterruptedException
	{
		
		driver.get(url);
		logger.info("url opened");
		
		Loginpage LP = new Loginpage(driver);
		LP.enterusername(Uname);
		LP.enterpassword(Pwd);
		LP.clicklogin();
		logger.info("login successfulL");
		Thread.sleep(500);
	}
	
	@Test
	public void admin() throws InterruptedException
	{
		Thread.sleep(500);
		Admin ad = new Admin(driver);
		ad.admin();
		Thread.sleep(500);
		ad.user_menu();
		Thread.sleep(500);
		ad.menu_management();
		 ad.Action();
		Thread.sleep(500);
//		ad.admin();
//		Thread.sleep(500);
		ad.admin();
		Thread.sleep(500);
		ad.user_menu();
		Thread.sleep(500);
		ad.user_management();
		 ad.Action();
		Thread.sleep(500);
		ad.admin();
		Thread.sleep(500);
		ad.user_menu();
		Thread.sleep(500);
		ad.user_management_relationship();
		 ad.Action();
		Thread.sleep(500);
		ad.admin();
		Thread.sleep(500);
		ad.user_menu();
		Thread.sleep(500);
		ad.user_approval_limits();
		 ad.Action();
		Thread.sleep(500);
		ad.admin();
		Thread.sleep(500);
		ad.user_menu();
		Thread.sleep(500);
		ad.po_user_relationship();
		Thread.sleep(500);
		ad.admin();
		Thread.sleep(500);
		ad.user_menu();
		Thread.sleep(500);
	    ad.user_dashboard_button_access();
	    ad.Action();
		Thread.sleep(500);
		ad.admin();
		Thread.sleep(500);
		ad.user_menu();
		Thread.sleep(500);
	    ad.user_vessel_relationship();
		Thread.sleep(500);
		ad.admin();
		Thread.sleep(500);
		ad.user_menu();
		Thread.sleep(500);
	    ad.User_Mobile_Devices();
	    ad.Action();
		Thread.sleep(500);
		ad.admin();
		Thread.sleep(500);
		ad.user_menu();
		Thread.sleep(500);
	    ad.HR_User_Company_Access();
	    ad.Action();
		Thread.sleep(500);
		ad.admin();
		Thread.sleep(500);
		ad.user_menu();
		Thread.sleep(500);
	    ad.User_Alert_Relationship();
		Thread.sleep(500);
		ad.admin();
		Thread.sleep(500);
		ad.user_menu();
		Thread.sleep(500);
	    ad.Crew_Portal_Menu_Access();
	    ad.Action();
		Thread.sleep(500);
		ad.admin();
		Thread.sleep(500);
		ad.user_menu();
		Thread.sleep(500);
	    ad.Onboard_Module_Menu_Access();
	    ad.Action();
		Thread.sleep(500);
				
		ad.admin();
		Thread.sleep(500);
	    ad.Administrative_Panel();
	     ad.Action();
	    Thread.sleep(500);
	    
		ad.admin();
		Thread.sleep(500);
	    ad.Application_Settings();
	    Thread.sleep(500);
	    
	    ad.admin();
		Thread.sleep(500);
	    ad.Manage_Scheduler();
	    Thread.sleep(500);
	    ad.File_Size_Reduction();
	    Thread.sleep(500);
	    ad.Sync_Packet_Viewer();
	    Thread.sleep(500);
	    ad.Jot_ERP_Implementation();
	    Thread.sleep(500);
	    ad.Implementation_Report();
	    Thread.sleep(500);
	    ad.Implementation_Report_Grid();
	    Thread.sleep(500);
	    ad.Manage_Task();
	    Thread.sleep(500);
	    ad.Manage_Projects();
	    Thread.sleep(500);
	    ad.Training_Log();
	    Thread.sleep(500);
	    ad.User_Log();
	    Thread.sleep(500);
	    ad.Feedback();
	    ad.Action();
	    Thread.sleep(500);
	
	    
	    ad.admin();
		Thread.sleep(500);
	    ad.Reports();
	    Thread.sleep(500);
	    ad.Sister_vessel_reports();
	    Thread.sleep(500);
	    ad.Reports();
	    Thread.sleep(500);
	    ad.Manage_report_connection();
	    Thread.sleep(500);
	    ad.Manage_Reports();
	    Thread.sleep(500);
	    ad.View_Reports();
	    ad.Action();
	    Thread.sleep(500);
	    
	    ad.admin();
		Thread.sleep(500);
	    ad.Libraries();
		Thread.sleep(500);
	    ad.Companies();
		Thread.sleep(500);
	    ad.Company_Offices();
		Thread.sleep(500);
	    ad.Company_Bank_Accounts();
		Thread.sleep(500);
	    ad.Company_Office_Holidays();
		Thread.sleep(500);
	    ad.Fleets();
		Thread.sleep(500);
	    ad.Vessel_Flags();
		Thread.sleep(500);
	    ad.VesselFlag_Vessel_Manager_Relation();
		Thread.sleep(500);
	    ad.Vessels();
		Thread.sleep(500);
	    ad.Office_Departments();
		Thread.sleep(500);
	    ad.Vessel_Departments();
		Thread.sleep(500);
	    ad.Countries();
		Thread.sleep(500);
	    ad.Cities();
		Thread.sleep(500);
	    ad.Airports();
		Thread.sleep(500);
	    ad.Ports();
		Thread.sleep(500);
	    ad.System_parameters();
		Thread.sleep(500);
	    ad.Dashboard_Notification_Buttons();
		//Thread.sleep(500);
	    ad.KPIs_Report();
		//Thread.sleep(500);
	    ad.Manage_Personal_Alerts();
		//Thread.sleep(500);
	    ad.Change_Log();
	//	Thread.sleep(500);
	    ad.Site_Map();
	  ad.Action();
	  Thread.sleep(500);
		
	}
	@Test(priority=1)
	public void account() throws InterruptedException
	{
		Account AC = new Account(driver);
		AC.account();
		Thread.sleep(500);
		AC.manage_exchange_rates();
		AC.Action();
		Thread.sleep(500);
		
		AC.account();
		Thread.sleep(500);
		AC.vessel_budgeting();
		AC.Action();
		Thread.sleep(500);
		
		AC.account();
		Thread.sleep(500);
		AC.drc_definitions();
		AC.Action();
		Thread.sleep(500);
	
		AC.account();
		Thread.sleep(500);
		AC.quotation_invoicing();
		Thread.sleep(500);
		AC.index();
		Thread.sleep(500);
		AC.q_i_templates();
		Thread.sleep(500);
		
		AC.account();
		Thread.sleep(500);
		AC.report();
		Thread.sleep(500);
		AC.account_kpis();
		Thread.sleep(500);
		AC.drc_report_tree_view();
		Thread.sleep(500);
		AC.drc_report_month_wise();
		Thread.sleep(500);
		AC.drc_report_calender_wise();
		Thread.sleep(500);
		AC.drc_report_calender_wise_new();
		Thread.sleep(500);
		AC.month_on_month_po_report();
		Thread.sleep(500);
		AC.mis_report();
		Thread.sleep(500);
		AC.approved_pos();
		Thread.sleep(500);
		AC.approved_invoices();
		Thread.sleep(500);
		AC.paid_invoices();
		Thread.sleep(500);
		AC.invoiced_summary();
		Thread.sleep(500);
		
		AC.account();
		Thread.sleep(500);
		AC.libraries();
		Thread.sleep(500);
		AC.mannage_currencies();
		Thread.sleep(500);
		AC.DRC_account_codes();
		Thread.sleep(500);
		AC.DRC_report_acc_categorization();
		Thread.sleep(500);
		AC.debit_card_list();
		Thread.sleep(500);
		AC.QI_service_providers();
		Thread.sleep(500);
		AC.QI_items();
		Thread.sleep(500);
		AC.QI_foot_notes();
		AC.Action();
		Thread.sleep(500);
	}
	@Test(priority=2)
	public void hrm() throws InterruptedException
	{
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
		Thread.sleep(500);
	}

	@Test(priority=3)
	public void technical() throws InterruptedException
	{
		Technical tech = new Technical(driver);
		tech.technical();
		Thread.sleep(500);
		tech.planned_maintainance();
		Thread.sleep(500);
		tech.pms_job_status();
		tech.Action();
		Thread.sleep(500);
		tech.technical();
		Thread.sleep(500);
		tech.planned_maintainance();
		Thread.sleep(500);
		tech.pms_followup_index();
		tech.Action();
		Thread.sleep(500);
		tech.technical();
		Thread.sleep(500);
		tech.planned_maintainance();
		Thread.sleep(500);
		tech.ruuning_hours_weekly_update();
		tech.Action();
		Thread.sleep(500);
		tech.technical();
		Thread.sleep(500);
		tech.planned_maintainance();
		Thread.sleep(500);
		tech.pms_deferment_log();
		Thread.sleep(500);
		tech.Action();
		Thread.sleep(500);
		tech.technical();
		Thread.sleep(500);
		tech.defect_list();
		Thread.sleep(500);
		tech.index();
		Thread.sleep(500);
		tech.pms_change_request_index();
		Thread.sleep(500);
		tech.engine_log_book();
		Thread.sleep(500);
		tech.L_O_Samples_Lab_Tests();
		Thread.sleep(500);
		tech.daily_meetting();
		Thread.sleep(500);
		tech.meeting_index();
		Thread.sleep(500);
		tech.timelapse();
		Thread.sleep(500);
		tech.newbuild_weekly_report();
		Thread.sleep(500);
		tech.weekly_report_index();
		Thread.sleep(500);
		tech.Mooring_Winches_Brake_Holding_Tests();
		Thread.sleep(500);
		tech.critical_alarm_trip_log();
		Thread.sleep(500);
		tech.reports();
		Thread.sleep(500);
		tech.technical_kpi();
		Thread.sleep(500);
		tech.Vessel_Monthly_Summary_Report();
		Thread.sleep(500);
		tech.machinery_search();
		Thread.sleep(500);
		tech.machinery_pms_jobs();
		Thread.sleep(500);
		tech.machinery_current_history();
		Thread.sleep(500);
		tech.machinery_monthly();
		Thread.sleep(500);
		tech.libraries();
		Thread.sleep(500);
		tech.pms_vessel_connections();
		Thread.sleep(500);
		tech.pms_job_list();
		Thread.sleep(500);
		tech.pms_excel_import();
		Thread.sleep(500);
		tech.critical_alarm_trip_library();
		Thread.sleep(500);
		tech.mooring_winches_library();
		Thread.sleep(500);
		tech.Lube_Oil_Sample_Names();
		Thread.sleep(500);
		tech.sfi_list();
		tech.Action();
		
		
		
		
		
		
		
		
		
	}
	@Test(priority=4)
	public void survey_certificates() throws InterruptedException
	{
		Survey_Certificates SC1 = new Survey_Certificates(driver);
		SC1.survey_certificates();
		Thread.sleep(500);
		SC1.Index();
		Thread.sleep(500);
		SC1.Reports();
		Thread.sleep(500);
		SC1.Survey_Certificates_KPI();
		Thread.sleep(500);
		SC1.Libraries();
		Thread.sleep(500);
		SC1.Survey_Categories();
		Thread.sleep(500);
		SC1.Survey_Tenures();
		Thread.sleep(500);
		SC1.Survey_Certificates_Listning();
		Thread.sleep(500);
		SC1.Survey_Vessel_Assignment();
		SC1.Action();
		Thread.sleep(500);
	
	}
	@Test(priority=5)
	public void supplier_portal() throws InterruptedException
	{
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
		Thread.sleep(500);
		
	}
		
}
	



