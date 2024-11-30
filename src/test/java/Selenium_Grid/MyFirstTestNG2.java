package Selenium_Grid;

import org.testng.annotations.Test;

public class MyFirstTestNG2 {
	
	//Default priority will be 0 if not set and if all methods priority is 0 then based on aplhabetical order method will be executed
	
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("login to app");
	}
	
	@Test(priority = 2)
	public void createAccount()
	{
		System.out.println("Account created");
	}
	
	@Test
	public void payment()
	{
		System.out.println("Payment done");
	}
	
	@Test
	public void logout()
	{
		System.out.println("logout from app");
	}

}
