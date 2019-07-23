package HeadLessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class HeadLessFirefox {

	@Test
	void demo()
	{
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\geckodriver.exe");

	
			
			FirefoxOptions options=new FirefoxOptions();
			options.setHeadless(true);
			
			WebDriver driver =new FirefoxDriver(options);
			
			 driver.get("https://www.seleniumeasy.com/selenium-webdriver-tutorials");
			  System.out.println("Page tile : "+driver.getTitle());
			
		  
	}
}}
