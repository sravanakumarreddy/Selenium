package PavanTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetCommands {

	@Test
	void test() {
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");

		WebDriver driver = new FirefoxDriver(); // Web Driver object creation

		driver.get("https://www.facebook.com/"); // invoke the browser and open
													// the URL
		System.out.println(driver.getTitle()); // Returns title of the page
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close(); // close the browser
	}

}
