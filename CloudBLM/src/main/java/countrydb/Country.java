package countrydb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Country {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Backup 27-09-2017\\gowtham\\Automate tools\\chromedriver_win32_1\\chromedriver.exe");
		
		driver = new ChromeDriver();
	    driver.get("https://dr5hn.github.io/countries-states-cities-database/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		List<WebElement> body = driver.findElements(By.xpath("//tbody[@class='countries-tb overflow-y-scroll']"));
		
		for (int i = 0; i < 10; i++) {
			System.out.println(body.get(i).getText());
			
			
		}
	}
}
