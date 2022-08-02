package dbtesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DB_QuerySheets {

	public static FileInputStream fis;
	public static XSSFWorkbook wbook;
	public static XSSFSheet wsheet;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		fis = new FileInputStream("C:\\Users\\gowtham.varadharaj\\Desktop\\excel utils\\DB Query Sheets.xlsx");
		
	    wbook = new XSSFWorkbook(fis);
	    
	    
	    
		
	}

}
