package PavanTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleSELECT {

	@Test
	void test() {
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://jsbin.com/osebed/2");

		Select fruits = new Select(driver.findElement(By.id("fruits")));

		// fruits.selectByVisibleText("Apple");
		fruits.selectByVisibleText("Banana");
		// fruits.selectByVisibleText("Grape");

		// fruits.selectByIndex(2);
		// fruits.selectByValue("grape");

	}
}
