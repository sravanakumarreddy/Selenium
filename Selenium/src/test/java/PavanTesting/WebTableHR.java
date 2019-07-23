package PavanTesting;

public class WebTableHR {
    WebDriver driver=new FirefoxDriver();
    //driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
    driver.get("http://opensource.demo.orangehrm.com/");
   
    //Login to OrangeHRM
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin");
    driver.findElement(By.id("btnLogin")).click();
   
    //Admin--> User management--> Users
   
    driver.findElement(By.id("menu_admin_viewAdminModule")).click();
    driver.findElement(By.id("menu_admin_UserManagement")).click();
    driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
   
    //int rowCount=driver.findElements(By.xpath("html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();// Row count
    int rowCount=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr")).size();// Row count
   
   
    System.out.println(rowCount);
   
    int statuscount=0;
   
    for( int i=1;i<=rowCount;i++)
    {
                String status=driver.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr["+i+"]/td[5]")).getText();
               
                if (status.equals("Enabled"))
                {
                            statuscount=statuscount+1;
                           
                }
    }
   
    System.out.println("No. of users enabled"+ statuscount);
    }
   
}



}
