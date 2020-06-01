package com.demo.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTestng 
{
	@Test
	public void test()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void test1()
	{
		Assert.assertTrue(false);
	}
	@Test
	public void test2()
	{
		Assert.assertEquals("test", "test");;
		
	}
	@Test
	public void test3()
	{
		Assert.assertEquals("test", "test");
	}
	@Test
	public void test4()
	{
		Assert.assertTrue(true, "does not matching expected result");
		
	}
	@Test
	public void test5()
	{
		Assert.assertFalse(false, "This is expected");
		
	}
	@Test
	public void test6()
	{
		Assert.assertNotEquals("test", "test1");
		
	}
	
	
	
	
	

}
