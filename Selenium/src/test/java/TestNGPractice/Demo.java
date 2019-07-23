package TestNGPractice;

import org.testng.annotations.Test;

public class Demo {
	
	@Test(priority=3)
	void openURL()
	{
		System.out.println("openURL");
	}
	
	@Test(priority=1)
	void login()
	{
		System.out.println("LOGIN");
	}
	
	@Test(priority=2)
	void logout()
	{
		System.out.println("LOGOUT");
	}

}
