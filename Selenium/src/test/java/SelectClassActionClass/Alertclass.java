package SelectClassActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Alertclass {

	static WebDriver driver;
	public static void main(String[] args)
	{
		
		System.out.println("Start");
		System.setProperty("webdriver.gecko.driver", "C:/Users/sreddyb/Desktop/Automation/Prevail/Drivers/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		
		
      /*driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
		Alert alt=driver.switchTo().alert();

		
		alt.accept();
		
		
		//driver.findElement(By.xpath("//input[@id='singleLady']")).click();
		System.out.println("end");
		*/
		
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
		Alert dismissBtm=driver.switchTo().alert();
		/*dismissBtm.dismiss();
		System.out.println("end");
		*/
		String text=dismissBtm.getText();
		System.out.println("text is :-"+text);
		
		
		
		
	}
	

}
