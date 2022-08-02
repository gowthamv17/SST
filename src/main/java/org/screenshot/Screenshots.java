package org.screenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver (2).exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://www.greenstechnologys.com/");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
		TakesScreenshot scrsht = ((TakesScreenshot)driver);
	File src = scrsht.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\gowtham.varadharaj\\Desktop\\scrshotz\\test.png");
      FileUtils.copyFile(src, dest);
//		
//		driver.close();
		
//		WebDriver driver1 = new ChromeDriver();
//		driver1.manage().window().maximize();
//		driver1.get("https://www.toolsqa.com/");
//		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		Thread.sleep(15000);
//		
//		WebElement ad = driver1.findElement(By.xpath("//img[@alt='close-link']"));
//		if(ad.isDisplayed()){
//			ad.click();
//		}
//		else{
//		
//		WebElement txt = driver1.findElement(By.xpath("//span[text()='Recent Articles']"));
//		
//		JavascriptExecutor js = ((JavascriptExecutor)driver1);
//		js.executeScript("arguments[0].scrollIntoView(true);",txt);
//		
//		//Thread.sleep(3000);
//		
//		TakesScreenshot scrsht1 = ((TakesScreenshot)driver1);
//		File src1 = scrsht1.getScreenshotAs(OutputType.FILE);
//		File dest1 = new File("C:\\Users\\gowtham.varadharaj\\Desktop\\scrshotz\\test3.png");
//		FileUtils.copyFile(src1, dest1);
//		driver1.close();
//		n
//	}
		WebDriver driver2 = new ChromeDriver(options);
		driver2.manage().window().maximize();
		driver2.get("https://www.redbus.in/");
		driver2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(15000);
		
		WebElement ads = driver2.findElement(By.xpath("//img[@alt='close-link']")); 
	}
}
