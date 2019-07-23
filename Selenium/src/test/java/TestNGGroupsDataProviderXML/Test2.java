package Training.src.TestNGGroupsDataProviderXML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test2 {
	
	WebDriver driver;
	
	@Test
	public void TC01_A()
	{
		System.out.println("start");
		System.setProperty("webdriver.chrome.driver", "F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://dev32.na.pfsweb.demandware.net/on/demandware.store/Sites-PREVAIL-Site/en_US/Login-Show?original=%2fs%2fPREVAIL%2fen_US%2faccount");
	}

	@Test(dataProvider="LoginValidation",dataProviderClass=Data.class)
	public void TC01_B(String str1, String str2, String st3) throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[(contains(@id,'dwfrm_login_username'))]")).clear();
		driver.findElement(By.xpath("//input[(contains(@id,'dwfrm_login_password'))]")).clear();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[(contains(@id,'dwfrm_login_username'))]")).sendKeys(str1);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[(contains(@id,'dwfrm_login_password'))]")).sendKeys(str2);
	}
}
