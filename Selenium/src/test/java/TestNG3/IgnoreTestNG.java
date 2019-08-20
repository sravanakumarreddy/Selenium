package TestNG3;


import org.testng.annotations.Test;

public class IgnoreTestNG {
	
	@Test(enabled=false)
	void openURL()
	{
		System.out.println("open url");
		
	}
	
	@Test
	void login()
	{
		System.out.println("login");
		
	}
	
	
	
}
