package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LinksList

{
	
	public static void main(String[] args)
	
	{
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver", "F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
	   List <WebElement> Linkslist= driver.findElements(By.tagName("a"));
	   
	  System.out.println(Linkslist.size());
	  
	  
	  
	  for (int i=0; i<Linkslist.size();i++)
	  {
		  System.out.println(Linkslist.get(i).getText());
	  }
	}

	
	
}
