package com.demo.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNg 
{
  @Test
  @Parameters({"data","data1"})
  public void test1(@Optional("default")String data,@Optional("default1")String data1)
  {
	  	System.out.println(data);///If I am not use xml then it print default in console
	  	System.out.println(data1);
  }
}
