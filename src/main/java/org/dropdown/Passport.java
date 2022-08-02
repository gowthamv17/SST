package org.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Passport {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver (2).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement state = driver.findElement(By.id("dcdrLocation"));
		state.sendKeys("Chennai");
		
//		Select st = new Select(state);
//		st.selectByValue("26");
		Thread.sleep(5000);
		WebElement date = driver.findElement(By.id("dob"));
		date.click();
		date.sendKeys("21/09/1992");
		
		WebElement hint = driver.findElement(By.id("hintQues"));
		Select ht = new Select(hint);
		ht.selectByIndex(2);
		
	}

}
