package com.enix.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Practice2
{

	
	public static void main(String[] args) throws InterruptedException 
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
		//driver.findElement(By.xpath("	(//*[text()='Index'])[8]")).click();
		
		String str = driver.findElement(By.xpath("(//*[text()='Index'])[8]")).getText();
		
		 driver.findElement(By.xpath("(//*[text()='Index'])[8]")).click();
		// System.out.println(driver.getTitle());
	//	System.out.println(str);
		
		
		Thread.sleep(500);
		act.keyDown(Keys.CONTROL).click().build().perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[text()='Operations'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[text()='Noon Reports'])[2]")).click();
		Thread.sleep(500);
		String str2 = driver.findElement(By.xpath("//*[text()=\"ASM - Excel Noon Report\"]")).getText();
		 driver.findElement(By.xpath("//*[text()=\"ASM - Excel Noon Report\"]")).click();
	//	System.out.println(str2);
		
		
		driver.findElement(By.xpath("(//*[text()=\"Operations\"])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[text()=\"Noon Reports\"])[2]")).click();
		Thread.sleep(500);
		String str3 = driver.findElement(By.xpath("(//*[text()=\"CII Details\"])[1]")).getText();
		
		 driver.findElement(By.xpath("(//*[text()=\"CII Details\"])[1]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("(//*[text()=\"Operations\"])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//*[text()=\"Noon Reports\"])[2]")).click();
			Thread.sleep(500);
			
			String str4 = driver.findElement(By.xpath("//*[text()=\"CII Calculation\"]")).getText();
			 driver.findElement(By.xpath("//*[text()=\"CII Calculation\"]")).click();
			 Thread.sleep(500);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parent = it.next();
		Thread.sleep(100);
		String child = it.next();
		Thread.sleep(100);
		String child1 = it.next();
		Thread.sleep(100);
		String child2 = it.next();
		Thread.sleep(100);
		
		driver.switchTo().window(parent);
		//System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
		System.out.println();
		
		driver.switchTo().window(child);
	//	System.out.println(driver.getTitle()+"   :     "+ driver.getCurrentUrl());
		System.out.println();
		driver.switchTo().window(child1);
		System.out.println();
		driver.switchTo().window(child2);
		System.out.println();
		try
		{
			PrintStream ps = new PrintStream(new File("C:\\Users\\Nayan\\Documents\\Custom Office Templates\\DemoFile.xls"));
			System.setOut(ps);
			
			ps.print(driver.getTitle()+"            "+driver.getCurrentUrl());
			System.out.println();
			ps.print(str);
			System.out.println();
			ps.print(str2+"="+driver.getCurrentUrl());
			System.out.println();
			ps.print(str2);
			System.out.println();
			ps.println(driver.getCurrentUrl());
			System.out.println();
			ps.print(str3);
			System.out.println();
		ps.println(driver.getCurrentUrl());
			System.out.println();
			ps.print(str4);
		}
		catch (FileNotFoundException ft)
		{
         System.out.println(ft);

		}
		
//		Thread.sleep(500);
//		
//		driver.findElement(By.xpath("(//*[text()='Operations'])[1]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("(//*[text()='Noon Reports'])[2]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//*[text()='Bunker ROBs and Costs']")).click();
//		Thread.sleep(500);
//		
//		driver.findElement(By.xpath("(//*[text()='Operations'])[1]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("(//*[text()='Noon Reports'])[2]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//*[text()=\"NAD Consumptions' Threshold\"]")).click();
//		Thread.sleep(500);
//
//		driver.findElement(By.xpath("(//*[text()='Operations'])[1]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("(//*[text()='Noon Reports'])[2]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//*[text()=\"SEEMP Resource Data\"]")).click();
//		Thread.sleep(500);
//	
//		
//	 driver.findElement(By.xpath("(//*[text()='Operations'])[1]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("(//*[text()='Noon Reports'])[2]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//*[text()='CP Thresholds']")).click();
//		Thread.sleep(500);
//		
//	 driver.findElement(By.xpath("(//*[text()='Operations'])[1]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("(//*[text()='Noon Reports'])[2]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//*[text()='CO2 Permits']")).click();
//		Thread.sleep(500);
//		
//	 driver.findElement(By.xpath("(//*[text()=\"Operations\"])[1]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("(//*[text()=\"Noon Reports\"])[2]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//*[text()=\"CO2 Emission Multiplier Factor\"]")).click();
//		
//		Thread.sleep(500);
//	 	driver.findElement(By.xpath("(//*[text()=\"Operations\"])[1]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("(//*[text()=\"Noon Reports\"])[2]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("(//*[text()=\"CII Reduction Factor\"])[1]")).click();
//		Thread.sleep(500);
//		
//		driver.findElement(By.xpath("(//*[text()=\"Operations\"])[1]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("(//*[text()=\"Noon Reports\"])[2]")).click();
//		Thread.sleep(500);
//		 driver.findElement(By.xpath("(//*[text()=\"CII Details\"])[1]")).click();
//			Thread.sleep(500);
//			
//			driver.findElement(By.xpath("(//*[text()=\"Operations\"])[1]")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("(//*[text()=\"Noon Reports\"])[2]")).click();
//			Thread.sleep(500);
//			 driver.findElement(By.xpath("//*[text()=\"CII Calculation\"]")).click();
//			
//			 Thread.sleep(500);
//		
//		Set<String> handles = driver.getWindowHandles();
//		//ArrayList<String> list = new ArrayList<String>(handles);
//		
//		Iterator<String> it = handles.iterator();
//		String parent = it.next();
//		Thread.sleep(500);
//		String child = it.next();
//		Thread.sleep(500);
//		String child1 = it.next();
//		Thread.sleep(500);
//		String child2 = it.next();
//		Thread.sleep(500);
//		String child3 = it.next();
//		Thread.sleep(500);
//		String child4 = it.next();
//		Thread.sleep(500);
//		String child5 = it.next();
//		Thread.sleep(500);
//		String child6 = it.next();
//		Thread.sleep(500);
//		String child7 = it.next();
//		Thread.sleep(500);
//		String child8 = it.next();
//		Thread.sleep(500);
//		
//	//	Thread.sleep(500);
//		driver.switchTo().window(parent);
//		System.out.println(driver.getTitle()+"       :     "+ driver.getCurrentUrl());
//		driver.switchTo().window(child);
//		System.out.println(driver.getTitle()+"        :     "+driver.getCurrentUrl());
////		System.out.println(driver.getCurrentUrl());
//		driver.switchTo().window(child1);
//		System.out.println(driver.getTitle()+"        :     "+ driver.getCurrentUrl());	 
//		driver.switchTo().window(child2);
//		System.out.println(driver.getTitle()+"        :     "+driver.getCurrentUrl());
//	//	System.out.println( driver.getCurrentUrl());
//		driver.switchTo().window(child3);
//		System.out.println(driver.getTitle()+"        :     "+driver.getCurrentUrl());
//		driver.switchTo().window(child4);
//		System.out.println(driver.getTitle()+"        :     "+driver.getCurrentUrl());
//		driver.switchTo().window(child5);
//		System.out.println(driver.getTitle()+"        :     "+driver.getCurrentUrl());
//		driver.switchTo().window(child6);
//		System.out.println(driver.getTitle()+"        :     "+driver.getCurrentUrl());
//		driver.switchTo().window(child7);
//		System.out.println(driver.getTitle()+"        :     "+driver.getCurrentUrl());
//		driver.switchTo().window(child8);
//		System.out.println(driver.getTitle()+"        :     "+driver.getCurrentUrl());
//		
	}
}
