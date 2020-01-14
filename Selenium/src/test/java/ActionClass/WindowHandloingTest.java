package ActionClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandloingTest
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sravanakumarr_b\\git\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();

		//Enter the URL
		driver.get("http://dev32.na.pfsweb.demandware.net/s/PREVAIL/en_US/sleeveless-scoop-neck-shell/25518916.html?dwvar_25518916_color=JJBF5XX&cgid=womens-clothing");
		
		
		String parentRef = driver.getWindowHandle();
		System.out.println("parentRef:- "+ parentRef);
		
		//Click on Facebook link
		String fbXpath = "//a[@class='share-icon']";
		driver.findElement(By.xpath(fbXpath)).click();
		Thread.sleep(5000);
		
		//Collect the reference valas
		Set<String> allRef = driver.getWindowHandles();
		
		Iterator<String> itr = allRef.iterator();
		
		String parentRefVal = itr.next();
		String childRefVal = itr.next();
		System.out.println("parentRefVal:- "+ parentRefVal);
		System.out.println("childRefVal:- "+ childRefVal);
		
		driver.switchTo().window(childRefVal);
		String childTitle = driver.getTitle();
		System.out.println("childTitle:- " + childTitle);
		String childUrl = driver.getCurrentUrl();
		System.out.println("childUrl:- "+ childUrl);
		
		driver.close();
		
		driver.switchTo().window(parentRefVal);
		
		
		/*
		while (itr.hasNext())
		{
			String refVals = itr.next();
			System.out.println("refVals:- "+ refVals);
			
			if (!parentRef.equals(refVals))
			{
				driver.switchTo().window(refVals);
				String childTitle = driver.getTitle();
				System.out.println("childTitle:- " + childTitle);
				String childUrl = driver.getCurrentUrl();
				System.out.println("childUrl:- "+ childUrl);
			}
			
		}*/
		
		
	}
}
