package Reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.utils.FileUtil;

public class Logintest {
	
	static WebDriver driver ;
	@BeforeClass
	void setUp()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	void loginTest()
	{
		
		driver.findElement(By.id("email")).sendKeys("afasdfasfd");
		driver.findElement(By.id("pass")).sendKeys("safdasfdasfd");
		driver.findElement(By.id("u_0_2")).click();
		Assert.assertEquals(driver.getTitle(), "asdfasfdasfd");
	}
	
	@AfterClass
	void closeBrowser()
	{
		driver.close();
	}

	@AfterMethod
	public void captureScreen(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{ 
		TakesScreenshot ts =((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		
	    File target = new File(System.getProperty("user.dir")+ "/Screenshot/" + result.getName() + ".png");
	    FileUtils.copyFile(source, target);
	    System.out.println("screenshot");
	    
	    

	           

	                
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
