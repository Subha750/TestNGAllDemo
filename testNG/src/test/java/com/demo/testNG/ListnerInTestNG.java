package com.demo.testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerInTestNG implements ITestListener{

	public void onTestStart(ITestResult result) ///If we have 5 test then before every test then use this method to execute this to print the message 
	{
		System.out.println("String test is"+getMethodName(result));
		Reporter.log("String test is"+getMethodName(result));
		
	}

	public void onTestSuccess(ITestResult result) ///After evrey test sucess then whtever has written in the method then execute the same
	{
		System.out.println("Test Passed "+getMethodName(result));
		Reporter.log("Test Passed "+getMethodName(result));
	}

	public void onTestFailure(ITestResult result)  ///Any test fail or pass then this method execute 
	{
		
		System.out.println("Test Failed"+getMethodName(result));
		Reporter.log("Test Failed"+getMethodName(result));
	}

	public void onTestSkipped(ITestResult result) ///If any testcase skipped then use this method to print message in console
	{
		
		System.out.println("Test Skiped"+getMethodName(result));
		Reporter.log("Test Skiped"+getMethodName(result));
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) ///let say I have testcase and it will run 5times then pass test should be marked then fail then use this method
	{
		System.out.println("Test is pass absed on percentage"+getMethodName(result));
		Reporter.log("Test is pass absed on percentage"+getMethodName(result));
		
	}

	public void onStart(ITestContext context) ///Before start execute Testcase it will execute
	{
		System.out.println("Test Execution Started");
		Reporter.log("Test Execution Started");
		
	}

	public void onFinish(ITestContext context) ///It is execure after all test case done in a class
	///means let say a class has 10 test cases then after complited all test case then that onFinish will executed
	{
		
		System.out.println("All Test finished");
		Reporter.log("All Test finished");
	}
	
	
	private static String getMethodName(ITestResult result) ///After evrey test sucess then whtever has written in the method then execute the same
	{
	return result.getMethod().getConstructorOrMethod().getName();
	}
}
