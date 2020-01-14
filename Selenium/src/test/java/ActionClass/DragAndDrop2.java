package ActionClass;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {
 
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sravanakumarr_b\\git\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();

 

driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
 
// It is always advisable to Maximize the window before performing DragNDrop action
 
driver.manage().window().maximize();
 
driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
WebElement From = driver.findElement(By.xpath("//*[@id='box2']"));
 
WebElement To = driver.findElement(By.xpath("//*[@id='box101']"));
 
Actions act = new Actions(driver);
 
/*Action act = act.clickAndHold(From)

.moveToElement(To)
 
.release(To)
 
.build();
 
dragAndDrop.perform();*/

act.clickAndHold(From).moveToElement(To).release(To).build().perform();

//driver.close();
 
}
 
}