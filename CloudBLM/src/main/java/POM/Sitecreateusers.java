package POM;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import CloudBLM.CloudBLM.Baseclass;
import exceldata.Exceldatas;

public class Sitecreateusers extends Baseclass{

	public static void siteuser() throws IOException, InterruptedException{
		
		
		driver.findElement(By.xpath("//span[text()='Administration']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Users")).click();
		Thread.sleep(3000);
		System.out.println("User Click");
		Exceldatas.readexcel();
		
	WebElement pageheader = driver.findElement(By.xpath("/html/body/blm-root/blm-app-layout/div/div/div/blm-user-management/div/blm-user-views/div/div/div[1]/h3"));
    String manageuserheader = pageheader.getText();
   System.out.println(manageuserheader);

		
		for(int j=1;j<=5;j++){
			
			driver.findElement(By.xpath("//button[text()='CREATE ']")).click();
			Thread.sleep(3000);
			
			WebElement pageheader1 = driver.findElement(By.xpath("/html/body/blm-root/blm-app-layout/div/div/div/blm-user-management/div/blm-user-form/blm-create-user/div/div[1]/div/h3"));
		    String createuserheader = pageheader1.getText();
		    System.out.println(createuserheader);
		    
		WebElement name = driver.findElement(By.xpath("//input[@formcontrolname='Name']"));
	    name.sendKeys(wsheet3.getRow(j).getCell(1).getStringCellValue());
	    String print = name.getText();
		System.out.println(print);
		WebElement username = driver.findElement(By.xpath("//input[@formcontrolname='UserName']"));
		username.sendKeys(wsheet3.getRow(j).getCell(2).getStringCellValue());
		
	    WebElement emailid = driver.findElement(By.xpath("//input[@formcontrolname='EmailID']"));
		emailid.sendKeys(wsheet3.getRow(j).getCell(3).getStringCellValue());
		
		driver.findElement(By.xpath("//button[@class='blm-btn-create']")).click();
		Thread.sleep(10000);
		
		if(pageheader1.isDisplayed()){

			System.out.println("Username or EmailID Already Exists");
		driver.findElement(By.xpath("//button[@class='blm-btn-cancel']")).click();
	
		}
		else{
			
			System.out.println("continue");
			
		}

			
		}
			driver.navigate().to("http://192.168.2.14/blm/dashboard");
			Thread.sleep(5000);
		
	
	}

}
		


	
