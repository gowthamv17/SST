package exceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Exceldatas {

	public static XSSFWorkbook wbook;
	public static XSSFSheet wsheet;
	public static XSSFSheet wsheet1;
	public static XSSFSheet wsheet2;
	public static XSSFSheet wsheet3;
	public static String urls;
	public static String username;
	public static String password;
	public static FileInputStream fis;
	public static WebDriver driver;
	
	
public static void readexcel() throws IOException {
		
		  fis = new FileInputStream("C:\\Users\\gowtham.varadharaj\\Documents\\Cloud BLM Automation Sheet.xls");
	      wbook = new XSSFWorkbook(fis);
	      wsheet = wbook.getSheetAt(0);
	      urls = wsheet.getRow(2).getCell(2).getStringCellValue();
	      System.out.println(urls);
	      wsheet1 = wbook.getSheetAt(1);
	      username = wsheet1.getRow(4).getCell(2).getStringCellValue();
	      System.out.println(username);
	      password = wsheet1.getRow(4).getCell(3).getStringCellValue();
	      System.out.println(password);
	      wsheet2 = wbook.getSheetAt(2);
	      wsheet3 = wbook.getSheetAt(3);
	      //XSSFRow row = wsheet3.getRow(0);
	     int rowcount = wsheet3.getLastRowNum()-wsheet3.getFirstRowNum();
	     System.out.println(rowcount);
	      
	      
		  
	}

}
