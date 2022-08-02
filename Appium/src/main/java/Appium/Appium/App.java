package Appium.Appium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class App {

//	WebDriver driver;

	DesiredCapabilities caps;
	Screen screen;
    RemoteWebDriver driver;

	@BeforeTest
	public void setUp() throws MalformedURLException {

		
			
		
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "AOSP on IA Emulator");
		System.out.println("1");
		caps.setCapability("udid", "emulator-5554"); // Give Device ID of your mobile phone
		System.out.println("2");
		caps.setCapability("platformName", "Android");
		System.out.println("3");
		caps.setCapability("platformVersion", "9");
		System.out.println("4");
		caps.setCapability("noReset", true);
		System.out.println("5");
		
	//	driver.findElement(By.id("qemu-system-x86_64.exe - 1 running window")).click();
		// This package name of your app (you can get it from apk info app)
	    caps.setCapability("appPackage", "com.android.chrome");
	//	caps.setCapability("appPackage", "com.android.calculator2");
		System.out.println("6");
		
		// This is Launcher activity of your app (you can get it from apk info app)
	//	caps.setCapability("appActivity", "com.android.calculator2.Calculator"); 		
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main"); 
		
		// Create RemoteWebDriver instance and connect to the Appium server
		// It will launch the Calculator App in Android Device using the configurations
		// specified in Desired Capabilities
		driver =  new RemoteWebDriver(new URL("http://127.0.0.2:4723/wd/hub"), caps);
		System.out.println("7");
	//	Recorder.start();
	}

	@Test (priority=0)
	public void MobileBrowser() throws InterruptedException {
		System.out.println("Test");
		driver.get("http://192.168.1.154/blm/projects");
		System.out.println("URL Launched");
		Thread.sleep(4000);
	}
	
	@Test  (priority=1)
	public void LoginPage() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='login-email']")).sendKeys("fazil@srinsofttech.com");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//android.widget.EditText[@resource-id='login-password']")).sendKeys("sst12345");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Sign In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Sign In']")).click();
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.android.chrome:id/infobar_close_button']")).click();
		Thread.sleep(2000);
	}
	
	@Test  (priority=2)
	public void SearchProject() throws InterruptedException, AWTException, FindFailed {
		driver.findElement(By.xpath("//android.view.View[@resource-id='facog']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Project Type']")).click();
		Thread.sleep(4000);
		for(int i=0; i<5;i++)
		{
		Robot press = new Robot();
		press.keyPress(KeyEvent.VK_TAB);
		press.keyRelease(KeyEvent.VK_TAB);						
		}
		Thread.sleep(4000);
		screen.type("AUTOMATION");
		/*Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_SHIFT);
	    robot.keyPress(KeyEvent.VK_A);
	    robot.keyRelease(KeyEvent.VK_A);
	    robot.keyPress(KeyEvent.VK_U);
	    robot.keyRelease(KeyEvent.VK_U);
	    robot.keyPress(KeyEvent.VK_T);
	    robot.keyRelease(KeyEvent.VK_T);
	    robot.keyPress(KeyEvent.VK_O);
	    robot.keyRelease(KeyEvent.VK_O);
	    robot.keyPress(KeyEvent.VK_M);
	    robot.keyRelease(KeyEvent.VK_M);
	    robot.keyRelease(KeyEvent.VK_SHIFT);*/
		Thread.sleep(3000);
		Pattern Filter = new Pattern("D:\\Selenium files\\CloudBLM\\Screenshots\\filter.png");
		screen.click(Filter);
		driver.findElement(By.xpath("//android.view.View[@text='']")).click();
		Thread.sleep(2000);
		String ProjectName = driver.findElement(By.xpath("//android.view.View[@text='AUTOMATION']")).getText();
		System.out.println(ProjectName);
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.android.chrome:id/infobar_close_button']")).click();
		Thread.sleep(2000);
	}

	@Test  (priority=3)
	public void ModelViewer() throws InterruptedException, AWTException, FindFailed {
		driver.findElement(By.xpath("//android.view.View[@resource-id='icon_4']")).click();
		Thread.sleep(2000);
		Screen screen = new Screen();
		Pattern Model = new Pattern("D:\\Selenium files\\CloudBLM\\Screenshots\\checkbox.png");
		screen.click(Model);
		driver.findElement(By.xpath("//android.widget.Button[@text='VIEW']")).click();
		Thread.sleep(2000);
		caps.setCapability("orientation", "LANDSCAPE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@text='']")).click();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void EndTest()   {
		System.out.println("End Test"); 
	//	Recorder.stop();
	}
}
