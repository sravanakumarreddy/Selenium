package PavanTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class switchingFrames {

	@Test
	void test() {
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");

		driver.switchTo().frame("classFrame");

		driver.findElement(By.linkText("Deprecated")).click();

		driver.close();

	}

}
