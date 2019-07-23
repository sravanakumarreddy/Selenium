package SelectClassActionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Actionclass {

	WebDriver driver;
	@Test
	public void ActionsCS()
	
	{

		System.out.println("Start");
		System.setProperty("webdriver.gecko.driver", "C:/Users/sreddyb/Desktop/Automation/Prevail/Drivers/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();

		
		
		driver.get("https://development-shop-arc.demandware.net/s/RedCross/take-a-class");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Supplies & Products')]"))).build().perform();
		//act.contextClick(driver.findElement(By.xpath("//div[@class='hero-images-banner desktop-only']"))).click().perform();
		
		System.out.println("End");
	
		
	
	}

}
