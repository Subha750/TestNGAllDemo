package com.demo.testNG;

import org.testng.annotations.Test;

public class GroupingInTestNg 
{
  @Test(groups = {"sanity"})
  public void test1()
  {
	  
  }
  
  @Test(groups = {"sanity","regression"})
  public void test2()
  {
	  
  }
  @Test(groups = {"regression"})
  public void test3()
  {
	  
  }
}
