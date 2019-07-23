package PavanTesting;

public class multiBrowsers {
    //Internet Explorer
    
    System.setProperty("webdriver.ie.driver", "C://Program Files/eclipse/IEDriverServer.exe");
    WebDriver driverIE = new InternetExplorerDriver();
               String baseUrl = "http://newtours.demoaut.com";
               String expectedTitle = "Welcome: Mercury Tours";
               String actualTitle = "";
               driverIE.get(baseUrl);
               actualTitle = driverIE.getTitle();

if (actualTitle.contentEquals(expectedTitle)){

System.out.println("Test Passed!");

} else {

System.out.println("Test Failed");

}

driverIE.findElement(By.name("userName")).sendKeys("mercury");
driverIE.findElement(By.name("password")).sendKeys("mercury");
driverIE.findElement(By.name("login")).click();

driverIE.quit();
}


public static void CHTest()
{
   //Chrome Explorer
           
    System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
    WebDriver driverch = new ChromeDriver();
             
    String baseUrl = "http://newtours.demoaut.com";
               String expectedTitle = "Welcome: Mercury Tours";
               String actualTitle = "";
               driverch.get(baseUrl);
               actualTitle = driverch.getTitle();

if (actualTitle.contentEquals(expectedTitle)){

System.out.println("Test Passed!");

} else {

System.out.println("Test Failed");

}

driverch.findElement(By.name("userName")).sendKeys("mercury");
driverch.findElement(By.name("password")).sendKeys("mercury");
driverch.findElement(By.name("login")).click();
driverch.quit();
}


public static void FTest()
{
   //Firefox
           
   
    WebDriver driver = new FirefoxDriver();
             
    String baseUrl = "http://newtours.demoaut.com";
               String expectedTitle = "Welcome: Mercury Tours";
               String actualTitle = "";
               driver.get(baseUrl);
               actualTitle = driver.getTitle();

if (actualTitle.contentEquals(expectedTitle)){

System.out.println("Test Passed!");

} else {

System.out.println("Test Failed");

}

driver.findElement(By.name("userName")).sendKeys("mercury");
driver.findElement(By.name("password")).sendKeys("mercury");
driver.findElement(By.name("login")).click();

driver.quit();
}

public static void main(String[] args)

{
IETest();
CHTest();
FTest();
}

}
33)         Database Connectivity with Oracle (Insert, Update & Delete)

import java.sql.*;

public class dmlOperationsOracle {

public dmlOperationsOracle() throws ClassNotFoundException, SQLException

{

//String insertquery = "INSERT INTO EMPLOYEE (EMPLOYEE_ID,LAST_NAME,FIRST_NAME)VALUES(2222,'SARAN','KUMAR')";
//String updatequery ="UPDATE EMPLOYEE SET FIRST_NAME='KUMAR' WHERE EMPLOYEE_ID=7521";
String deletequery ="DELETE FROM EMPLOYEE WHERE EMPLOYEE_ID=2222";

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@ 143.54.6.0 :1521:ORA11G","scott","tiger"); 

Statement stmt = conn.createStatement();

//stmt.executeQuery(insertquery);    // stmt.executeQuery(updatequery);
stmt.executeQuery(deletequery);


}
public static void main(String[] args) throws ClassNotFoundException, SQLException

{
new dmlOperationsOracle();
}
}


}
