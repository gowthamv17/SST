package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {

	public static void main(String[] args) throws IOException{
		
		File f = new File("D:\\Selenium files\\workspace\\ExcelDataDriven\\src\\excel\\data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet s = w.getSheet("Sheet1");
		int r = s.getPhysicalNumberOfRows();
		System.out.println(r);
		
		

	}

}
