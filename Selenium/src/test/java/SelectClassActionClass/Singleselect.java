package Training.src.SelectClassActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Singleselect {

	WebDriver driver;
	@Test
	public void SingleSelect()
	{

		
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver", "F:/sravana/Ecom_Selenium_Project/Java_Practice/drivers/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		
		
		Select optionselected=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		
		/*
		if(optionselected.isMultiple())
		{
			System.out.println("Multiselect select dropdown");
		}
		
		else
		{
			System.out.println("sigle dropdown");
		}
	
		
		System.out.println("End");
	*/	
	}

}
