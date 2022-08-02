package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver.exe");
		
		driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/web-table-element.php");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 List<WebElement> columns = driver.findElements(By.tagName("th"));
	 System.out.println(columns.size());
	 
	 
		
		
	}

}
