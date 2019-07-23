package Training.src.TestNGandAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class prior2 
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
		
	    //driver=new FirefoxDriver(des);
		driver.get("https://dev32.na.pfsweb.demandware.net/");

		//click on user account
		driver.findElement(By.xpath("//a[@class='user-account']/i")).click();
		//click on login
		driver.findElement(By.xpath("//div[@class='user-links']//a[contains(text(),'Login')]")).click();

	}
	
	@Test(priority=0)
	public void createaccountbuttonVerification()
	{
		
		driver.findElement(By.xpath("//button[@name='dwfrm_login_register']")).isDisplayed();
		
	}
	
	@Test(priority=1)
	public void logintotheapplication()
	{
		System.out.println("BeforeMethod");

		driver.findElement(By.xpath("//input[contains(@id,'dwfrm_login_username')]")).sendKeys("sowmyabs123@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'dwfrm_login_password')]")).sendKeys("RedCross@1234");
       //login
		driver.findElement(By.xpath("//button[@class='spc-login-btn']")).click();
		
		
	}
}
