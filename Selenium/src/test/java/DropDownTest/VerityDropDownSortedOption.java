package DropDownTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bson.codecs.CollectibleCodec;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class VerityDropDownSortedOption {
	
	@Test
	void demo()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement element = driver.findElement(By.id("animals"));
				    js.executeScript("arguments[0].scrollIntoView();", element);
		
		Select sel=new Select(element);
		
		List orgizinalList=new ArrayList();

		List<WebElement> options=sel.getOptions();
		
		for(WebElement e:options)
		{
			orgizinalList.add(e.getText());
		}
		System.out.println(orgizinalList);
		
		List tempList=new ArrayList();
		
		tempList=orgizinalList;
		System.out.println("Before sorting testing result: "+tempList);
		Collections.sort(tempList);
		System.out.println("After soring testing result: "+tempList);
		
		if(orgizinalList==tempList)
		{
			System.out.println("Dropdown sorted");
		}
		else
		{
			System.out.println("dropdown not sorted");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		driver.close();
	}
	

}
