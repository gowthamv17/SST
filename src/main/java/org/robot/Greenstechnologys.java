package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenstechnologys {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver (2).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement para = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Thread.sleep(2000);
		
		para.click();
		
		WebElement uname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		uname.sendKeys("gmnn@gmail.com");
		
		Actions hover = new Actions(driver);
		hover.doubleClick(uname);
		
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);		
		
		
		//WebElement pword = driver.findElement(By.xpath("//input[@type='password']"));
		
		
//		
//		hover.moveToElement(para).perform();
//		
//		
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//div[text()='Sign Up']")).click();
//		//hover.contextClick().perform();
		
		
//       Robot sel = new Robot();
//       
//      
//      sel.keyPress(KeyEvent.VK_SHIFT);
//       
//       for(int i=0;i<3;i++){
//       sel.keyPress(KeyEvent.VK_DOWN);
//       sel.keyRelease(KeyEvent.VK_DOWN);
//	}
//       
//       sel.keyRelease(KeyEvent.VK_SHIFT);
//       
//      
//       
//       String text = para.getText();
//       System.out.println(text);
    		   
	}

	
}
