package Stqatools;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class FindElements {
 
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sravanakumarr_b\\git\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 
  driver.get("https://stqatools.com/");
 
//Find all elements and store into list
 List<WebElement> allElement = driver.findElements(By.xpath("//table/tr"));

 // Get the size of allElements and store into integer.
 int size = allElement.size();

 for(int i=0; i<=size; i++)
 {
	 System.out.println(size);
 }
 // Print size of Elements
 System.out.println(size);
  }
 
}