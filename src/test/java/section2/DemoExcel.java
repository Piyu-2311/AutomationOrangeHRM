package section2;


import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoExcel {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Automationwoekspace\\Automation\\src\\test\\resources\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh= book. getSheet("Sheet1");
		Row ro=sh.getRow(0);
		Cell cel=ro.getCell(0);
		String value= cel.getStringCellValue();
		System.out.println(value);
		
		Cell cel1=sh.getRow(3).getCell(1);
		double data=cel1.getNumericCellValue();
		System.out.println(data);
	
	}
	

}
