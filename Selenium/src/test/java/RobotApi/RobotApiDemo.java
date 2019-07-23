package RobotApi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RobotApiDemo {
	
	@Test
	void demo() throws AWTException
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://spreadsheetpage.com/index.php/file/yearly_calendar_workbook/");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul/li[3]/a")).click();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
