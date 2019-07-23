package com.TestNG.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	@BeforeMethod()
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//chromedriver.exe");	
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
	}
	@Test(priority=-1,groups="title")
	void googleTitle()
	{
		String title=driver.getTitle();
		System.out.println("googleTitle:  "+title);
	}
	@Test(priority=-12,groups="logo")
    void googleLogo()
	{
		boolean logo=driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println("googleLogo:  "+logo);
		
	}
	@Test(priority=1,groups="links")
	void gmailLink()
	{
	  boolean gmailLink=driver.findElement(By.linkText("mail")).isDisplayed();
	  System.out.println("gmailLInk:  -"+gmailLink);
	}
	@Test(priority=6,groups="test")
	void test1()
	{
		System.out.println("test1");
		
	}
	@Test(priority=5,groups="test")
	void test2()
	{
		System.out.println("test2");
		
	}
	@Test(priority=4,groups="test")
	void test3()
	{
		System.out.println("test3");
		
	}
	@AfterMethod()
	void close()
	{
		driver.quit();
	}

}
