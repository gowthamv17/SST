package CloudBLM.CloudBLM;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import exceldata.Exceldatas;

public class Baseclass extends Exceldatas{
	public static WebDriver driver ;
	
	public static void launch() throws IOException{
		// TODO Auto-generated method stub

		Exceldatas.readexcel();
		//if(browser.equalsIgnoreCase("chrome")){	
			System.setProperty("webdriver.chrome.driver","D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get(urls);
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	}
		//else if(browser.equalsIgnoreCase("firefox")){
//			System.setProperty("webdriver.gecko.driver","D:\\Backup 27-09-2017\\gowtham\\Automate tools\\geckodriver\\geckodriver.exe");
//		    driver = new FirefoxDriver();
//		    driver.get(urls);
//		    driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//}
	}
}

