package SelectClassActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Multiselectdrop {

	WebDriver driver;
	
	@Test
	public void multiSelect()
	{


		System.out.println("Start");
		
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver", "C:/Users/sreddyb/Desktop/Automation/Prevail/Drivers/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://output.jsbin.com/osebed/2");
		/*
		driver.manage().window().maximize();
		
		Select optionselected=new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
		
		optionselected.selectByVisibleText("Banana");
		
		optionselected.selectByIndex(2);
		
		//optionselected.deselectByIndex(2);
		
		System.out.println("End");
		*/
		
		Select multiSelect=new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
		/*multiSelect.selectByIndex(3);
		multiSelect.selectByIndex(0);
		multiSelect.selectByIndex(1);
		multiSelect.selectByIndex(2);*/
		
		//multiSelect.deselectByIndex(1);
		
		multiSelect.deselectAll();
		
	}

}
