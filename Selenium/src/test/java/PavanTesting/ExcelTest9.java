package PavanTesting;

public class ExcelTest9 {
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class loginDataDrivenTestExcel {

	            public static void main(String[] args) throws IOException,NullPointerException {
	                        // TODO Auto-generated method stub
	                       
	              WebDriver driver= new FirefoxDriver();
	              driver.get("http://www.newtours.demoaut.com/");
	             
	              // file input from file1
	             
	                        FileInputStream file1=new FileInputStream("C://Login.xlsx");
	                        XSSFWorkbook workbook1= new XSSFWorkbook(file1);
	                        XSSFSheet sheet1=workbook1.getSheet("Sheet1");
	                       
	            // file output to file2
	                        FileOutputStream file2=new FileOutputStream("C://Login.xlsx");
	                        XSSFWorkbook workbook2=new XSSFWorkbook();
	                        XSSFSheet sheet2=workbook2.createSheet("Sheet1");
	                       
	                       
	            //Writing headers into file2
	                        XSSFRow header=sheet2.createRow(0);
	                       
	                        XSSFCell uname=header.createCell(0);
	                        uname.setCellValue("UserName");
	                       
	                        XSSFCell pwd=header.createCell(1);
	                        pwd.setCellValue("Password");
	                       
	                        XSSFCell res=header.createCell(2);
	                        res.setCellValue("Results");
	                       
	                        // No. of rows in file1
	                        int rownum =sheet1.getLastRowNum();
	                       
	                        // Reading data from file1
	                        for(int i=1;i<=rownum;i++)
	                        {
	                                    XSSFRow row1=sheet1.getRow(i);
	                                   
	                                    // first cell value
	                                    XSSFCell cell1=row1.getCell(0);
	                                    String val1= cell1.getStringCellValue();
	                                   
	                                    //second cell value
	                                    XSSFCell cell2=row1.getCell(1);
	                                    String val2=cell2.getStringCellValue();
	                                   
	                                    driver.findElement(By.name("userName")).sendKeys(val1);
	                                    driver.findElement(By.name("password")).sendKeys(val2);
	                                    driver.findElement(By.name("login")).click();
	                                   
	                                    //Writing username, password & result into file2                                                        
	                                   
	                                    XSSFRow row2=sheet2.createRow(i);
	                       
	                                    XSSFCell usercell=row2.createCell(0);
	                                    usercell.setCellValue(val1);
	                                   
	                                    XSSFCell passwordcell=row2.createCell(1);
	                                    passwordcell.setCellValue(val2);
	                                                                       
	                                    XSSFCell resultcell=row2.createCell(2);
	                                   
	                                                                                               
	                                    if(driver.getTitle().equals("Find a Flight: Mercury Tours:"))
	                                    {
	                                               
	                                                resultcell.setCellValue("User login PASSED");
	                               // System.out.println("user login PASSED");
	                                driver.navigate().back();
	                                //driver.findElement(By.linkText("Home")).click();
	                                    }
	                                   
	                                    else
	                                    {
	                                                resultcell.setCellValue("User login FAILED");
	                                        //System.out.println("User login FAILED");
	                                        driver.findElement(By.linkText("Home")).click();
	                                    }
	                                   
	                                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	                                   
	                                    }
	                                   
	                                    workbook2.write(file2);
	                                               
	            driver.close();
	            file1.close();
	            file2.close();
	           
	            }

	}


}
