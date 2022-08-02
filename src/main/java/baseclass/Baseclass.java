package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Baseclass {

	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeTest
	public static void starttest(){
		report= new ExtentReports("D:\\Selenium files\\workspace\\ExtentReportResults.html");
		test = report.startTest("TestNG Extent Report");
	}
	
    @BeforeMethod
	public static void launch(){
	
		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		String title = driver.getTitle();
		String Expectedtitle = "Leaftaps - TestLeaf Automation Platform";
		System.out.println(title);
		if(title.equals(Expectedtitle))
		{
			test.log(LogStatus.PASS, "Title Matched");
		}
		else
		{
			test.log(LogStatus.FAIL, "Title Unmatched");
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
				crm.click();
			/*	if(crm.isEnabled()){
					test.log(LogStatus.PASS, "CRM clicked");
				}
				else
				{
					test.log(LogStatus.FAIL, "CRM not clicked");
				}*/
	}
	
	@AfterMethod
	public static void close(){
		driver.close();
	}
	
	@AfterTest
	public void endtest(){
		report.endTest(test);
		report.flush();
	}
}
