package com.Parameters.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
public class ParametersTest {
	
	WebDriver driver;
	@Test
	
	@Parameters({"url", "emailId" })
	public void yahooLogoin(String url,String emailId)
	{
		System.setProperty("webdriver.chrome.driver", "F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//chromedriver.exe");	
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get(url);
		 
		 driver.findElement(By.id("login-username")).sendKeys(emailId);
		 driver.findElement(By.id("login-signin")).click();
		 
		 
		 

	}
	
}
