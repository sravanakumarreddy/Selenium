package EncodeDecode;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithEncriptedPassword {

	
	@Test
	void demo()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("sravanakumarreddy.b@gmail.com");
		driver.findElement(By.id("pass")).sendKeys(decodedString("dGVzdDEyMw=="));
		
		
		
		
	}

	static String decodedString(String password)
	{
byte[] decodeString = Base64.decodeBase64(password);
		
		
		return new String(decodeString);
	}
}

