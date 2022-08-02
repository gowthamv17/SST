package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dummy1 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","D:\\Backup 27-09-2017\\gowtham\\Automate tools\\geckodriver\\geckodriver.exe");
	    driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   // System.out.println(urls);
		   driver.get("https://www.bimdex.com/");
		   
		   Thread.sleep(5000);
			
			Actions mouse = new Actions(driver);
			WebElement products = driver.findElement(By.xpath("//a[text()='Product']"));
			mouse.moveToElement(products).build().perform();
			products.click();
			
			
			
			
		
	}

}
