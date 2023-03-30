package com.enix.utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nayan\\eclipse-workspace\\Enix2023\\Softwares\\chromedriver_1.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://uat.joterp.online/default.aspx");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtUserName']")).sendKeys("jyoti");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtPassword']")).sendKeys("Welcome123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread.sleep(500);
		 Actions act = new Actions(driver);
		 
		 driver.findElement(By.xpath("(//*[text()='Operations'])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//*[text()='Noon Reports'])[2]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("	(//*[text()='Index'])[8]")).click();
			
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).click().build().perform();
			
			
			driver.findElement(By.xpath("(//*[text()='Operations'])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//*[text()='Noon Reports'])[2]")).click();
			Thread.sleep(500);
			//String str2 = driver.findElement(By.xpath("//*[text()=\"ASM - Excel Noon Report\"]")).getText();
			 driver.findElement(By.xpath("//*[text()=\"ASM - Excel Noon Report\"]")).click();
			
			
			driver.findElement(By.xpath("(//*[text()=\"Operations\"])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//*[text()=\"Noon Reports\"])[2]")).click();
			Thread.sleep(500);
			//String str3 = driver.findElement(By.xpath("(//*[text()=\"CII Details\"])[1]")).getText();
			
			 driver.findElement(By.xpath("(//*[text()=\"CII Details\"])[1]")).click();
			
		//	 Thread.sleep(500);
			 
			 
			 
			 
				
				driver.findElement(By.xpath("(//*[text()=\"Operations\"])[1]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath("(//*[text()=\"Noon Reports\"])[2]")).click();
				 Thread.sleep(500);
			//	String str4 = driver.findElement(By.xpath("//*[text()=\"CII Calculation\"]")).getText();
				 driver.findElement(By.xpath("//*[text()=\"CII Calculation\"]")).click();
			 
			 Thread.sleep(500);
			 
			 
			
			
		 
		
		Set<String> handles = driver.getWindowHandles();
	 ArrayList<String > array = new ArrayList(handles);
	HashMap<String, String> URLandTitle = new HashMap<String, String>();
	for(String windows:array)
	{
		String title = driver.switchTo().window(windows).getTitle();
		String url = driver.switchTo().window(windows).getCurrentUrl();
		
		URLandTitle.put(title, url);
	}
		 
	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet("excel");
   ArrayList<String> fieldsname = new ArrayList<String>();
   fieldsname.add("Title");
   fieldsname.add("URL");
   int column=0;
   
   for(String names :fieldsname)
   {
	  XSSFCell value = sheet.createRow(0).createCell(column);
	  value.setCellValue(names);
	  column=column+1;
   }
   
   int row=1;
   for(Map.Entry entry :URLandTitle.entrySet())
   {
	   XSSFRow R = sheet.createRow(row);
	  R.createCell(0).setCellValue((String)entry.getKey());
	  R.createCell(1).setCellValue((String)entry.getKey());
	  row=row+1;
   }
	
   
   String filepath="C:\\Users\\Nayan\\eclipse-workspace\\JotFramework\\target\\data.xlsx";
   
  FileOutputStream OS = new FileOutputStream(filepath);
  workbook.write(OS);
  OS.close();
		 
		 
		 
		 
		 
		 
		 
	
		 
		
	}

}
