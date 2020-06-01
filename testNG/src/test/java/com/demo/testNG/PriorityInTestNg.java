package com.demo.testNG;

import org.testng.annotations.Test;

public class PriorityInTestNg 
{
@Test(priority = 2)

public void test1()
{
	System.out.println("I");
}

@Test(priority = 1)

public void test2()
{
	System.out.println("am");
}

@Test(priority = 0)

public void test3()
{
	System.out.println("Enginner");
}
}
