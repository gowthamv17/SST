package POM;

import java.util.List;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import CloudBLM.CloudBLM.Baseclass;

public class OrganisationDupRole extends Baseclass{
	
public static void Duprole() throws InterruptedException{
	
	driver.findElement(By.xpath("//span[text()='Administration']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Organizations']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//span[@class='grid-action-icon blm-icon-cog'])[2]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()='Roles']")).click();
	Thread.sleep(3000);
	
	List<WebElement> row = driver.findElements(By.xpath("//*[@id='grid_95529755_0_content_table']/tbody/tr"));
	int rowsize = row.size();
	System.out.println("Row size is "+rowsize);
	
	List<WebElement> column = driver.findElements(By.xpath("//*[@id='grid_95529755_0_content_table']/tbody/tr/td"));
	int columnsize = column.size();
	System.out.println(columnsize);
	
	for(int column1=0;column1<rowsize;column1++){
		String text = row.get(column1).getText();
		System.out.println(" column no is "+column1+" text is "+text);
		
//	for(WebElement column1 : column){
//		String text = column1.getText();
//		System.out.println(text);
	//List<WebElement> dup = driver.findElements(By.xpath("//span[@class='grid-action-icon blm-icon-copy']"));
	
	//	if(text.equalsIgnoreCase("TEST")){	
			
		Thread.sleep(5000);
	//driver.findElement(By.xpath("(//span[text()='"+text+"']//following::span[5]")).click();
	
	//}
	
			
}
	
}
}
