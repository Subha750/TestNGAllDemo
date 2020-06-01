package com.demo.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetryFlow {
	int i=0;
 @Test
 public void test1()
 {
	 i++;
	 if(i<3)
	 {
	 System.out.println("Retry Please.......!");
	 Assert.assertTrue(false);
	 }
	 else
	 {
		 System.out.println("Finaly It is got true");
		 Assert.assertTrue(true); 
	 }
 }
}
