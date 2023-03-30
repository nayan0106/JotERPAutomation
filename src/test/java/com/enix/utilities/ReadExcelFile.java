package com.enix.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile 
{
	
	
	
	public Object[][] searchdataProviderMethod()
	{
		
		Object[][] searchData= new Object[2][1];
		searchData[0][0]= "";
		searchData[0][1]="";
		
		return searchData;
		
	}
	public String [][] getExcelData(String Filename, String sheetname)
	{
		
		String [][] data=null;
		try {
			FileInputStream file = new FileInputStream(Filename);
			
			XSSFWorkbook WorkBook= new XSSFWorkbook(file);
			XSSFSheet excelsheet = WorkBook.getSheet(sheetname);
			int noofrows = excelsheet.getLastRowNum()+1;
			int noofcoloumn = excelsheet.getRow(0).getLastCellNum();
			for(int currentrow=1; currentrow<noofrows; currentrow++)
			{
				for(int currentcell=0; currentcell<noofcoloumn; currentcell++)
				{
					
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
	
	
	

}
