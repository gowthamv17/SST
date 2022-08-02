package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.BaseClass;

public class SelectHotel extends BaseClass{

	public static void hotel() {
		
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		if(radio.isSelected()){
			System.out.println("selected");
		}
		else
		{
			radio.click();
		}
		
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
	}
}
