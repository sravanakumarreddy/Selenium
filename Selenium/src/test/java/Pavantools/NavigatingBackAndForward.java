package Pavantools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NavigatingBackAndForward {

	@Test

	public void Navigate_forward_back() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open the URL
		driver.get("http://www.google.com");

		// navigate on specific software web application page or URL
		driver.navigate().to("http://selenium-venkat.blogspot.com/p/index_4.html");

		// To navigate back (Same as clicking on browser back button)
		driver.navigate().back();

		// To navigate forward (Same as clicking on browser forward button)
		driver.navigate().forward();
	}
}
