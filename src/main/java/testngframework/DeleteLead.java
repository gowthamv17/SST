package testngframework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import baseclass.Baseclass;

public class DeleteLead extends Baseclass{
@Test(priority=1)
	public static void deletelead() throws InterruptedException, IOException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		String createtitle = driver.getTitle();
		String Expectedtitle = createtitle;
		Thread.sleep(5000);
		File scrshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File("D:\\Selenium files\\workspace\\screenshots\\Deletelead_pass.png");
		FileUtils.copyFile(scrshot, destfile);
		if(createtitle.equals(Expectedtitle)){
			test.log(LogStatus.PASS, "Dellead displayed"+test.addScreenCapture("D:\\Selenium files\\workspace\\screenshots\\Deletelead_pass.png"));
			
		}
		else
		{
			test.log(LogStatus.FAIL, "viewlead not displayed"+test.addScreenCapture("D:\\Selenium files\\workspace\\screenshots\\Deletelead_fail.png"));
			
		}
}
}






