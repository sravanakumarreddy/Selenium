package com.TestNG.Demo;

import org.testng.Assert;
import org.testng.annotations.Test;
 
public class TestRetry {
 
	@Test(retryAnalyzer = Analyzer.RetryAnalyzer.class)

	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
 
	@Test
	public void Test2()
	{
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void Test3()
	{
		Assert.assertEquals(false, true);
	}
	@Test
	public void Test4()
	{
		Assert.assertEquals(false, true);
	}
}