package com.enix.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Procurement
{
	
	WebDriver driver;

	public Procurement(WebDriver ldriver)
	{

		driver= ldriver;

		PageFactory.initElements(driver, this);

	}
	
	
	
	
	@FindBy(xpath="(//*[text()=\"Procurement\"])[1]")WebElement PRO;
	@FindBy(xpath="//*[text()=\"Procurement Process\"]")WebElement PROPR;
	@FindBy(xpath="//*[text()=\"Direct Purchase\"]")WebElement DP;
	@FindBy(xpath="//*[text()=\"Approved Supplier List\"]")WebElement ASL ;
	@FindBy(xpath="//*[text()=\"Account Payable Portal\"]")WebElement APP ;
	@FindBy(xpath="//*[text()=\"Procurement Followup Index\"]")WebElement PFI;
	@FindBy(xpath="//*[text()=\"Supplier Contracts Module\"]")WebElement SCM;
	@FindBy(xpath="//*[text()=\"Inventory Management\"]")WebElement IM;
	@FindBy(xpath="//*[text()=\"Ship Manager Commission\"]")WebElement SMC;
	@FindBy(xpath="(//*[text()=\"Reports\"])[10]")WebElement REPO;
	@FindBy(xpath="//*[text()=\"Procurement KPIs\"]")WebElement PKPI;
	@FindBy(xpath="//*[text()=\"Supplier Statistics Report\"]")WebElement SSR;
	@FindBy(xpath="//*[text()=\"Inventory Report\"]")WebElement IR;
	@FindBy(xpath="//*[text()=\"Machinery Listing\"]")WebElement ML;
	@FindBy(xpath="//*[text()=\"Delivery Report\"]")WebElement DR;
	@FindBy(xpath="//*[text()=\"Ship Manager Commission Report\"]")WebElement SMCR;
	@FindBy(xpath="//*[text()=\"Accrual Report\"]")WebElement AR;
	@FindBy(xpath="(//*[text()=\"Libraries\"])[8]")WebElement LIBRARIES;
	@FindBy(xpath="//*[text()=\"Procurement Departments\"]")WebElement PD;
	@FindBy(xpath="//*[text()=\"Units And Packings\"]")WebElement UP;
	@FindBy(xpath="//*[text()=\"Requisitions Templates\"]")WebElement RT;
	@FindBy(xpath="//*[text()=\"Catalogues/Machinery\"]")WebElement CM;
	@FindBy(xpath="//*[text()=\"Catalogue - Excel Import\"]")WebElement CEI ;
	@FindBy(xpath="//*[text()=\"Catalogue Items - Excel Import\"]")WebElement CIEI ;
	@FindBy(xpath="//*[text()=\"RFQ Terms & Conditions\"]")WebElement RFQTC ;
	@FindBy(xpath="//*[text()=\"PO Terms & Conditions\"]")WebElement  POTC;
	@FindBy(xpath="//*[text()=\"ASL - Excel Import\"]")WebElement  ASLEI;
	@FindBy(xpath="//*[text()=\"ASL Evaluation Questions\"]")WebElement ASLEQ ;
	@FindBy(xpath="//*[text()=\"Supplier Document Types\"]")WebElement  SDT;
	@FindBy(xpath="//*[text()=\"Supplier-Type & Dept Mapping\"]")WebElement STDM ;
	@FindBy(xpath="//*[text()=\"PO-Type & Tacit Approval Mapping\"]")WebElement OPTTAM ;
	
	public void procurement()
	{
		PRO.click();
	}
	public void Procurement_Process()
	{
		PROPR.click();
	}
	public void Direct_Purchase()
	{
		DP.click();
	}
	public void Approved_Supplier_List()
	{
		ASL.click();
	}
	public void Account_Payable_Portal()
	{
		APP.click();
	}
	public void Procurement_Followup_Index()
	{
		PFI.click();
	}
	
	public void Supplier_Contracts_Module()
	{
		SCM.click();
	}
	public void Inventory_Management()
	{
		IM.click();
	}
	public void Ship_Manager_Commission()
	{
		SMC.click();
	}
	public void Reports()
	{
		REPO.click();
	}
	public void Procurement_KPIs()
	{
		PKPI.click();
	}
	public void Supplier_Statistics_Report()
	{
		SSR.click();
	}
	public void Inventory_Report()
	{
		IR.click();
	}
	public void Machinery_Listing()
	{
		ML.click();
	}
	public void Delivery_Report()
	{
		DR.click();
	}
	public void Ship_Manager_Commission_Report()
	{
		SMCR.click();
	}
	public void Accrual_Report()
	{
		AR.click();
	}
	public void Libraries()
	{
		LIBRARIES.click();
	}
	public void Procurement_Departments()
	{
		PD.click();
	}
	public void Units_Packings()
	{
		UP.click();
	}
	public void Requisitions_Templates()
	{
		RT.click();
	}
	public void Catalogues_Machinery()
	{
		CM.click();
	}
	public void Catalogue_Excel_Import()
	{
		CEI.click();
	}
	public void Catalogue_Items_Excel_Import()
	{
		CIEI.click();
	}
	public void RFQ_Terms_Conditions()
	{
		RFQTC.click();
	}
	public void PO_Terms_Conditions()
	{
		POTC.click();
	}
	public void ASl_Excel_Import()
	{
		ASLEI.click();
	}
	public void ASL_Evaluation_Questions()
	{
		ASLEQ.click();
	}
	public void Supplier_Document_Types()
	{
		SDT.click();
	}
	public void Supplier_Type_Dept_Mapping()
	{
		STDM.click();
	}
	public void PO_Type_Tacit_Approval_Mapping()
	{
		OPTTAM.click();
	}
	
	public void Action()
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click().build().perform();
	}
	

}
