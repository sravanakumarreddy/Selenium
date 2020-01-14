package Scroll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scrolling {
 
  
  @Test
  void demoTest123() 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
	  //WebDriver driver=new ChromeDriver();
	  ChromeDriver driver=new ChromeDriver();

  
  driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
  driver.manage().window().maximize(); // maximum browser window

  
  
  JavascriptExecutor js = (JavascriptExecutor) driver;

  // 1. scrolling by using pixel
  //js.executeScript("window.scrollBy(0,500)", "");

/*  //2. scrolling page till we find element
  WebElement flag = driver
    .findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[2]/tbody/tr[26]/td[1]/img"));
    js.executeScript("arguments[0].scrollIntoView();", flag);*/

 //3. scroll page till bottom
  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    
 }
  
 

}
