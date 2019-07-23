package Js_Demo;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	public static void flash(WebElement element, WebDriver driver)
	{
		
		String bgcolor=element.getCssValue("backgroundcolor");
		
		for(int i=0; i<100; i++)
		{
			changeColor("#483D8B", element, driver);
			changeColor(bgcolor, element, driver);
			
		}
	}
	
	

	public static void changeColor(String color, WebElement element, WebDriver driver) 
	{
	
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].style.backgroundcolor = '" + color + " ' " , element );
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			
		}
	}
	
	public static void drawBorder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='6px solid black'",element);
		
	}
	
	
	public static String getTitleByJS(WebDriver driver)
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title=js.executeScript("return document.title;").toString();
		
		return title;
		
	}
	
	
	public static void clickElementByJS(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		
		
	}
	
	public static void generalAlertInfo(WebDriver driver, String message)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('" +message+"')");
		
		
	}
	
	public static void refreshThePage(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
