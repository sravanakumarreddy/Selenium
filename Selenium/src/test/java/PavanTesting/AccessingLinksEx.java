package PavanTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AccessingLinksEx {

	@Test
	void test() {
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
		// String baseUrl="file:///C:/ExactMatch.html";
		String baseUrl = "file:///C:/PartialMatch.html";

		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);

		// Exact Match
		// driver.findElement(By.linkText("click here")).click();
		// driver.findElement(By.xpath("html/body/a[2]")).click();
		// System.out.println("Title of the page is :" + driver.getTitle());
		// Partial Match
		driver.findElement(By.partialLinkText("click")).click();
		System.out.println("Title of the page is :" + driver.getTitle());
		// driver.quit();
	}

}
