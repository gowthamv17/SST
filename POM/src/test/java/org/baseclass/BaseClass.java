package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launch(String url){
		
	System.setProperty("driver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver (2).exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	}
	
	public static void 

}
