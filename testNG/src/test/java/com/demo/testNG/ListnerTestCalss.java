package com.demo.testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListnerTestCalss 
{
	int i=1;
	@Test
  public void test1()
  {
	  
  }
	@Test
  public void test2()
  {
	 throw new SkipException("This is skip") ; ///forse fully I skip the Test case
  }
	@Test(successPercentage = 60,invocationCount = 5)
  public void test3()
  {
	i++;
	System.out.println("Test3 test method ,invocation count:" +i);
	if(i==1 ||i==2)
	{
		//System.out.println("Test3 failed...");
		Assert.assertEquals(i, 8);
	}
  }
}
