package Stqatools;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class CheckBoxAndRadioBox {
 
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sravanakumarr_b\\git\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 
  driver.get("https://demo.stqatools.com/");
 
  // Male Radio Button location store into maleRadioBtn WebElement
  WebElement RadioBtn = driver.findElement(By.id("gender-male"));
 
  // Click on Radio Button
  RadioBtn.click();
 
  // Cricket Checkbox location store into Checkbox WebElement
  WebElement Cricket = driver.findElement(By.id("cricket"));
 
  // Hockey Checkbox location store into Checkbox WebElement
  WebElement Hockey = driver.findElement(By.id("hockey"));
 
  // Select Multiple Checkboxes
  Cricket.click();
  Hockey.click();
  }
 
}