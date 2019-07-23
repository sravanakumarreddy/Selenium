package Reports;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners extends TestListenerAdapter {
	
	private static final String ChartLocation = null;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void onStart(ITestContext tr) 
	{
		htmlReporter =new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/sravana.html");
		htmlReporter.loadConfig(System.getProperty("user.dir") + "extent-config.xml");
		
		extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("hostname", "local host");
		extent.setSystemInfo("environment", "qa");
		extent.setSystemInfo("user", "sravan");
		extent.setSystemInfo("browser", "chrome");
		extent.setSystemInfo("os", "windows");
		
		
		
		htmlReporter.config().setDocumentTitle("Automation report");
		htmlReporter.config().setReportName("functional test report");
		//htmlReporter.config().setTestViewChartLocation(ChartLocation.t);
		htmlReporter.config().setTheme(Theme.STANDARD);

		
	}

	public void onTestSuccess(ITestResult tr) {

	logger = extent.createTest(tr.getName());
	logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	
	}

	public void onTestFailure(ITestResult tr) {

		logger = extent.createTest(tr.getName());
		logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		
		String screenShot = System.getProperty("user.dir")+ "/Screenshot/" + tr.getName() + ".png";
		try {
			logger.fail("screenshot is below : " + logger.addScreenCaptureFromPath(screenShot));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	public void onTestSkipped(ITestResult tr) {
		
		logger = extent.createTest(tr.getName());
		logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));

		
	}
	public void Onfinshe(ITestResult tr)
	{
		extent.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
