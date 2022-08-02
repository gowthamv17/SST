package org.testcases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.BaseClass;

public class CheckInDetails extends BaseClass {

	
	public static void checkInDetails() throws InterruptedException{
		
		WebElement loc = driver.findElement(By.id("location"));
		Select location = new Select(loc);
		location.selectByIndex(1);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select hotels = new Select(hotel);
		hotels.selectByIndex(1);
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select roomtype = new Select(room);
		roomtype.selectByIndex(1);
		
		WebElement number = driver.findElement(By.id("room_nos"));
		Select roomnumber = new Select(number);
		roomnumber.selectByValue("2");
		
		Thread.sleep(5000);
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"+1);
		Date date1 = new Date();
		System.out.println(dateFormat.format(date1));
		
		
		WebElement date = driver.findElement(By.id("datepick_in"));
		date.clear();
		date.sendKeys(dateFormat.format(date1));
		
		WebElement croom = driver.findElement(By.id("child_room"));
		Select childroom = new Select(croom);
		childroom.selectByIndex(1);
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		
	}
	
}
