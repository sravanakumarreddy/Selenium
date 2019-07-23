package TestNGListeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {
	
	
	public void onTestStart(ITestResult tr) 
	{
		System.out.println("Test Started");
	}

	public void onTestSuccess(ITestResult tr) {

		System.out.println("ON test success");

	}

	public void onTestFailure(ITestResult tr) {

		System.out.println("on test failure");

	}

	public void onTestSkipped(ITestResult tr) {
		System.out.println("on test skipped");
	}

}
