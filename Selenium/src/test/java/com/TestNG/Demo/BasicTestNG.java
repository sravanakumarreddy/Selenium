package com.TestNG.Demo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class BasicTestNG {
	@BeforeMethod()
	public void bm()
	{
		System.out.println("before Method");
	}
	@BeforeTest()
	public void bt()
	{
		System.out.println("before test");
	}
	@BeforeSuite()
	public void bs()
	{
		System.out.println("before suite");
	}
	@BeforeClass()
	public void bc()
	{
		System.out.println("before class");
	}
	@AfterMethod()
	public void af()
	{
		System.out.println("After Method");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
		//Assert.assertEquals("srava", "sdfa");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	@AfterTest()
	public void at()
	{
		System.out.println("After test");
	}
	@AfterSuite()
	public void as()
	{
		System.out.println("After suite");
	}
	@AfterClass()
	public void ac()
	{
		System.out.println("After class");
	}
}
