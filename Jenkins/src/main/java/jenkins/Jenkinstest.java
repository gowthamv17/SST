package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jenkinstest {
	public WebDriver driver;
	@BeforeTest
	public void driverinitialize(){
		System.setProperty("webdriver.chrome.driver","D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterTest
	public void driverclose(){
		driver.close();
	}
    @Test(priority=0)
	public void launchurl(){
		driver.get("https://www.tutorialspoint.com/jenkins/jenkins_maven_setup.htm");
		String title = driver.getTitle();
		System.out.println(title);
	}
}
