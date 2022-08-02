package org.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.BaseClass;

public class Login extends BaseClass{
	
	public static void login() throws InterruptedException{
		//LaunchBrowser.browser();
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("gowthamv17");
		
		WebElement pword = driver.findElement(By.id("password"));
		pword.sendKeys("Gautam@123");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
Thread.sleep(5000);
	}

}
