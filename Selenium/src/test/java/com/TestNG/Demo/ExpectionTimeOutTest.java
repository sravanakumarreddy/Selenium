package com.TestNG.Demo;

import org.testng.annotations.Test;

public class ExpectionTimeOutTest {
	@Test(invocationTimeOut=1,expectedExceptions=NumberFormatException.class)
	void timeOutTest()
	{
		int i=0;
		while(i==0)
		{
			System.out.println(i);
		}
	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	void test1()
	{
		String x="100abc";
		Integer.parseInt(x);
	}

}
