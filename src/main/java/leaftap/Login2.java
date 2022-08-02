package leaftap;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login2 extends Createleadtestng2 {
	
	@Parameters({"uname","password"})
	@Test(priority=1)
	public void login(String uname, String password) {
	driver.findElement(By.id("username")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Test(priority=2)
	public void crm() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Test(priority=3)
	public void leads() {
	driver.findElement(By.linkText("Leads")).click();
	}
	@Parameters({"cname","fname","lname"})
	@Test(priority=4)
	public void createlead(String cname, String fname, String lname) {
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	driver.findElement(By.name("submitButton")).click();
	}

}
