package Training.src.TestNGandAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotationsnames 
{

	
	@BeforeTest
	public void BeforeTestmethod()
	{
		System.out.println("BeforeTest is called");
	}
	
	
	@BeforeClass
	
	public void BeforeBeforeClass()
	{
		System.out.println("BeforeClass is called");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod is called");
	}
	
	@AfterMethod
	
	public void AfterMethodMethod()
	{
		System.out.println("AfterMethod is called");
	}
	
@BeforeSuite
	
	public void beforesuitmethod()
	{
		System.out.println("Before suit is called");
	}
	
	@AfterClass
	public void AfterClassMethod()
	{
		System.out.println("AfterClass is called");
	}
	
	@AfterTest
	
	public void AfterTestMethod()
	{
		System.out.println("AfterTest is called");
	}
	
	@AfterSuite
	public void AfterSuiteMethod()
	{
		System.out.println("AfterSuite is called");
	}
	
}

