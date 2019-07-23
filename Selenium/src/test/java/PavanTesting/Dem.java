package PavanTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Dem {

	public class myClass {

		@Test
		void test()

		{
			// declaration and instantiation of objects/variables

			System.out.println("start");
			System.setProperty("webdriver.gecko.driver",
					"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
			WebDriver driver;
			driver = new FirefoxDriver();

			// WebDriver driver = new FirefoxDriver();

			String baseUrl = "http://newtours.demoaut.com";

			// launch Fire fox and direct it to the Base URL

			driver.get(baseUrl);

			String expectedTitle = "Welcome: Mercury Tours";

			String actualTitle = "";

			// get the actual value of the title

			actualTitle = driver.getTitle();

			/*
			 *  * compare the actual title of the page with the expected one and
			 * print
			 * 
			 * the result as "Passed" or "Failed"
			 */

			if (actualTitle.contentEquals(expectedTitle)) {

				System.out.println("Test Passed!");

			} else {

				System.out.println("Test Failed");

			}

			// close Fire fox

			driver.close();

			driver.quit();
		}

	}

}
