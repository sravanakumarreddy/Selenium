package AshotApi;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoImages {

	@Test
	void demo() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement logoImageElement=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		
		Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver, logoImageElement);
		ImageIO.write(logoImageScreenshot.getImage(), "png", new File("C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Screenshots\\orangehrmlLogo.png"));
		
		File fs=new File("C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Screenshots");
		
		if(fs.exists())
		{
			System.out.println("image file captured");
		}
		else
		{
			System.out.println("image file not captured");
		}
		
		
		
	}
}
