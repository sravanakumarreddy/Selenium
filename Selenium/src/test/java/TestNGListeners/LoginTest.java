package TestNGListeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	void setUp()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	void loginByGmail()
	{
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods= {"setUp"})
	void loginByFacebook()
	{
		Assert.assertTrue(true);
	}

}
