package PavanTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckingWebLinks {

	@Test
	void test() {
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("http://newtours.demoaut.com/");

		List linkElements = driver.findElements(By.tagName("a"));
		String links[] = new String[linkElements.size()];

		// Extracting Links and storing into an array
		for (int i = 0; i < linkElements.size(); i++) {
			links[i] = ((WebElement) linkElements.get(i)).getText();
		}

		// Reading links from an array and clicking them
		for (int i = 0; i < links.length; i++) {

			driver.findElement(By.linkText(links[i])).click();

			if (driver.getTitle().equals("Under Construction: Mercury Tours")) {
				System.out.println(links[i] + "  "
						+ "Link is under construction");

			}

			else {
				System.out.println(links[i] + "  " + "Link is working");

			}

			driver.navigate().back();

		}

		driver.quit();
	}

}
