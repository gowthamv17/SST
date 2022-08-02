package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.BaseClass;

public class BookHotel extends BaseClass{
	
	public static void bookHotel() throws InterruptedException{
		
		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("gowtham");
		
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("gautam");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("9, Kodambakkam, Chennai");
		
		WebElement ccnum = driver.findElement(By.id("cc_num"));
		ccnum.sendKeys("1234567894561234");
		
		WebElement cctype = driver.findElement(By.id("cc_type"));
	
		Select credittype = new Select(cctype);
		credittype.selectByIndex(1);
		
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select emonth = new Select(month);
		emonth.selectByIndex(3);
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select eyear = new Select(year);
		eyear.selectByIndex(5);
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("042");
		
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		
		Thread.sleep(8000);
	}

}
