package POM;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import CloudBLM.CloudBLM.Baseclass;

public class CreateProject extends Baseclass{
	
	public static void Createproject() throws InterruptedException{
		
		driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.linkText("Manage Projects")).click();
		driver.findElement(By.xpath("//button[text()='CREATE ']")).click();
		
		WebElement Projectname = driver.findElement(By.id("projectName"));
		Projectname.sendKeys(wsheet2.getRow(3).getCell(3).getStringCellValue());
		
		Select projtype = new Select(driver.findElement(By.xpath("//select[@formcontrolname='ProjectTypeID']")));
		System.out.println(projtype);
		projtype.selectByVisibleText(wsheet2.getRow(4).getCell(3).getStringCellValue());
		
		Select subprojtype = new Select(driver.findElement(By.xpath("//select[@formcontrolname='ProjectSubTypeID']")));
		System.out.println(subprojtype);
		subprojtype.selectByVisibleText(wsheet2.getRow(5).getCell(3).getStringCellValue());
		
		Select constype = new Select(driver.findElement(By.xpath("//select[@formcontrolname='ConstructionTypeID']")));
		System.out.println(constype);
		constype.selectByVisibleText(wsheet2.getRow(6).getCell(3).getStringCellValue());
		
		
		Select conttype = new Select(driver.findElement(By.xpath("//select[@formcontrolname='ContractTypeID']")));
		System.out.println(conttype);
		conttype.selectByVisibleText(wsheet2.getRow(7).getCell(3).getStringCellValue());
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		String currentdate = dateFormat.format(c.getTime());
		System.out.println(currentdate);
		c.add(Calendar.DATE, 5);
		String enddate = dateFormat.format(c.getTime());
		System.out.println(enddate);
		
	//	String currentdate = ;
		
		
		WebElement startdate = driver.findElement(By.xpath("//input[@aria-placeholder='Select a start date']"));
		startdate.sendKeys(currentdate);
		
		WebElement enddates = driver.findElement(By.id("EndDate_input"));
		enddates.sendKeys(enddate);
		
		WebElement desc = driver.findElement(By.id("Description_rte-edit-view"));
		desc.sendKeys(wsheet2.getRow(8).getCell(3).getStringCellValue());
		
		WebElement create = driver.findElement(By.xpath("//button[@class='blm-btn-create']"));
		create.click();
		
		Thread.sleep(5000);
	}

}
