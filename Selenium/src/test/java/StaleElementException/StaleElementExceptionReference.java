package StaleElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaleElementExceptionReference {
	
	@Test
	void demo34() throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		  //WebDriver driver=new ChromeDriver();
		  ChromeDriver driver=new ChromeDriver();

		  driver.get("https://www.seleniumeasy.com/selenium-webdriver-tutorials");
		  
		
		  
		 WebElement link=driver.findElement(By.linkText("TestNG"));
		 link.click();
		 Thread.sleep(5000);
		 
		 driver.navigate().back();
		 
		try {
			
			link.click();
		} 
		catch (StaleElementReferenceException e) 
		{
			  link=driver.findElement(By.linkText("TestNG"));
			 link.click();
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
