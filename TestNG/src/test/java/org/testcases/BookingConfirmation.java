package org.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.BaseClass;

public class BookingConfirmation extends BaseClass{

	public static void booking(){
		
		WebElement orderid = driver.findElement(By.id("order_no"));
		String order = orderid.getAttribute("value");
		
		System.out.println("Order Number is "+order);
	}
}
