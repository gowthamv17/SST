package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CloudBLM.CloudBLM.Baseclass;
import POM.CreateProject;

import POM.Login;
import POM.Manageproject;
import POM.OrganisationDupRole;
import POM.Sitecreateusers;
import exceldata.Exceldatas;

public class TestCase {
	
//	public static void LaunchURL() throws IOException{
//		Baseclass.launch();
//	}
//
//	public static void Loginn() throws InterruptedException{
//		
//		Login.logins();
//	}
//	public static void Projectcreate(){
//		CreateProject.Createproject();
//	}
	
	//public static void main(String[] args) throws IOException, InterruptedException {
	//@Parameters("browser")
	@BeforeTest
	public static void browsers() throws IOException{
		
		Baseclass.launch();
	}
	
	
	@Test(priority=1)
public static void logindetails() throws InterruptedException{
		Login.logins();
}

	@Test(priority=2 , enabled=false)
public static void projectcreation() throws InterruptedException{
		CreateProject.Createproject();
		
	}
	
	@Test(priority=3 , enabled=false)
	public static void viewmodel() throws InterruptedException{
		Manageproject.manageproj();
	}
	
	@Test(priority=4 , enabled=true)
	public static void usercreationforsite() throws IOException, InterruptedException{
		Sitecreateusers.siteuser();
	}
	@Test(priority=5 , enabled=false)
	public static void OrgDupRole() throws InterruptedException{
		OrganisationDupRole.Duprole();
	}
	
	}

