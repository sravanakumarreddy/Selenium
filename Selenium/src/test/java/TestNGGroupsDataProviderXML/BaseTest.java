package TestNGGroupsDataProviderXML;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest 
{

WebDriver driver;

@Parameters ({"browser"})

@BeforeTest(groups={"Sanity"})
public void LaunchingBrowser(String browser)
{
	if(browser.equalsIgnoreCase("Firefox"))
	{
		System.out.println("Start FF");
		System.setProperty("webdriver.gecko.driver","C:/Scripts/DemoSelenium/Sample/Drivers/geckodriver.exe" );
		driver=new FirefoxDriver();
		System.out.println("Firefox launched");
		driver.get("http://dev32.na.pfsweb.demandware.net/on/demandware.store/Sites-SiteGenesis-Site");
	}
	
	else if(browser.equalsIgnoreCase("Chrome"))
	{
		System.out.println("Start chrome");
		System.setProperty("webdriver.chrome.driver","C:/Scripts/DemoSelenium/Sample/Drivers/chromedriver.exe" );
		driver=new ChromeDriver();
		System.out.println("Chrome launched");
		driver.get("http://dev32.na.pfsweb.demandware.net/on/demandware.store/Sites-SiteGenesis-Site");
		driver.close();
	}
	
	else if(browser.equalsIgnoreCase("IE"))
	{
		System.out.println("Start IE");
		System.setProperty("webdriver.ie.driver","C:/Scripts/DemoSelenium/Sample/Drivers/IEDriverServer.exe" );
		driver=new InternetExplorerDriver();
		System.out.println("IE launched");
		driver.get("http://dev32.na.pfsweb.demandware.net/on/demandware.store/Sites-SiteGenesis-Site");
		driver.close();
	}
	
}
	
	
}
