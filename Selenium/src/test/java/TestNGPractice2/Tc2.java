package TestNGPractice2;

import org.testng.annotations.*;

public class Tc2 {
	
	@Test
	void m3() 
	{
		System.out.println("m3");
	}
	
	@Test
	void m4() 
	{
		System.out.println("m4");
	}

	@BeforeTest
	void bt() 
	{
		System.out.println("BT");
	}
	
	@AfterTest
	void af() 
	{
		System.out.println("AF");
	}
	
}
