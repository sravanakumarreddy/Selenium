package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sravanakumarr_b\\git\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();

		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click(); //click on Go btn
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if(text.equals("Press a button!")){
			System.out.println("correct alert messg");
			alert.accept();
		}
		else{
			System.out.println("in-correct alert messg");
			alert.dismiss();
		}
		
	    driver.close();
		
	}

}
