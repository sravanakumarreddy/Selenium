package HeadLessBrowser;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadLessHtmlBrowser {
	
	@Test
	void demo()
	{
		HtmlUnitDriver driver = new HtmlUnitDriver();
		 driver.get("https://www.seleniumeasy.com/selenium-webdriver-tutorials");
		  System.out.println("Page tile : "+driver.getTitle());
		  System.out.println("current page url: "+driver.getCurrentUrl());
	}

}
