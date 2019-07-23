package Pavantools;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlertPopup {

	@Test

	public void Navigate_forward_back() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Click the URL
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		// Observe in that page have "3 buttons there" 1. Show Me Confiramation 2. Show Me Alert 3. Show Me Prompt
		//Alert Pop up Handling - click the Show Me Alert Button
		
		driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
		//To locate alert.
		Alert A1 = driver.switchTo().alert();
		//To read the text from alert popup.
		String Alert1 = A1.getText();
		System.out.println(Alert1);
		Thread.sleep(2000);
		//To accept/Click Ok on alert popup.
		A1.accept();
		
		//Confirmation Pop up Handling - CLick the Show Me Confiramation Button
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert A2 = driver.switchTo().alert();
		String Alert2 = A2.getText();
		System.out.println(Alert2);
		Thread.sleep(2000);
		//To click On cancel button of confirmation box.
		A2.dismiss();
		//Prompt Pop up Handling - Click the Show Me Prompt button
		driver.findElement(By.xpath("//button[contains(.,'Show Me Prompt')]")).click();
		Alert A3 = driver.switchTo().alert();
		String Alert3 = A3.getText(); System.out.println(Alert3);
		//To type text In text box of prompt pop up.
		A3.sendKeys("This Is John");
		Thread.sleep(2000);
		A3.accept();
		}
		
		
	}

