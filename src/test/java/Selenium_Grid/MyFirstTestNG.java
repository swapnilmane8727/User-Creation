package Selenium_Grid;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstTestNG {
	
	@Test(description = "My First Test")
	public void Test1()
	{
		System.out.println("Test 1 executed");
		
	}
	
	@Test(description = "My Second Test")
	public void Test2()
	{
		System.out.println("Test 2 executed");
	}
	
	@Test(description = "My Third Test")
	public void Test3()
	{
		System.out.println("Test 3 executed");
	}

}
