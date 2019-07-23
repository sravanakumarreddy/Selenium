package PavanTesting;

public class Log4Jforlogging {
	
	Xml File

	"http://jakarta.apache.org/log4j/"
	debug="false">
	                        "fileAppender"
	class="org.apache.log4j.FileAppender">
	                        "Threshold"
	value="INFO" />
	                        "File"
	value="logfile.log"/>
	                        class
	="org.apache.log4j.PatternLayout">
	                                    "ConversionPattern"
	value="%d %-5p [%c{1}] %m %n" />
	                       

	                       


	           
	                        "INFO"
	/>
	                        "fileAppender"
	/>
	           




	WebDriver Script

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.apache.log4j.Logger;
	import org.apache.log4j.xml.DOMConfigurator;

	public class Log4jExample {

	            public static void main(String[] args)
	            {
	                       
	                        // Here we need to create logger instance so we need to pass Class name for
	                        Logger          logger=         Logger.getLogger("Log4jExample");
	                        DOMConfigurator.configure("Log4j.xml");
	                       
	                                   
	                        WebDriver driver=new FirefoxDriver();
	                       
	                        logger.info("browser opend");
	                       
	           
	                        driver.get("http://newtours.demoaut.com/");
	                       
	                        logger.info("Clicked on Regiser");
	                        driver.findElement(By.linkText("REGISTER")).click();
	                       
	                        logger.info("Entering contact information");

	                        driver.findElement(By.name("firstName")).sendKeys("pavan");
	                       
	                       
	                        driver.findElement(By.name("lastName")).sendKeys("Kumar");
	                        driver.findElement(By.name("phone")).sendKeys("1234567895");
	                        driver.findElement(By.name("userName")).sendKeys("pavan@gmail.com"); // email id
	                       
	                        logger.info("Entering mailing information");
	           
	                        driver.findElement(By.name("address1")).sendKeys("Nizampet");
	                        driver.findElement(By.name("address2")).sendKeys("Kukatpally");
	                        driver.findElement(By.name("city")).sendKeys("Hyderabad");
	                        driver.findElement(By.name("state")).sendKeys("AP");
	                        driver.findElement(By.name("postalCode")).sendKeys("500073");
	                       
	                        logger.info("selecting country");

	                        Select dropcountry=new Select(driver.findElement(By.name("country")));
	                        dropcountry.selectByVisibleText("INDIA");
	           
	                        logger.info("Entering user information");

	                        driver.findElement(By.name("email")).sendKeys("training2"); // user name
	                        driver.findElement(By.name("password")).sendKeys("training1");
	                        driver.findElement(By.name("confirmPassword")).sendKeys("training1");
	                       
	                        logger.info("clicking on register link");
	                        driver.findElement(By.name("register")).click();
	                       

	                        logger.info("validation started");
	                          if(driver.getPageSource().contains("Thank you for registering"))
	                          {
	                              System.out.println("Your registered successfully- TEST PASSED");
	                                    logger.info("validation DONE");
	                           }
	                         
	                          else
	                         
	                          {
	                                      System.out.println("Your registration failed - TEST FAILED");
	                                      logger.info("validation DONE");
	                           }

	                         logger.info("Exit Test");
	                         
	                         driver.quit();

	}
	}

}
