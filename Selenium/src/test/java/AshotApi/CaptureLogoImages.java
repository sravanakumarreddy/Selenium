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
		
		WebElement logoImageElement=driver.findElement(By.xpath("//div[@id='divLogo']"));
		
		Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver, logoImageElement);
		ImageIO.write(logoImageScreenshot.getImage(), "png", new File("C:\\Users\\sravanakumarr_b\\Desktop\\Desktop_Data_18-06-2019\\Softwares\\Selenium_ss"));
		
		File fs=new File("C:\\Users\\sravanakumarr_b\\Desktop\\Desktop_Data_18-06-2019\\Softwares\\Screenshots");
		
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
