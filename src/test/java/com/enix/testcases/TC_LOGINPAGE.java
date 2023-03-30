package com.enix.testcases;

import java.util.Iterator;
import java.util.Set;

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.enix.pageobject.Account;
import com.enix.pageobject.Admin;
import com.enix.pageobject.HRM;
import com.enix.pageobject.Loginpage;
import com.enix.pageobject.Procurement;
import com.enix.pageobject.Supplier_Portal;
import com.enix.pageobject.Survey_Certificates;
import com.enix.pageobject.Technical;
import com.enix.pageobject.Travel;
import com.enix.pageobject.UAT_Operation;


public class TC_LOGINPAGE extends BaseClass
{
	@BeforeClass
	//@Test
	public void verifylogin() throws InterruptedException
	{
		
		driver.get(url);
	//	logger.info("url opened");
		
		Loginpage LP = new Loginpage(driver);
		LP.enterusername(Uname);
		LP.enterpassword(Pwd);
		LP.clicklogin();
	//	logger.info("login successfulL");
		Thread.sleep(500);
		
		
	}
	
//	@Test
//	public void admin() throws InterruptedException
//	{
//		Thread.sleep(500);
//		Admin ad = new Admin(driver);
//		ad.admin();
//		 ad.Action();
//		Thread.sleep(500);
//		ad.admin();
//		Thread.sleep(500);
//		ad.user_menu();
//		Thread.sleep(500);
//		ad.menu_management();
//		 ad.Action();
//		Thread.sleep(500);
////		ad.admin();
////		Thread.sleep(500);
//		ad.admin();
//		Thread.sleep(500);
//		ad.user_menu();
//		Thread.sleep(500);
//		ad.user_management();
//		 ad.Action();
//		Thread.sleep(500);
//		ad.admin();
//		Thread.sleep(500);
//		ad.user_menu();
//		Thread.sleep(500);
//		ad.user_management_relationship();
//		 ad.Action();
//		Thread.sleep(500);
//		ad.admin();
//		Thread.sleep(500);
//		ad.user_menu();
//		Thread.sleep(500);
//		ad.user_approval_limits();
//		 ad.Action();
//		Thread.sleep(500);
//		ad.admin();
//		Thread.sleep(500);
//		ad.user_menu();
//		Thread.sleep(500);
//		ad.po_user_relationship();
//		Thread.sleep(500);
//		ad.admin();
//		Thread.sleep(500);
//		ad.user_menu();
//		Thread.sleep(500);
//	    ad.user_dashboard_button_access();
//	    ad.Action();
//		Thread.sleep(500);
//		ad.admin();
//		Thread.sleep(500);
//		ad.user_menu();
//		Thread.sleep(500);
//	    ad.user_vessel_relationship();
//		Thread.sleep(500);
//		ad.admin();
//		Thread.sleep(500);
//		ad.user_menu();
//		Thread.sleep(500);
//	    ad.User_Mobile_Devices();
//	    ad.Action();
//		Thread.sleep(500);
//		ad.admin();
//		Thread.sleep(500);
//		ad.user_menu();
//		Thread.sleep(500);
//	    ad.HR_User_Company_Access();
//	    ad.Action();
//		Thread.sleep(500);
//		ad.admin();
//		Thread.sleep(500);
//		ad.user_menu();
//		Thread.sleep(500);
//	    ad.User_Alert_Relationship();
//		Thread.sleep(500);
//		ad.admin();
//		Thread.sleep(500);
//		ad.user_menu();
//		Thread.sleep(500);
//	    ad.Crew_Portal_Menu_Access();
//	    ad.Action();
//		Thread.sleep(500);
//		ad.admin();
//		Thread.sleep(500);
//		ad.user_menu();
//		Thread.sleep(500);
//	    ad.Onboard_Module_Menu_Access();
//	    ad.Action();
//		Thread.sleep(500);
//				
//		ad.admin();
//		Thread.sleep(500);
//	    ad.Administrative_Panel();
//	     ad.Action();
//	    Thread.sleep(500);
//	    
//		ad.admin();
//		Thread.sleep(500);
//	    ad.Application_Settings();
//	    Thread.sleep(500);
//	    
//	    ad.admin();
//		Thread.sleep(500);
//	    ad.Manage_Scheduler();
//	    Thread.sleep(500);
//	    ad.File_Size_Reduction();
//	    Thread.sleep(500);
//	    ad.Sync_Packet_Viewer();
//	    Thread.sleep(500);
//	    ad.Jot_ERP_Implementation();
//	    Thread.sleep(500);
//	    ad.Implementation_Report();
//	    Thread.sleep(500);
//	    ad.Implementation_Report_Grid();
//	    Thread.sleep(500);
//	    ad.Manage_Task();
//	    Thread.sleep(500);
//	    ad.Manage_Projects();
//	    Thread.sleep(500);
//	    ad.Training_Log();
//	    Thread.sleep(500);
//	    ad.User_Log();
//	    Thread.sleep(500);
//	    ad.Feedback();
//	    ad.Action();
//	    Thread.sleep(500);
//	
//	    
//	    ad.admin();
//		Thread.sleep(500);
//	    ad.Reports();
//	    Thread.sleep(500);
//	    ad.Sister_vessel_reports();
//	    Thread.sleep(500);
//	    ad.Reports();
//	    Thread.sleep(500);
//	    ad.Manage_report_connection();
//	    Thread.sleep(500);
//	    ad.Manage_Reports();
//	    Thread.sleep(500);
//	    ad.View_Reports();
//	    ad.Action();
//	    Thread.sleep(500);
//	    
//	    ad.admin();
//		Thread.sleep(500);
//	    ad.Libraries();
//		Thread.sleep(500);
//	    ad.Companies();
//		Thread.sleep(500);
//	    ad.Company_Offices();
//		Thread.sleep(500);
//	    ad.Company_Bank_Accounts();
//		Thread.sleep(500);
//	    ad.Company_Office_Holidays();
//		Thread.sleep(500);
//	    ad.Fleets();
//		Thread.sleep(500);
//	    ad.Vessel_Flags();
//		Thread.sleep(500);
//	    ad.VesselFlag_Vessel_Manager_Relation();
//		Thread.sleep(500);
//	    ad.Vessels();
//		Thread.sleep(500);
//	    ad.Office_Departments();
//		Thread.sleep(500);
//	    ad.Vessel_Departments();
//		Thread.sleep(500);
//	    ad.Countries();
//		Thread.sleep(500);
//	    ad.Cities();
//		Thread.sleep(500);
//	    ad.Airports();
//		Thread.sleep(500);
//	    ad.Ports();
//		Thread.sleep(500);
//	    ad.System_parameters();
//		Thread.sleep(500);
//	    ad.Dashboard_Notification_Buttons();
//		Thread.sleep(500);
//	    ad.KPIs_Report();
//		Thread.sleep(500);
//	    ad.Manage_Personal_Alerts();
//		Thread.sleep(500);
//	    ad.Change_Log();
//		Thread.sleep(500);
//	    ad.Site_Map();
//	  ad.Action();
//	  ad.window();
//	  Thread.sleep(500);
//		
//	}
//	@Test
//	public void account() throws InterruptedException
//	{
//		Account AC = new Account(driver);
//		AC.account();
//		Thread.sleep(500);
//		AC.manage_exchange_rates();
//		AC.Action();
//	//	AC.window();
//		Thread.sleep(500);
//		
//		AC.account();
//		Thread.sleep(500);
//		AC.vessel_budgeting();
//		AC.Action();
//	//	AC.window();
//		Thread.sleep(500);
//		
//		AC.account();
//		Thread.sleep(500);
//		AC.drc_definitions();
//		AC.Action();
//	//	AC.window();
//		Thread.sleep(500);
//	
//		AC.account();
//		Thread.sleep(500);
//		AC.quotation_invoicing();
//		Thread.sleep(500);
//		AC.index();
//		Thread.sleep(500);
//		AC.q_i_templates();
//		AC.Action();
//	//	AC.window();
//		Thread.sleep(500);
//		
//		AC.account();
//		Thread.sleep(500);
//		AC.report();
//		Thread.sleep(500);
//		AC.account_kpis();
//		Thread.sleep(500);
//		AC.drc_report_tree_view();
//		Thread.sleep(500);
//		AC.drc_report_month_wise();
//		Thread.sleep(500);
//		AC.drc_report_calender_wise();
//		Thread.sleep(500);
//		AC.drc_report_calender_wise_new();
//		Thread.sleep(500);
//		AC.month_on_month_po_report();
//		Thread.sleep(500);
//		AC.mis_report();
//		Thread.sleep(500);
//		AC.approved_pos();
//		Thread.sleep(500);
//		AC.approved_invoices();
//		Thread.sleep(500);
//		AC.paid_invoices();
//		Thread.sleep(500);
//		AC.invoiced_summary();
//		Thread.sleep(500);
//		
//		AC.account();
//		Thread.sleep(500);
//		AC.libraries();
//		Thread.sleep(500);
//		AC.mannage_currencies();
//		Thread.sleep(500);
//		AC.DRC_account_codes();
//		Thread.sleep(500);
//		AC.DRC_report_acc_categorization();
//		Thread.sleep(500);
//		AC.debit_card_list();
//		Thread.sleep(500);
//		AC.QI_service_providers();
//		Thread.sleep(500);
//		AC.QI_items();
//		Thread.sleep(500);
//		AC.QI_foot_notes();
//		AC.Action();
//	//	AC.window();
//		Thread.sleep(500);
//	}
//	@Test()
//	public void hrm() throws InterruptedException
//	{
//		HRM HR = new HRM(driver);
//		HR.HRM();
//		Thread.sleep(500);
//		HR.REPORT();
//		Thread.sleep(500);
//		HR.ELS();
//		//HR.window();
//		HR.Action();
//		
//		Thread.sleep(500);
//		HR.HRM();
//		Thread.sleep(500);
//		HR.REPORT();
//		Thread.sleep(500);
//		HR.HRMKPI();
//		HR.Action();
//		//HR.window();
//		Thread.sleep(500);
//		HR.HRM();
//		Thread.sleep(500);
//		HR.HRM2();
//		HR.Action();
//	//	HR.window();
//		Thread.sleep(500);
//		
//	}
//
//	@Test
//	public void technical() throws InterruptedException
//	{
//		Technical tech = new Technical(driver);
//		tech.technical();
//		Thread.sleep(500);
//		tech.planned_maintainance();
//		Thread.sleep(500);
//		tech.pms_job_status();
//		tech.Action();
//		Thread.sleep(500);
//		tech.technical();
//		Thread.sleep(500);
//		tech.planned_maintainance();
//		Thread.sleep(500);
//		tech.pms_followup_index();
//		tech.Action();
//		Thread.sleep(500);
//		tech.technical();
//		Thread.sleep(500);
//		tech.planned_maintainance();
//		Thread.sleep(500);
//		tech.ruuning_hours_weekly_update();
//		tech.Action();
//		Thread.sleep(500);
//		tech.technical();
//		Thread.sleep(500);
//		tech.planned_maintainance();
//		Thread.sleep(500);
//		tech.pms_deferment_log();
//		Thread.sleep(500);
//		tech.Action();
//		Thread.sleep(500);
//		tech.technical();
//		Thread.sleep(500);
//		tech.defect_list();
//		Thread.sleep(500);
//		tech.index();
//		Thread.sleep(500);
//		tech.pms_change_request_index();
//		Thread.sleep(500);
//		tech.engine_log_book();
//		Thread.sleep(500);
//		tech.L_O_Samples_Lab_Tests();
//		Thread.sleep(500);
//		tech.daily_meetting();
//		Thread.sleep(500);
//		tech.meeting_index();
//		Thread.sleep(500);
//		tech.timelapse();
//		Thread.sleep(500);
//		tech.newbuild_weekly_report();
//		Thread.sleep(500);
//		tech.weekly_report_index();
//		Thread.sleep(500);
//		tech.Mooring_Winches_Brake_Holding_Tests();
//		Thread.sleep(500);
//		tech.critical_alarm_trip_log();
//		Thread.sleep(500);
//		tech.reports();
//		Thread.sleep(500);
//		tech.technical_kpi();
//		Thread.sleep(500);
//		tech.Vessel_Monthly_Summary_Report();
//		Thread.sleep(500);
//		tech.machinery_search();
//		Thread.sleep(500);
//		tech.machinery_pms_jobs();
//		Thread.sleep(500);
//		tech.machinery_current_history();
//		Thread.sleep(500);
//		tech.machinery_monthly();
//		Thread.sleep(500);
//		tech.libraries();
//		Thread.sleep(500);
//		tech.pms_vessel_connections();
//		Thread.sleep(500);
//		tech.pms_job_list();
//		Thread.sleep(500);
//		tech.pms_excel_import();
//		Thread.sleep(500);
//		tech.critical_alarm_trip_library();
//		Thread.sleep(500);
//		tech.mooring_winches_library();
//		Thread.sleep(500);
//		tech.Lube_Oil_Sample_Names();
//		Thread.sleep(500);
//		tech.sfi_list();
//		tech.Action();
//
//	}
//	@Test
//	public void survey_certificates() throws InterruptedException
//	{
//		Survey_Certificates SC1 = new Survey_Certificates(driver);
//		SC1.survey_certificates();
//		Thread.sleep(500);
//		SC1.Index();
//		SC1.Action();
//		Thread.sleep(500);
//		SC1.survey_certificates();
//		Thread.sleep(500);
//		SC1.Reports();
//		Thread.sleep(500);
//		SC1.Survey_Certificates_KPI();
//		SC1.Action();
//		Thread.sleep(500);
//		SC1.survey_certificates();
//		Thread.sleep(1000);
//		SC1.Libraries();
//		SC1.Action();
//		Thread.sleep(1000);
//		SC1.Libraries();
//		Thread.sleep(500);
//		SC1.Survey_Categories();
//		Thread.sleep(1000);
//		SC1.Libraries();
//		Thread.sleep(500);
//		SC1.Survey_Tenures();
//		Thread.sleep(1000);
//		SC1.Libraries();
//		Thread.sleep(500);
//		SC1.Survey_Certificates_Listning();
//		Thread.sleep(1000);
//		SC1.Libraries();
//		Thread.sleep(500);
//		SC1.Survey_Vessel_Assignment();
//		SC1.Action();
//		//SC1.window();
//	   Thread.sleep(500);
//	
//	}
//	@Test
//	public void TRAVEL() throws InterruptedException
//	{
//		Travel tr = new Travel(driver);
//		tr.travel();
//		Thread.sleep(500);
//		tr.index();
//		tr.Action();
//		Thread.sleep(500);
//		tr.travel();
//		Thread.sleep(500);
//		tr.reports();
//		Thread.sleep(500);
//		tr.travel_kpis();
//		tr.Action();
//	 //  tr.windows();
//	   Thread.sleep(500);
//	}
//
//	@Test
//	public void supplier_portal() throws InterruptedException
//	{
//		Supplier_Portal sp = new Supplier_Portal(driver);
//		sp.supplier_portal();
//		Thread.sleep(500);
//		sp.Procurement();
//		Thread.sleep(500);
//		sp.Procurement_index();
//		sp.Action();
//		//sp.window();
//		Thread.sleep(500);
//		sp.supplier_portal();
//		Thread.sleep(500);
//		sp.Travel();
//		Thread.sleep(500);
//		sp.Travel_Index();
//		sp.Action();	
//     //	sp.window();
//		Thread.sleep(500);
//		}
    @Test
	public void Operation() throws InterruptedException
	{
		UAT_Operation UO = new UAT_Operation(driver);
//		UO.operation();
//		Thread.sleep(500);
//		UO.Vessel_Info_DB();
//		UO.Action();
//	     Thread.sleep(500);
//         UO.operation();
//		Thread.sleep(500);
//    	UO.Vessel_Voyage();
//    	UO.Action();
//    	Thread.sleep(500);
//		UO.operation();
//		Thread.sleep(500);
//		UO.vessel_port_calls();
//		Thread.sleep(500);
//		UO.index();
//		UO.Action();
//		//UO.window();
//		Thread.sleep(500);
//		UO.operation();
//		Thread.sleep(500);
//		UO.vessel_port_calls();
//		Thread.sleep(500);
//		UO.vessel_port_call_history();
//		UO.Action();
//	//	UO.window();
//		Thread.sleep(500);
//		UO.operation();
//		Thread.sleep(500);
//		UO.vessel_port_calls();
//		Thread.sleep(500);
//		UO.vessel_port_call_index();
//		UO.Action();
//	//	UO.window();
//		Thread.sleep(500);
		
		UO.operation();
		Thread.sleep(500);
		UO.noon_reports();
		Thread.sleep(500);
		UO.index1();
		Thread.sleep(500);
		UO.Action();
	//	UO.window();
		Thread.sleep(500);
		
		UO.operation();
		Thread.sleep(500);
		UO.noon_reports();
		Thread.sleep(500);
		UO.Excel_noon_reports();
	     UO.Action();
	//	UO.window();
		Thread.sleep(500);
		
		UO.operation();
		Thread.sleep(500);
		UO.noon_reports();
		Thread.sleep(500);
		UO.bunker_robs();
		UO.Action();
	//	UO.window();
		Thread.sleep(500);
		
		UO.operation();
		Thread.sleep(500);
		UO.noon_reports();
		Thread.sleep(500);
		UO.NAD_Consumptions_Threshold();
		//Thread.sleep(500);
		UO.Action();
		Thread.sleep(500);
		
		UO.operation();
		Thread.sleep(500);
		UO.noon_reports();
		Thread.sleep(500);
		UO.SEEMP_Resource_Data();
		UO.Action();
		Thread.sleep(500);
		
		UO.operation();
		Thread.sleep(500);
		UO.noon_reports();
		Thread.sleep(500);
		UO.CP_Activity_Log();
		UO.Action();
		Thread.sleep(500);
		
		
		UO.operation();
		Thread.sleep(500);
		UO.noon_reports();
		Thread.sleep(500);
		UO.CP_Consumptions_Index();
		UO.Action();
		Thread.sleep(500);
		
		UO.operation();
		Thread.sleep(500);
		UO.noon_reports();
		Thread.sleep(500);
		UO.CP_Thresholds();
		UO.Action();
		Thread.sleep(500);
		
		UO.operation();
		Thread.sleep(500);
		UO.noon_reports();
		Thread.sleep(500);
		UO.CO2_Permits();
		UO.Action();
		Thread.sleep(500);
		
		UO.operation();
		Thread.sleep(500);
		UO.noon_reports();
		Thread.sleep(500);
		UO.CO2_Emission_Multiplier_Factor();
		UO.Action();
		Thread.sleep(500);
		
		
		UO.operation();
		Thread.sleep(500);
		UO.noon_reports();
		Thread.sleep(500);
		UO.reduction_factor();
		UO.Action();
	//	UO.window();
		Thread.sleep(500);
		
		UO.operation();
		Thread.sleep(500);
		UO.noon_reports();
		Thread.sleep(500);
		UO.Details();
		UO.Action();
		//UO.window();
		Thread.sleep(500);
		
		UO.operation();
		Thread.sleep(500);
		UO.noon_reports();
		Thread.sleep(500);
		UO.Calculation();
		UO.Action();
		Thread.sleep(500);
		
//		UO.operation();
//		Thread.sleep(500);
//		UO.Offshore_Midnight_Report();
//		UO.Action();
//		Thread.sleep(500);
//		UO.operation();
//		Thread.sleep(500);
//		UO.Fleet_Location_Map();
//		UO.Action();
//		Thread.sleep(500);
//		UO.operation();
//		Thread.sleep(500);
//		UO.Deck_Log_Book();
//		UO.Action();
//		Thread.sleep(500);
//		UO.operation();
//		Thread.sleep(500);
//		UO.Voyage_Cargo_Log();
//		UO.Action();
//		Thread.sleep(500);
//		UO.operation();
//		Thread.sleep(500);
//		UO.Barge_Voyage_Log();
//		Thread.sleep(500);
//		UO.Report_Form_Index();
//		Thread.sleep(500);
//		UO.Report_Form_Followup_Index();
//		Thread.sleep(500);
//		UO.Defect_List();
//		Thread.sleep(500);
//		UO.Index2();
//		UO.Action();
//		Thread.sleep(500);
//		UO.operation();
//		Thread.sleep(500);
//		UO.Port_Agents();
//	//	UO.Action();
//		Thread.sleep(500);
//		UO.operation();
//		Thread.sleep(500);
//		UO.Security_Alerts();
//		Thread.sleep(500);
//		UO.Dashboard();
//		Thread.sleep(500);
//		UO.Security_Alerts2();
//		Thread.sleep(500);
//		UO.Vessels_List();
//		Thread.sleep(500);
//		UO.Manage_High_Risk_Areas();
//		Thread.sleep(500);
//		UO.FireArms_Log();
//		Thread.sleep(500);
//		UO.Kit_Index();
//		//UO.Action();
//		Thread.sleep(500);
//		UO.Items();
//	//	UO.Action();
//		Thread.sleep(500);
//		UO.Reports();
//		Thread.sleep(500);
//		UO.Voyage_Abstract_Daily_Report();
//		Thread.sleep(500);
//		UO.Operations_KPI();
//		Thread.sleep(500);
//		//UO.operation();
//	//	Thread.sleep(500);
//		UO.Libraries();
//		Thread.sleep(500);
//		UO.VID_Lib_New();
//		Thread.sleep(500);
//		UO.NAD_Custom_Fields();
//		Thread.sleep(500);
//		UO.NAD_Custom_Fields_Vessel_Assignment();
//		Thread.sleep(500);
//		UO.NAD_Documents();
//		Thread.sleep(500);
//		UO.NAD_Document_vessel_assignment();
//		Thread.sleep(500);
//		UO.OMR_Product_Name();
//		Thread.sleep(500);
//		UO.Deck_Log_Tanks_Hold_Mgmt();
//		Thread.sleep(500);
//		UO.Port_Call_Checklist();
//		Thread.sleep(500);
//	    UO.Report_Forms_List_Mgmt();
//		Thread.sleep(500);
//	    UO.Report_Form_Vessel_Assign();
//		UO.Action();
//		Thread.sleep(500);
	}
//	
//    @Test
//    public void procurement() throws InterruptedException
//    {
//    	Procurement PR = new Procurement(driver);
//    	PR.procurement();
//    	Thread.sleep(500);
//    	PR.Procurement_Process();
//    	Thread.sleep(500);
//    	PR.Direct_Purchase();
//    	Thread.sleep(500);
//    	PR.Approved_Supplier_List();
//    	Thread.sleep(500);
//    	PR.Account_Payable_Portal();
//    	Thread.sleep(500);
//    	PR.Procurement_Followup_Index();
//    	Thread.sleep(500);
//    	PR.Supplier_Contracts_Module();
//    	Thread.sleep(500);
//    	PR.Inventory_Management();
//    	Thread.sleep(500);
//    	PR.Ship_Manager_Commission();
//    	Thread.sleep(500);
//    	PR.Reports();
//    	Thread.sleep(500);
//    	PR.Procurement_KPIs();
//    	Thread.sleep(500);
//    	PR.Supplier_Statistics_Report();
//    	Thread.sleep(500);
//    	PR.Inventory_Report();
//    	Thread.sleep(500);
//    	PR.Machinery_Listing();
//    	Thread.sleep(500);
//    	PR.Delivery_Report();
//    	Thread.sleep(500);
//    	PR.Ship_Manager_Commission_Report();
//    	Thread.sleep(500);
//    	PR.Accrual_Report();
//    	Thread.sleep(500);
//    	PR.Libraries();
//    	Thread.sleep(500);
//    	PR.Procurement_Departments();
//    	Thread.sleep(500);
//    	PR.Units_Packings();
//    	Thread.sleep(500);
//    	PR.Requisitions_Templates();
//    	Thread.sleep(500);
//    	PR.Catalogues_Machinery();
//    	Thread.sleep(500);
//    	PR.Catalogue_Excel_Import();
//    	Thread.sleep(500);
//    	PR.Catalogue_Items_Excel_Import();
//    	Thread.sleep(500);
//    	PR.RFQ_Terms_Conditions();
//    	Thread.sleep(500);
//    	PR.PO_Terms_Conditions();
//    	Thread.sleep(500);
//    	PR.ASl_Excel_Import();
//    	Thread.sleep(500);
//    	PR.ASL_Evaluation_Questions();
//    	Thread.sleep(500);
//    	PR.Supplier_Document_Types();
//    	Thread.sleep(500);
//    	PR.Supplier_Type_Dept_Mapping();
//    	Thread.sleep(500);
//    	PR.PO_Type_Tacit_Approval_Mapping();
//    	PR.Action();
//    	Thread.sleep(500);
//    	
//    	
//   }
//	
//	
//	
//	
//	
	
}
	



