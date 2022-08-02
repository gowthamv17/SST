package testngframework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import baseclass.Baseclass;

public class CreateLead extends Baseclass{
	@Test(priority=0)
	public static void createlead() throws InterruptedException, IOException {
	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gopi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		WebElement create = driver.findElement(By.name("submitButton"));
		create.click();
		String createtitle = driver.getTitle();
		String Expectedtitle = createtitle;
		Thread.sleep(5000);
		File scrshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File("D:\\Selenium files\\workspace\\screenshots\\createlead_pass.png");
		FileUtils.copyFile(scrshot, destfile);
		if(createtitle.equals(Expectedtitle)){
			test.log(LogStatus.PASS, "viewlead displayed"+test.addScreenCapture("D:\\Selenium files\\workspace\\screenshots\\createlead_pass.png"));
			
		}
		else
		{
			test.log(LogStatus.FAIL, "viewlead not displayed"+test.addScreenCapture("D:\\Selenium files\\workspace\\screenshots\\createlead_fail.png"));
			
		}
		Thread.sleep(5000);
}
}






