package Appium.Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.DataFormat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CloudBLM {

	 RemoteWebDriver driver;
	 DesiredCapabilities capabilities;
		// TODO Auto-generated method stub

		@BeforeTest
		
		public void setup() throws MalformedURLException{
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
			DesiredCapabilities capabilities = new DesiredCapabilities();
		//((RemoteWebDriver) driver).getCapabilities().getCapability("deviceName").toString();
		capabilities.setCapability("deviceName", "AOSP on IA Emulator");
		System.out.println("1");
		capabilities.setCapability("udid", "emulator-5554"); //Give Device ID of your Mobile phone
		System.out.println("2");
		capabilities.setCapability("platformName","Android");
		System.out.println("3");
		capabilities.setCapability("platformVersion","9");
		System.out.println("4");
		capabilities.setCapability("noReset", true);
		System.out.println("5");
		
		// This package name of your app (you can get it from apk info app)
	//	capabilities.setCapability("apppackage", "com.android.chrome");
		System.out.println("6");
		capabilities.setCapability("appPackage", "com.android.chrome");
		// This is Launcher activity of your app (you can get it from apk info app)
		
		capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main"); 
		
		//Create RemoteWebDriver instance and connect to the Appium server
		 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
		  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		}
		
		@Test(priority=0)
		public void launch() throws InterruptedException{
		
			System.out.println("Test");
			driver.get("http://192.168.2.14/blm/projects");
			System.out.println("URL Launched");
			Thread.sleep(10000);
		
	}
		
		@Test(priority=1)
		public void login() throws InterruptedException{
			
		
			driver.findElementByXPath("//android.widget.EditText[@resource-id='login-email']").sendKeys("iterationorgadmin@sst.com");
			Thread.sleep(5000);
		 driver.findElementByXPath("//android.widget.EditText[@resource-id='login-password']").sendKeys("sst12345");
		 Thread.sleep(5000);
			driver.findElementByXPath("//android.widget.Button[@text='Sign In']").click();
		}
		@AfterTest
		public void EndTest()   {
			System.out.println("End Test"); 
		//	Recorder.stop();
		}

}
