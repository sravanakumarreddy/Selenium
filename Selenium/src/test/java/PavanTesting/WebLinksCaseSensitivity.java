package PavanTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebLinksCaseSensitivity {

	@Test
	void test() {
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
		String baseUrl = "http://newtours.demoaut.com/mercurywelcome.php";

		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);

		// Partial Match for Case sensitive Links

		String linkText1 = driver.findElement(By.partialLinkText("egis"))
				.getText();

		System.out.println(linkText1);

		String linkText2 = driver.findElement(By.partialLinkText("EGIS"))
				.getText();

		System.out.println(linkText2);

		driver.quit();
	}

}
