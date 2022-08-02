package hrms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pocket_HRMS {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://selfservice.pockethrms.com/");
		
		driver.findElement(By.id("company")).sendKeys("SST");
		driver.findElement(By.id("employeecode")).sendKeys("SS334");
		driver.findElement(By.id("password")).sendKeys("Gautam$123");
		
		driver.findElement(By.id("btnSubmit")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//li[@class='mainmenu_leaveTracking']")).click();
		
	}
}
