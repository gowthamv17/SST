package GreensTechs.GreensTechs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iterate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone");
	    //driver.findElement(By.xpath("//input[@value='iphone']"));
	    Thread.sleep(5000);
	    List<WebElement> li = driver.findElements(By.xpath("//div[@class='_2kpuIQ _1rB4Ez']"));
	    
	    for (WebElement total : li) {
	    	String text = total.getText();
			System.out.println(text);
		}
	    

	}

}
