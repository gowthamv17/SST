package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

public static WebDriver driver;
   
	public static void browser() throws InterruptedException {

	
		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver (2).exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://adactin.com/HotelApp/index.php");
		Thread.sleep(3000);
		

	}
}
