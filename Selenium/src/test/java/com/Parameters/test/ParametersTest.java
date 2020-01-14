package com.Parameters.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
public class ParametersTest {
	
	WebDriver driver;
	@Test
	
	@Parameters({"url", "emailId" })
	public void yahooLogoin(String url,String emailId)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sravanakumarr_b\\git\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();

		
		 driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get(url);
		 
		 driver.findElement(By.id("login-username")).sendKeys(emailId);
		 driver.findElement(By.id("login-signin")).click();
		 
		 
		 

	}
	
}
