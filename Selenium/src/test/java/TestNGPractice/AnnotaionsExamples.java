package TestNGPractice;


import org.testng.annotations.*;

public class AnnotaionsExamples {
	
	@BeforeClass
	void login()
	{
		System.out.println("login");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("logout");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("search");
	}
	@Test(priority=2)
	void advanceSearch()
	{
		System.out.println("advanceSearch");
	}
	@Test(priority=3)
	void recharge()
	{
		System.out.println("recharge");
	}
}
