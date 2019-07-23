package Training.src.TestNGandAnnotations;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class prior1 extends prior2
{

	@Test(priority=0)
	public void PersonaldetailsLinkverification()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Personal Data')]")).isDisplayed();
	}
	
	
	@Test(priority=0)
	public void dloginsectionheading()
	{
		driver.findElement(By.xpath("//h1[contains(text(),'My Account Login')]")).isDisplayed();
	}
	
	
}
