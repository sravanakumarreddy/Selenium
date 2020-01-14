package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseRightClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sravanakumarr_b\\git\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();

		Thread.sleep(200);
		
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement btn=driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
		
		act.contextClick(btn).perform();
		
		

	}

}
