package PavanTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class webtable1 {

	@Test
	void test() {
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Table1.html");

		int rowCount = driver
				.findElements(By.xpath("html/body/table/tbody/tr")).size();// Row
																			// count
		System.out.println(rowCount);

		int columnCount = driver.findElements(
				By.xpath("html/body/table/tbody/tr/th")).size(); // Column count
		System.out.println(columnCount);

		// Reading data from Web Table
		for (int r = 2; r <= 3; r++) {
			for (int c = 1; c <= 3; c++) {
				System.out.println(driver.findElement(
						By.xpath("html/body/table/tbody/tr[" + r + "]/td[" + c
								+ "]")).getText());
			}
		}

	}
}
