package PavanTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitExample {

	@Test
	void test() {
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

		driver.get("http://opensource.demo.orangehrm.com/");

		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys(
				"Admin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys(
				"admin");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();

		// Thread.sleep(10000);

		WebDriverWait mywait = new WebDriverWait(driver, 1000);

		mywait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(".//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[1]/div/a/img")));

		driver.findElement(
				By.xpath(".//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[1]/div/a/img"))
				.click();

		mywait.until(ExpectedConditions.titleContains("OrangeHRM"));

	}
}
