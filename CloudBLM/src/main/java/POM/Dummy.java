package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dummy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   // System.out.println(urls);
	    driver.get("http://192.168.1.154/blm/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement emailid = driver.findElement(By.id("login-email"));
		emailid.sendKeys("fazil@srinsofttech.com");
		WebElement pwd = driver.findElement(By.id("login-password"));
		pwd.sendKeys("sst12345");
		Thread.sleep(5);
        
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Administration']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Organizations']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='grid-action-icon blm-icon-cog']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Workflow']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//span[@class='workflow-header-icon blm-icon-add'])[1]")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("(//input[@formcontrolname='workflowName'])[1]")).sendKeys("test4");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//textarea[@name='Description'])[1]")).sendKeys("test4");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class='blm-btn-create'])[1]")).click();
		
		Thread.sleep(5000);
		
		WebElement drag = driver.findElement(By.id("Process_container"));
		WebElement drop = driver.findElement(By.id("diagramcontent"));
		
	Actions drop1 = new Actions(driver);
	drop1.clickAndHold(drag).moveToElement(drop).release(drag).perform();
	
	
		
		
//		driver.findElement(By.xpath("//span[text()='Projects']")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[text()='Manage Projects']")).click();
//		Thread.sleep(2000);
//		
//		WebElement Modelview = driver.findElement(By.xpath("//span[text()='testissue4']//following::span[@id='icon_4']"));
//		Modelview.click();
//		
//		driver.findElement(By.xpath("//input[@class='e-treecheckselect']")).click();
//		
//		driver.findElement(By.xpath("//button[text()='VIEW']")).click();
		
	}
}
		
		
		