package TestNG3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenceMethod2 {
	
	@Test
	void openURL()
	{
		System.out.println("open url");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods= {"openURL"})
	void login()
	{
		System.out.println("login");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods= {"login"})
	void search()
	{
		System.out.println("search");
	}
	@Test(dependsOnMethods= {"login" ,"search"})
	void advacnceSerach()
	{
		System.out.println("advance search");
	}
	@Test(dependsOnMethods= {"login"})
	void logOUT	()
	{
		System.out.println("logOUT");
	}
	
}
