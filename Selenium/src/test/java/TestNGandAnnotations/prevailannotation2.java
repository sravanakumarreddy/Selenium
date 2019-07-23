package TestNGandAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class prevailannotation2 
{
  WebDriver driver;
	@BeforeSuite
	
	public void launchbrowser()
	{
		
		
		
		System.out.println("BeforeSuite");
		
		DesiredCapabilities des=DesiredCapabilities.firefox();
		des.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		des.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
		des.setCapability("acceptInsecureCerts", true);
		des.setCapability("requireWindowFocus", true);
		
		System.setProperty("webdriver.gecko.driver", "C:/Session/Testsession/drivers/geckodriver.exe");
		
	   // driver=new FirefoxDriver(des);

		
	}
	
	@BeforeTest
	
	public void entertheurl()
	{
		System.out.println("BeforeTest");

		driver.get("https://dev32.na.pfsweb.demandware.net/");
	}
	
	
	@BeforeMethod
	public void EnterUNAnsPwd()
	{
		System.out.println("BeforeMethod");

		driver.findElement(By.xpath("//input[contains(@id,'dwfrm_login_username')]")).sendKeys("sowmyabs123@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'dwfrm_login_password')]")).sendKeys("RedCross@1234");
       //login
		driver.findElement(By.xpath("//button[@class='spc-login-btn']")).click();
	}
	
	@AfterMethod
	public void LogoutfromApplication()
	{
		System.out.println("AfterMethod");

		driver.findElement(By.xpath("//a[@title='Logout']")).click();
	}
	
	
	@AfterSuite
	public void closebrowser()
	{
		System.out.println("AfterSuite");

		driver.close();
	}
	
@BeforeClass
	
	public void navigatetoLoginPage()
	{
		System.out.println("BeforeClass");

		//click on user account
		driver.findElement(By.xpath("//a[@class='user-account']/i")).click();
		//click on login
		driver.findElement(By.xpath("//div[@class='user-links']//a[contains(text(),'Login')]")).click();

	}
	
}
