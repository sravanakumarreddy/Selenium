package PavanTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatingElementsObjects {
	/*
	 * 1. Open the browser 2. Enter user name 3. Enter password 4. Click on sign
	 * in
	 */

	public class locatingobjects {

		@Test
		void test() {

			System.out.println("start");
			System.setProperty("webdriver.gecko.driver",
					"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
			WebDriver driver = new FirefoxDriver();

			driver.get("http://newtours.demoaut.com/"); // Invoke the browser
														// and open the URL

			driver.findElement(By.name("userName")).sendKeys("mercury"); // Enter
																			// user
																			// name
			driver.findElement(By.name("password")).sendKeys("dsafasfdas"); // Enter
																			// password
			driver.findElement(By.name("login")).click();

			// Checking the successfull login
			String expectedtitle = "Find a Flight: Mercury Tours:";
			String actualtitle = driver.getTitle();

			if (actualtitle.contentEquals(expectedtitle))
				System.out.println("Login successfull");
			else
				System.out.println("Login Un successfull");

			driver.close(); // closing the browser
		}

	}

}
