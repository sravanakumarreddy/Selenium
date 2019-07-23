package PavanTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LinksAndDropDownEx {

	@Test
	void test() {
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://newtours.demoaut.com/");

		driver.findElement(By.linkText("REGISTER")).click();

		// For Select class we need to import special package

		WebElement drcontry = driver.findElement(By.name("country"));

		Select dropcountry = new Select(drcontry);

		// dropcountry.selectByVisibleText("INDIA");
		// dropcountry.selectByIndex(2);
		dropcountry.selectByValue("10");

	}

}
