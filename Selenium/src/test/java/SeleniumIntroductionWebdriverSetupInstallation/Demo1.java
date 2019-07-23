package SeleniumIntroductionWebdriverSetupInstallation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 
{
	public static WebDriver driver;
	public static void main(String[] args) 
	{
		System.out.println("Start");
		
		//To open browser
		openBrowser("firefox");
	
		runScript();
	}
	
	
	public static void openBrowser(String browser)
	{
		String str = System.getProperty("user.dir");
		if (browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",str+"/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} 
		else if (browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", str+"/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	
	public static void runScript()
	{
		driver.get("https://www.seleniumhq.org/download/");
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(800, 800));
		
		System.out.println("End");
	}

}
