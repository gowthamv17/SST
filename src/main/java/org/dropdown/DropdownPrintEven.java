package org.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPrintEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver (2).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> countries = driver.findElements(By.xpath("//label[text()='Selenium Commands']//following::option"));
		int sizes = countries.size();
		System.out.println("size is "+sizes);
		
		for(int i=0;i<sizes;i++) {
			
			if(i%2==1){
			String country = countries.get(i).getText();
			System.out.println("odd options is " +country);
			}
			else{
				System.out.println("remaining is " +countries.get(i).getText());
			}
		}
		
		WebElement city = driver.findElement(By.id("continents"));
		
		Select contin = new Select(city);
		contin.selectByIndex(2);
		
		List<WebElement> continents = driver.findElements(By.id("continents"));
		for (WebElement con : continents) {
			String text = con.getText();
			System.out.println(text);
		}
		
	}

}
