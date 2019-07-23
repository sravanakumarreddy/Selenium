package Training.src.TestNGandAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class priorityname2
{

	@Test(priority=0)
	
	public void test1()
	{
		System.out.println("test1");
		
		Assert.assertTrue(false);
	}
	
	
}
