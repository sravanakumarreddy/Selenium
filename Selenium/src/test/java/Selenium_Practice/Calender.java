package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {
	
	@Test
	void PickTheDate() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 
		
		/*driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.id("datepicker1")).click();
		
		List<WebElement> date_list=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//div[1]//table"));
		int total_nodes=date_list.size();
		
		Thread.sleep(6000);
		for(int i=0;i<total_nodes; i++)
		{
			String date=date_list.get(i).getText();
			if(date.equalsIgnoreCase("27"))
			{
				date_list.get(i).click();
				//break;
				
			}
			*/
		
		driver.get("https://www.facebook.com/");

		/*
		 * if(driver.findElement(By.xpath("//*[@id='email']")).isDisplayed()) {
		 * driver.findElement(By.xpath("//*[@id='email']")).sendKeys(
		 * "pavan@gmail.com"); }
		 */

		try {
			WebElement uname = driver.findElement(By.xpath("//*[@id='mail']"));

			if (uname.isDisplayed() && uname.isEnabled()) {
				uname.sendKeys("pavan@gmail");
			}

		}

		catch (NoSuchElementException e) {
			System.out.println("Element is NOT matched");
			System.out.println(e.toString());
		}

		driver.findElement(By.xpath("//*[@id='persist_box']")).click();
		driver.close();

	}

		
			
		}
		
		
		
	}

}
