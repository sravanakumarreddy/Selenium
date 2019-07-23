package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UnderLine {

			 public static void main(String[] args) {

			 WebDriver driver = new FirefoxDriver();

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			 driver.get("https://www.google.co.in/?gfe_rd=cr&ei=nEVsVvXvNbHG8AeV94-IBQ&gws_rd=ssl");

			 String cssValue= driver.findElement(By.xpath(".//*[@id='_eEe']/a[3]")).getCssValue("text-decoration");

			 System.out.println("value" + cssValue);

			 Actions act = new Actions(driver);

			 act.moveToElement(driver.findElement(By.xpath(".//*[@id='_eEe']/a[3]"))).perform();

			 String cssValue1= driver.findElement(By.xpath(".//*[@id='_eEe']/a[3]")).getCssValue("text-decoration");

			 System.out.println("value"+ cssValue1);

			 driver.close();
	}

}
