package WaitandAssertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wait 
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
	
/*	@Test
	public void TC02_NormalWait() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
	}
	
	@Test
	public void TC02_ImplicitWait() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
	}*/
	
	@Test
	public void TC02_ExplicitWait() throws InterruptedException
	{
		//click on search field
		driver.findElement(By.xpath("//input[@id='q']")).click();
		//enter data
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys("Fur");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product-suggestions']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='product-suggestion']//div[@class='product-name'])[1]")));
		driver.findElement(By.xpath("(//div[@class='product-suggestion']//div[@class='product-name'])[1]")).click();	
	}
	


}
