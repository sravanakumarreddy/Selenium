package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sravanakumarr_b\\git\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.co.in/");
		Thread.sleep(200);
		
		driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("software testing");
		
		WebElement ele=driver.findElement(By.xpath(".//*[@id='sbse0']/div[2]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).build().perform(); // mouse Hover action
		
		act.click(ele).build().perform(); // click the the element
		
	}

}
