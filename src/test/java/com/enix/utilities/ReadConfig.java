package com.enix.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;



public class ReadConfig 
{
	
	
	Properties properties;
	 String path="C:\\Users\\Nayan\\eclipse-workspace\\JotFramework\\Configuration\\prop.properties";
	 
	 public ReadConfig()
	 {
		 try {
		 properties = new Properties();
		 
		 
			FileInputStream file= new FileInputStream(path);
			properties.load(file);
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
	 }
	 
	 public String getbaseurl()
	 {
		String value= properties.getProperty("url") ;
		 
		 if(value !=null)
			 return value;
		 else
			 throw new RuntimeException("url not specified in config");	 
	 }
	 public String getbrowser()
	 {
		String value= properties.getProperty("browser") ;
		 
		 if(value !=null)
			 return value;
		 else
			 throw new RuntimeException("url not specified in config");	 
	 }
	 public String getusername()
	 {
		String value= properties.getProperty("Uname") ;
		 
		 if(value !=null)
			 return value;
		 else
			 throw new RuntimeException("url not specified in config");	 
	 }
	 public String getpassword()
	 {
		String value= properties.getProperty("PWD") ;
		 
		 if(value !=null)
			 return value;
		 else
			 throw new RuntimeException("url not specified in config");	 
	 }
//	 
//	 
	 
}
