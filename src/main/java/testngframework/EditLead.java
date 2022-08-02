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

public class EditLead extends Baseclass{
@Test(priority=3)
	public static void editlead() throws InterruptedException, IOException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.name("submitButton")).click();
		String createtitle = driver.getTitle();
		String Expectedtitle = createtitle;
		Thread.sleep(5000);
		File scrshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File("D:\\Selenium files\\workspace\\screenshots\\editlead_pass.png");
		FileUtils.copyFile(scrshot, destfile);
		if(createtitle.equals(Expectedtitle)){
			test.log(LogStatus.PASS, "editlead displayed"+test
					.addScreenCapture("D:\\Selenium files\\workspace\\screenshots\\Editlead_pass.png"));
			
		}
		else
		{
			test.log(LogStatus.FAIL, "viewlead not displayed"+test.addScreenCapture("D:\\Selenium files\\workspace\\screenshots\\Editlead_fail.png"));
			
		}
		
}
}






