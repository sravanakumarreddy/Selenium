package PavanTesting;

public class webtable2 {

    WebDriver driver=new FirefoxDriver();
    driver.get("file:///C:/sample.html");

   
    int rowCount=driver.findElements(By.xpath("html/body/table/tbody/tr")).size();// Row count
    System.out.println(rowCount);
   
    int columnCount=driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();  // Column count
    System.out.println(columnCount);
   
//Reading data from Web Table                               
for (int r=2;r<=5;r++)
    {
                for ( int c=1; c<=3;c++)
                {
                            System.out.println(driver.findElement(By.xpath("html/body/table/tbody/tr["+r+"]/td["+c+"]")).getText());
                }
    }
               
}
}


}
