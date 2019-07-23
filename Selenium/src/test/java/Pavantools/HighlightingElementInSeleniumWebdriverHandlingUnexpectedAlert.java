package Pavantools;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HighlightingElementInSeleniumWebdriverHandlingUnexpectedAlert {

		WebDriver driver;

		@BeforeTest
		public void setup() throws Exception
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/06/alert_6.html");
		}
		@AfterTest
		public void tearDownap() throws Exception
		{
		driver.quit();
		}
		@Test
		public void Text() throws InterruptedException
		{
		//To handle unexpected alert on page load.
		try
		{
		driver.switchTo().alert().dismiss();
		}
		catch(Exception e)
		{
		System.out.println("unexpected alert not present");
		}
		HighlightMyElement(driver.findElement(By.xpath("//input[@name='fname']")));
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("fname");
		HighlightMyElement(driver.findElement(By.xpath("//input[@name='lname']")));
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("lname");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		public void HighlightMyElement(WebElement element) {
		for (int i = 0; i < 10; i++) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
		"arguments[0].setAttribute('style', arguments[1]);",
		element, "color: red; border: 3px solid yellow;");
		js.executeScript(
		"arguments[0].setAttribute('style', arguments[1]);",
		element, "");
		}
		}
		}
		
	

