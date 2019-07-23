package Pavantools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebDriverBasicCommands {
	
	
	@Test

	public void clickmethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("http://www.google.com");

    String title = driver.getTitle(); 
    System.out.println(title);

	//Get current page URL
	String CurrentURL = driver.getCurrentUrl();
	System.out.println("My Current URL Is : "+CurrentURL);

	//Get and store domain name in variable using JavaScript Executor

JavascriptExecutor javascript = (JavascriptExecutor) driver;
	String DomainUsingJS=(String)javascript.executeScript("return document.domain");
	System.out.println("My Current URL Is : "+DomainUsingJS);
	
	// Checked for search box is enabled or not
	if (driver.findElement(By.xpath("//input[@name='q']")).isEnabled())
	{
	System.out.println("Google search text box Is enabled.");

	// Pass the Test - "WebDriver Test Successful" to search box 
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("WebDriver Test successful.");

	// clicking the search button 
	driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();


	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	// Click the Top most link and open to New Tab
	WebElement link=driver.findElement(By.xpath("//div[@id='ir es']/ol/div/div[1]/div/h3/a"));
	Actions newTab = new Actions(driver);
	newTab.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	}
	}

	


