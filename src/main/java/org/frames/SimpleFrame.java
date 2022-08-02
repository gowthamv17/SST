package org.frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver (2).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		WebElement frames = driver.findElement(By.xpath("//iframe[@src='default.html']"));
//		driver.switchTo().frame(frames);
//		
//		driver.findElement(By.xpath("//button[@id='Click']")).click();
//		
//		driver.switchTo().parentFrame();
		
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		int size = totalframes.size();
		System.out.println(size);
		
		for(int i=0;i<=size;i++){
			
			driver.switchTo().frame(i);
			
			System.out.println(driver.findElement(By.xpath("//body[text()='Find total number of frames.']")).getText());
		}

}
}