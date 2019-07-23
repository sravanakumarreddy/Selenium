package TestNGParameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProviderDemo {
	WebDriver driver = null;
	
	@BeforeClass
	void setUp()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	
	@Test(dataProvider="users")
	void loginTest(String un, String ps)
	{
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(ps);
		driver.findElement(By.id("u_0_2")).click();
		
	
		
	}
	
	@DataProvider(name="users")
	String [][] loginData()
	{
		String data[][]= {{"sravana","reddy"},{"kiran","kumar"}};
		return data;
	}
	
	@AfterClass
	void close()
	{
		driver.close();
		
	}
}
