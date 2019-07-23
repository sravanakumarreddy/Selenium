package com.TestNG.Demo;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount=11)
	void testC()
	{
		System.out.println("testc ");
	}
	@Test
	void testC1()
	{
		System.out.println("testc 1");
		
	}
}
