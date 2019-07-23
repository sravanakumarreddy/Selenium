package TestNGParameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	WebDriver driver = null;

	@Parameters("browser")
	@Test(priority = 1)
	void lunchTheBrowser(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		
		else if(browser.equals("firefox"))
					{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\geckodriver.exe");

			driver = new FirefoxDriver();
				
					}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\IEDriverServer.exe");

			driver=new InternetExplorerDriver();
		}
		
		driver.get("https://www.facebook.com/");
	}

	@Test(priority = 2)
	void verifyTheTitle() {

		/*String title=driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		System.out.println("title");*/
	}

	@Test(priority = 3)
	void registration() {

	}

	@Test(priority = 4)
	void closeBrowser() {

		driver.close();
	}
}
