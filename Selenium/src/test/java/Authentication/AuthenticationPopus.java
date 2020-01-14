package Authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AuthenticationPopus {
	
	@Test
	void demo312()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sravanakumarr_b\\git\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 


		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//http://username:password@test.com
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text =driver.findElement(By.xpath("//div[@id='content']//p")).getText();
		
		System.out.println(text);
		
	}

}
