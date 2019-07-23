package Training.src.TestNGandAnnotations;

import org.testng.annotations.Test;

public class Annotations extends Annotationsnames
{

	
	//veformethod
	@Test(invocationCount=10)
	
	public void test1()
	{
		System.out.println("Test1 is executed");
	}
	
	//after method
	
	//nefore method
	@Test
	public void test2()
	{
		System.out.println("Test2 is executed");
	}
	//after method
}
