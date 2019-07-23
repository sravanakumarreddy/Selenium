package PavanTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Checkboxtest {
	@Test;
	void test()

	{
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver",
				"F://sravana//Ecom_Selenium_Project//Java_Practice//drivers//geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		List<WebElement> checkbox_List= (List<WebElement>) driver.findElement(By.id("u_0_9"));

		for (int i = 0; i <=checkbox_List.size(); i++) {
		//checkbox_List.click(); // same method we can it for select and unselect
		// Boolean status=checkbox.isSelected();
		System.out.println(checkbox_List.get(i));
	}
	}
}

// }
