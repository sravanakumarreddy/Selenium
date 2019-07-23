package PavanTesting;

public class DownloadingFiles {
	import java.io.IOException;

	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class downloadFile {

	public static void main(String[] args)
	{
	String baseUrl = "http://messenger.yahoo.com/";
	WebDriver driver = new FirefoxDriver();

	driver.get(baseUrl);
	WebElement downloadButton = driver.findElement(By.id("messenger-download"));
	String sourceLocation = downloadButton.getAttribute("href");
	String wget_command = "cmd /c wget -P c: --no-check-certificate " + sourceLocation;
	System.out.println(wget_command);
	try {
	Process exec = Runtime.getRuntime().exec(wget_command);
	//Process execN=Runtime.getRuntime().exec("notepad.exe");
	int exitVal = exec.waitFor();

	System.out.println("Exit value: " + exitVal);
	} catch (InterruptedException | IOException ex) {
	System.out.println(ex.toString());
	}
	driver.quit();
	}
	}



}
