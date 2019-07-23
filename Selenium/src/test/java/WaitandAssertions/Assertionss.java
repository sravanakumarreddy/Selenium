package WaitandAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class Assertionss 

{
	public static WebDriver driver;
	
	@Test
	public void TC01_LaunchingBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/sreddyb/Desktop/Automation/Test_Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://dev32.na.pfsweb.demandware.net/on/demandware.store/Sites-SiteGenesis-Site");
		driver.manage().window().maximize();
	}
	
	/*@Test
	public void TC01_HardAssert()
	{		
		System.out.println("Start");
		Assert.assertEquals("Test1", "Test");
		Assert.assertNotEquals("Test", "Test1");
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		System.out.println("End");
	}*/
	
	@Test
	public void TC01_SoftAssert()
	{
		System.out.println("Start");
		SoftAssert sa=new SoftAssert();
		/*driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		sa.assertFalse(driver.findElement(By.xpath("//a[contains(text(),'llogin')]")).isDisplayed(), "login");
*/		sa.assertEquals("Test", "Test1","step");
		System.out.println("a");
		sa.assertFalse(false,"step1");
		System.out.println("b");
		sa.assertTrue(false,"step2");
		sa.assertFalse(false,"step3");
		sa.assertTrue(false,"step4");
		sa.assertFalse(true,"step5");
		System.out.println("End");
		sa.assertAll();
	}
}
