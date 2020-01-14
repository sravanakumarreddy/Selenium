package WindowHandlingandFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sravanakumarr_b\\git\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
				//Enter the URL
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.getTitle();
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		
       Set<String> allRef = driver.getWindowHandles();
		
		Iterator<String> itr = allRef.iterator();
		
		String parentRefVal = itr.next();
		String childRefVal = itr.next();
		
		System.out.println("parentRefVal:- "+ parentRefVal);
		System.out.println("childRefVal:- "+ childRefVal);
		
		driver.switchTo().window(childRefVal);
		String childTitle = driver.getTitle();
		System.out.println("childTitle:- " + childTitle);
		String childUrl = driver.getCurrentUrl();
		System.out.println("childUrl:- "+ childUrl);
		
		driver.switchTo().window(parentRefVal);
		String parenttitle=driver.getTitle();
		System.out.println("parent ref url : "+parenttitle);
		
	
		
	
	}
}
