package org.runtestng;

import org.testcases.BookHotel;
import org.testcases.BookingConfirmation;
import org.testcases.CheckInDetails;
import org.testcases.Login;
import org.testcases.SelectHotel;
import org.testng.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunTestCases {

	@BeforeTest 
	public void urlLaunch() throws InterruptedException {
		// TODO Auto-generated method stub

		BaseClass.browser();
	}
	
	@Test (priority=0)
	public void loginMethod() throws InterruptedException{
		
		Login.login();
	}

	@Test (priority=1)
	public void checkIn() throws InterruptedException{
		
		CheckInDetails.checkInDetails();
	}
	
	@Test (priority=2)
	public void hotelSelect(){
		SelectHotel.hotel();
	}
	
	@Test (priority=3)
	public void hotelBook() throws InterruptedException{
		BookHotel.bookHotel();
	}
	@Test (priority=4 , enabled=false)
	public void bookingConfirm(){
		BookingConfirmation.booking();
	}
	
	
}
