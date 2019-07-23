package Training.src.TestNGandAnnotations;

import org.testng.annotations.Test;

public class prioritynames extends priorityname2
{

	
	
	@Test(priority=0)
	
	public void Logintotheapplicationz()
	{
		System.out.println("Logintotheapplication is executed");
	}
    @Test(priority=1)
	
	public void abclogoutverification()
	{
		System.out.println("abclogoutverification is executed");
	}


@Test(priority=0)

public void Logintotheapplicationy()
{
	System.out.println("Logintotheapplication1 is executed");
}

}
