package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import CloudBLM.CloudBLM.Baseclass;
import exceldata.Exceldatas;

public class Login extends Baseclass{

	public static void logins() throws InterruptedException{
		
		WebElement emailid = driver.findElement(By.id("login-email"));
		emailid.sendKeys(username);
		WebElement pwd = driver.findElement(By.id("login-password"));
		pwd.sendKeys(password);
		Thread.sleep(5);
        
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
