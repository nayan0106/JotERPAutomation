package com.enix.testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.enix.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	
	ReadConfig	readconfig =new ReadConfig();
	
	String url= readconfig.getbaseurl();
	String browser= readconfig.getbrowser();
	//String Uname= readconfig.getusername();
	//String PWD= readconfig.getpassword();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		String browser= "chrome";
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//for logging
		logger= LogManager.getLogger("JotFramework");
	
	}
//	@AfterClass
//	public void teardown()
//	{
//		driver.close();
//		driver.quit();
//	}
	

}
