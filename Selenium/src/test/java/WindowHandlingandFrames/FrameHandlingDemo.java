package Training.src.WindowHandlingandFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandlingDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:/sravana/Ecom_Selenium_Project/Java_Practice/drivers/chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); //launch chrome
		//Enter the URL
		driver.get("https://development-uk-fragrancedirect.demandware.net/");
		
		//Name or ID
		//Indexing
		//Webelement
		String iframeElement = "//iframe[@data-test-id='ChatWidgetButton-iframe']";
		WebElement iframeWebele = driver.findElement(By.xpath(iframeElement));
		//Switch to Iframe
		driver.switchTo().frame(iframeWebele);
		Thread.sleep(6000);
		//Click on the chatbox
		driver.findElement(By.xpath("//div[contains(@class,'border_overlay')]")).click();
		
		/*driver.get("file:///C:/Users/mpattar/Desktop/frame.htm");
		
		driver.switchTo().frame("seleniumhq");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
		*/
		System.out.println("END");
	}
}
