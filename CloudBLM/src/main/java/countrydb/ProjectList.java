package countrydb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectList {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver.exe");
		
		driver = new ChromeDriver();
	    driver.get("http://192.168.2.14/blm/login");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("businessrevitadmin@sst.com");
		driver.findElement(By.id("userkey")).sendKeys("sst12345");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
		driver.findElement(By.xpath("//input[@formcontrolname='ProjectName']")).sendKeys("revit models");
		driver.findElement(By.xpath("//span[text()='Choose your construction type']")).click();
		
		List<WebElement> listmodel = driver.findElements(By.xpath("//span[text()='Choose your construction type']"));
		
	    for(int i=1;i<=listmodel.size();i++){
	    	
	    	String ss = listmodel.get(i).getText();
	    	System.out.println(ss);
	    }
			
	
		
		int s = listmodel.size();
		System.out.println(s);
	}

}
