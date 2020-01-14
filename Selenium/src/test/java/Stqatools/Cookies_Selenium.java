package Stqatools;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Cookies_Selenium {
 
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sravanakumarr_b\\git\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 
		// Go to URL
		driver.get("https://www.stqatools.com/");
		 
		
		  // Return The List of all Cookies 
		driver.manage().getCookies();
		  
		  // Return specific cookie according to name
		  driver.manage().getCookieNamed("asd");
		  
		  // Create and add the cookie 
		  driver.manage().addCookie(null);
		  
		  // Delete specific cookie 
		  driver.manage().deleteCookie(null);
		  
		  // Delete specific cookie according Name
		  driver.manage().deleteCookieNamed("adf");
		  
		  // Delete all cookies driver.manage().deleteAllCookies();
		 
		
		System.out.println("asdfasdf");
		
		driver.close();
  }
 
}