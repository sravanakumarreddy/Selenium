package PavanTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NavigateCommandsEx {
	@Test
	void test()

	{
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.co.in/"); // get() method
		System.out.println(driver.getCurrentUrl());

		driver.navigate().to("https://www.facebook.com/"); // navigate().to()
															// method
		System.out.println(driver.getCurrentUrl());

		driver.navigate().back(); // navigate.back() method
		System.out.println(driver.getCurrentUrl());

		driver.navigate().forward(); // navigate.forward() method
		System.out.println(driver.getCurrentUrl());

	}

}
