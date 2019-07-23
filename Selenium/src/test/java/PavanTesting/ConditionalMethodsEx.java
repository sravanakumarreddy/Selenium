package PavanTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ConditionalMethodsEx {

	@Test
	void test() {
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://newtours.demoaut.com/");

		WebElement txt_user = driver.findElement(By.name("userName"));
		WebElement txt_pass = driver.findElement(By.name("password"));
		WebElement btn_sign = driver.findElement(By.name("login"));

		// if (driver.findElement(By.name("userName")).isDisplayed() &&
		// driver.findElement(By.name("userName")).isEnabled() )

		if (txt_user.isDisplayed() && txt_user.isEnabled()) {
			txt_user.sendKeys("mercury");

		}

		if (txt_pass.isDisplayed() && txt_pass.isEnabled()) {
			txt_pass.sendKeys("mercury");

		}

		if (btn_sign.isDisplayed()) {

			btn_sign.click();

		}

		WebElement radio_oneway = driver.findElement(By
				.cssSelector("input[value=oneway]"));
		WebElement radio_twoway = driver.findElement(By
				.cssSelector("input[value=roundtrip]"));

		if (radio_oneway.isSelected())

		{
			radio_twoway.click();
		}

		if (radio_twoway.isSelected()) {
			radio_oneway.click();
		}

	}

}
