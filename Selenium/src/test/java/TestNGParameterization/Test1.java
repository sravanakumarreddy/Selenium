package TestNGParameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	//@Parameters("a")
	@Parameters({"a", "b"})
	@Test
	 void m1(String s1, String s2)
	{
		System.out.println(s1+s2);
	}
	
	@Test
	 void m2()
	{
		System.out.println("m2 method");
	}


}
