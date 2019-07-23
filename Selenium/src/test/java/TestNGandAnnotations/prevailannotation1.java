package TestNGandAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class prevailannotation1 extends prevailannotation2
{

	@Test
	
	public void Myaccountverification()
	{
		System.out.println("Myaccountverification");

		driver.findElement(By.xpath("//h1[contains(text(),'My Account')]")).isDisplayed();
	}
	
	
	@Test
	
	public void logoutverifcation()
	{
		System.out.println("logoutverifcation");

		driver.findElement(By.xpath("//h1[contains(text(),'My Account Login')]")).isDisplayed();
	}
}
