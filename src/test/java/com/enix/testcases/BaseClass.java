package com.enix.testcases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v108.log.Log;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.*;


import com.enix.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	
	ReadConfig	readconfig =new ReadConfig();
	String url= readconfig.getbaseurl();
	String browser= readconfig.getbrowser();
	String Uname= readconfig.getusername();
	String Pwd= readconfig.getpassword();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeSuite
	public void setup() throws IOException
	{
	//	String browser= "chrome";
		String browser="C:\\Users\\Nayan\\eclipse-workspace\\JotFramework\\Drivers\\chromedriver.exe";
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(600));
		driver.manage().timeouts().setScriptTimeout(15, TimeUnit.MINUTES);
		
//		FluentWait wait = new FluentWait(driver);
//		
//		wait.withTimeout(20, TimeUnit.SECONDS);
//		wait.pollingEvery(20, TimeUnit.SECONDS);
//		wait.ignoring(exceptionType)
	
		
		

		//for logging
		logger= LogManager.getLogger("JotFramework");
		System.out.println();
		
	}
	
	
	@AfterTest
	public void window() throws IOException
	{
		
		
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
	//	XSSFSheet sheet2 = workbook.createSheet("excel");
	   ArrayList<String> fieldsname = new ArrayList<String>();
	   fieldsname.add("TITLE");
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
		  R.createCell(1).setCellValue((String)entry.getValue());
		  row=row+1;
	   }
		
	   String filepath="C:\\Users\\Nayan\\eclipse-workspace\\JotFramework\\target\\data.xlsx";
	   
	  FileOutputStream OS = new FileOutputStream(filepath);
	  workbook.write(OS);
	  OS.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
//	Set<String> handles = driver.getWindowHandles();
//	Iterator<String> it = handles.iterator();
//
//	String parent = it.next();
//	String child = it.next();
//	String child1 = it.next();
//	String child2 = it.next();
//	String child3 = it.next();
//	String child4 = it.next();
//	String child5 = it.next();
//	String child6 = it.next();
//	String child7 = it.next();
//	String child8 = it.next();
//	String child9 = it.next();
//	String child10 = it.next();
//	String child11= it.next();
//	String child12 = it.next();
//	String child13 = it.next();
//	String child14 = it.next();
//	String child15 = it.next();
//	String child16 = it.next();
//	String child17 = it.next();
//	String child18 = it.next();
//	String child19 = it.next();
//	String child20= it.next();
//	String child21 = it.next();
//	String child22 = it.next();
//	String child23= it.next();
//	String child24 = it.next();
//	String child25 = it.next();
//	String child26 = it.next();
//	String child27 = it.next();
//	String child28 = it.next();
//	String child29 = it.next();
//	String child30 = it.next();
//	String child31 = it.next();
//	String child32 = it.next();
//   String child33 = it.next();
//	String child34= it.next();
//	String child35 = it.next();
//	String child36 = it.next();
//	String child37 = it.next();
//	String child38 = it.next();
//	String child39 = it.next();
//	String child40 = it.next();
//	String child41 = it.next();
//	String child42 = it.next();
//	String child43= it.next();
////	String child44 = it.next();
////	String child45 = it.next();
////	String child46= it.next();
////	String child47 = it.next();
////	String child48 = it.next();
////	String child49 = it.next();
////	String child50= it.next();
////	String child51 = it.next();
////	String child52 = it.next();
////	String child53= it.next();
////	String child54= it.next();
////	String child55 = it.next();
////	String child56 = it.next();
////	String child57= it.next();
////	String child58= it.next();
////	String child59 = it.next();
////	String child60 = it.next();
////	String child61= it.next();
////	String child62= it.next();
////	String child63 = it.next();
////	String child64 = it.next();
////	String child65= it.next();
////	String child66= it.next();
////	String child67 = it.next();
////	String child68 = it.next();
////	String child69= it.next();
////	String child70= it.next();
////	String child71 = it.next();
////	String child72 = it.next();
////	String child73= it.next();
////	String child74= it.next();
////	String child75 = it.next();
////	String child76= it.next();
////	String child77= it.next();
////	String child78= it.next();
////	String child79 = it.next();
////	String child80 = it.next();
////	String child81= it.next();
////	String child82 = it.next();
////	String child83 = it.next();
////	String child84= it.next();
////	String child85= it.next();
////	String child86 = it.next();
////	String child87= it.next();
////	String child88= it.next();
////	String child89= it.next();
////	String child90 = it.next();
////	String child91 = it.next();
////	String child92= it.next();
////	String child93 = it.next();
////	String child94= it.next();
////	String child95 = it.next();
////	String child96 = it.next();
////	String child97= it.next();
////	String child98= it.next();
////	String child99 = it.next();
////	String child100= it.next();
////	String child101= it.next();
////	String child102= it.next();
////	String child103 = it.next();
////	String child104 = it.next();
////	String child105= it.next();
////	String child106= it.next();
////	String child107= it.next();
////	String child108= it.next();
////	String child109= it.next();
////	String child110 = it.next();
////	String child111 = it.next();
////	String child112= it.next();
//	
//	driver.switchTo().window(parent);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child1);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child2);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child3);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child4);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child5);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child6);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child7);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child8);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child9);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child10);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child11);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child12);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child13);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child14);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child15);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child16);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child17);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child18);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child19);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child20);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child21);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child22);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child23);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child24);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child25);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child26);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child27);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child28);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child29);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child30);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//     driver.switchTo().window(child31);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child32);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child33);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child34);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child35);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child36);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child37);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child38);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child39);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child40);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child41);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child42);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
//	driver.switchTo().window(child43);
//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
//	System.out.println();
////	driver.switchTo().window(child44);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child45);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child46);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child47);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child48);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child49);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child50);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child51);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child52);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child53);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child54);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child55);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child56);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child57);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child58);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child59);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child60);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child61);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child62);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child63);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child64);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child65);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();	
////	driver.switchTo().window(child66);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child67);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child68);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child69);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child70);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child71);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child72);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child73);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child74);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child75);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child76);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child77);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child78);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child79);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child80);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child81);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child82);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child83);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child84);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child85);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child86);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child87);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child88);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child89);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child90);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child91);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child92);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child93);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child94);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child95);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child96);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child97);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child98);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child99);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child100);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child101);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child103);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child104);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child105);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child106);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child107);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child108);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child109);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child110);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child111);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
////	driver.switchTo().window(child112);
////	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
////	System.out.println();
//	
//	
//	
//	
//	
	}
	


}
