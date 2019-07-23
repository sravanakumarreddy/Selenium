package HeadLessBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadLessChrome {

	@Test
	void demo()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		  //WebDriver driver=new ChromeDriver();
		 
		 ChromeOptions options=new ChromeOptions();
		 //options.setHeadless(true); or  options.addArguments("--headless"); Two ways to handle for Headless Browser
		 options.addArguments("--headless");
		 
		 ChromeDriver driver=new ChromeDriver(options);

		  driver.get("https://www.seleniumeasy.com/selenium-webdriver-tutorials");
		  System.out.println("Page tile : "+driver.getTitle());
		  
	}
}
