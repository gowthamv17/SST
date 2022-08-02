package leaftap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Createleadtestng2 {
	public static WebDriver driver;
	//public static ChromeDriver driver1;
	//public void create(String username, String password , String url, String cname , String fname , String lname) {
		@Parameters({"url"})
		@BeforeTest
		public void launch(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		@AfterTest
		public void close() {
		driver.close();
}

}








