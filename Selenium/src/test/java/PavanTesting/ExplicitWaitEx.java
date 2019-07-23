package PavanTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitEx {
	@Test
	void test() {
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		WebDriverWait myWaitVar = new WebDriverWait(driver, 20); // For Explicit
																	// wait

		driver.get("http://newtours.demoaut.com/");

		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By
				.name("userName")));

		driver.findElement(By.name("userName")).sendKeys("mercury");

		driver.quit();
	}

}
