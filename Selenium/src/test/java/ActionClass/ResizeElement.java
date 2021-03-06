package ActionClass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeElement {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sravanakumarr_b\\git\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();

		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		
		WebElement resize = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Actions action = new Actions(driver);
		action.moveToElement(resize).dragAndDropBy(resize, 100, 100).build().perform();
	}
}