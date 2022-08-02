package org.alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allalerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver (2).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//simple alert
		WebElement sa = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		
		sa.click();
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
//		//confirm alert
//		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
//		for(int i=0;i<2;i++){	
//		WebElement cb = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
//		cb.click();
//		if(i==0){
//	Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//		}
//		else{
//			Thread.sleep(5000);
//			driver.switchTo().alert().dismiss();
//		}
//	}
		
		//prompt alert
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		
		WebElement tb = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		tb.click();
		Alert alerts = driver.switchTo().alert();
		alerts.sendKeys("hi gowtham");
		Thread.sleep(5000);
		//alerts.accept();
		String text = alerts.getText();
		
		System.out.println(text);
		alerts.accept();
		
	}
}
