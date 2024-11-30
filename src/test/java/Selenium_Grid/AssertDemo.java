package Selenium_Grid;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	
	@Test
	public void test1()
	{   
		// actual - from application
		// expected - from test
		Assert.assertEquals("hello", "hello");
	}
	
	@Test
	public void test2()
	{   
		Assert.assertEquals(12, 12, "count mismatch");
	}
	
	@Test
	public void test3()
	{   
		Assert.assertEquals(12, 12, "count mismatch");
	}
	
	@Test
	public void test4()
	{   
		String msg="customer id is 323";
		Assert.assertEquals(msg.contains("customer"), true);
	}
	
	@Test
	public void test5()
	{   
		String msg="customer id is 323";
		Assert.assertEquals(msg.contains("customer "), true);
	}
	
	@Test
	public void test6()
	{   
		String msg="customer id is 323";
		Assert.assertTrue(msg.contains("customer"));
	}
	
	@Test
	public void test7()
	{   
		String msg="customer id is 323";
		Assert.assertFalse(msg.contains("customera"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
