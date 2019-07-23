package Js_Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptDemo {
	
	
	@Test
	void demo() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		
		driver.manage().window().maximize();
		
	
		WebElement jionfree =driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
		
		// flasing 
		//JavaScriptUtil.flash(jionfree, driver);
		
		//drawing border & screenshot
		/*JavaScriptUtil.drawBorder(jionfree, driver);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File trg=new File("C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Screenshots\\sravan.png");
		FileUtils.copyFile(src,trg);*/
		
		
		// title of the page
		/*System.out.println(driver.getTitle());
		String title=JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);
		*/
		// clicking on element
		
		//JavaScriptUtil.clickElementByJS(jionfree, driver);
		
		
		// Genarate Alert message
		
		//JavaScriptUtil.generalAlertInfo(driver, "you clicked on singup button");
		
		// refresh the page
		
		JavaScriptUtil.refreshThePage(driver);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
