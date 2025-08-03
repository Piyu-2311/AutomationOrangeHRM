package com.orangeHRM.commonUnit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataHandler {

	private Properties pobj=null;
	private DataFormatter formatter=new DataFormatter();
	
	public String getDataFromProperty(String key) {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\Automationwoekspace\\Automation\\src\\main\\resources\\data.properties");
			pobj = new Properties();
			pobj.load(fis);
			
		}
		catch(IOException e) {
			
			e.printStackTrace();
		}
		
		String value=pobj.getProperty(key);
		return value;
		
	}
	
	public String getDataFromExcel(String SheetName , int rowNum, int cellNum) {
		
		FileInputStream fis =null;
		Workbook book=null;
		
		try {
			fis= new FileInputStream("D:\\Automationwoekspace\\Automation\\src\\test\\resources\\Book1.xlsx");
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		try {
			book= WorkbookFactory.create(fis);
		}
		catch(EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		
		Cell cell=book.getSheet(SheetName).getRow(rowNum).getCell(cellNum);
		String value=formatter.formatCellValue(cell);
		return value;
		
	}
	
	

}
