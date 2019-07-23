package TestNG3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableMethods {
	
	@Test
	void openURL()
	{
		System.out.println("open url");
		Assert.assertTrue(true);
	}
	
	@Test()
	void login()
	{
		System.out.println("login");
		
	}
	
	@Test(enabled=false)
	void search()
	{
		System.out.println("search");
	}
	@Test(enabled=false)
	void advacnceSerach()
	{
		System.out.println("advance search");
	}
	@Test()
	void logOUT	()
	{
		System.out.println("logOUT");
	}
	
}
