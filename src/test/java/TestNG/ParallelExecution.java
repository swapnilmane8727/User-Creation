package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecution {

	@Test()
	public void test1()
	{
		System.out.println("id is "+Thread.currentThread().getId());
		System.out.println("name is "+Thread.currentThread().getName());
		Reporter.log("test 1 executed", true);
	}
	
	@Test
	public void test2()
	{
		System.out.println("id is "+Thread.currentThread().getId());
		System.out.println("name is "+Thread.currentThread().getName());
		Reporter.log("test 2 executed", true);
	}
	
	@Test
	public void test3()
	{
		System.out.println("id is "+Thread.currentThread().getId());
		System.out.println("name is "+Thread.currentThread().getName());
		Reporter.log("test 3 executed", true);
	}
	
	
	
	
	
}
