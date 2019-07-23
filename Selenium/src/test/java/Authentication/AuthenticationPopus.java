package Authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AuthenticationPopus {
	
	@Test
	void demo312()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//http://username:password@test.com
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text =driver.findElement(By.xpath("//div[@id='content']//p")).getText();
		
		System.out.println(text);
		
	}

}
