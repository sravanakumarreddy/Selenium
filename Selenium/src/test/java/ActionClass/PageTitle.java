package ActionClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTitle 
{

	@Test
	public void pageTitle()
	{
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver", "F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertTrue(title.contains("Facebook – log in or sign up"));
	  
	}


}
