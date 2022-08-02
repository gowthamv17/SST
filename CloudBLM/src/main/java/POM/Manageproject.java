package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import CloudBLM.CloudBLM.Baseclass;

public class Manageproject extends Baseclass {

	public static void manageproj() throws InterruptedException{
		
//		WebElement modelcount = driver.findElement(By.xpath("(//span[text()='0 '])[1])"));
//	String count = modelcount.getText();
//	System.out.println(count);
		
		Thread.sleep(2000);
		
		WebElement modelview = driver.findElement(By.xpath("(//span[@id='icon_4'])[1]"));
		modelview.click();
		
		WebElement toastmsg = driver.findElement(By.xpath("//div[@class='toast-message ng-star-inserted']"));
		String msg = toastmsg.getText();
		System.out.println(msg);
		
		Thread.sleep(5000);
		
		WebElement info = driver.findElement(By.xpath("//span[@id='icon_0']"));
		info.click();
		
		WebElement pageheader = driver.findElement(By.xpath("//div[@class='pageHeaderText']"));
		
		String headertitle = pageheader.getText();
		System.out.println(headertitle);
		
		}
	}

