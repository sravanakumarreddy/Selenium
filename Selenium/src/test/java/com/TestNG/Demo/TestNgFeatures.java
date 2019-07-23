package com.TestNG.Demo;

import org.testng.annotations.Test;

public class TestNgFeatures {
	@Test
	void login()
	{
		System.out.println("login");
		int i=9/0;
		
	}

	@Test(dependsOnMethods="login")
	void homePage()
	{
		System.out.println("Home page");
	}
	@Test(dependsOnMethods="login")
	void searchPage()
	{
		System.out.println("searchPage page");
	}
	@Test(dependsOnMethods="login")
	void cartPage()
	{
		System.out.println("cartPage page");
	}
}
