package AshotApi;

import java.awt.image.BufferedImage;
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
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImages {

	@Test
	void demo() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sravanakumarr_b\\Desktop\\Softwares\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		BufferedImage expecteImage =ImageIO.read(new File ("C://Users//sravanakumarr_b//Desktop//Softwares//Screenshots/orangehrmlLogo.png"));
         
		WebElement logoImageElement=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver, logoImageElement);
        BufferedImage actualImage=logoImageScreenshot.getImage();
          
          ImageDiffer imageDiff=new ImageDiffer();
          ImageDiff diff=imageDiff.makeDiff(expecteImage, actualImage);
          
          if(diff.hasDiff()==true)
          {
        	  System.out.println("image are not same");
          }
          else
          {
        	  System.out.println("image are same");
          }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
		
		
	}
}
