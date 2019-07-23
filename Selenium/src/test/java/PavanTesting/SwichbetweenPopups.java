package PavanTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SwichbetweenPopups {
	@Test
	void test() {

		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");
		String alertmsg;

		WebDriver driver = new FirefoxDriver();

		driver.get("http://jsbin.com/usidix/1");

		// driver.findElement(By.cssSelector("input[type=button]")).click(); //
		// click the Go button\\

		driver.findElement(By.xpath("html/body/input")).click();

		alertmsg = driver.switchTo().alert().getText(); // this will read
														// message from altert
														// msg.

		System.out.println(alertmsg);

		driver.switchTo().alert().accept();

	}

}
