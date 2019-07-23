package PavanTesting;

public class ExelDataDrivenTestRegistration {
	/*----------------------------------------------------------
	Data Driven Test for Flight Registration using Excel File
	----------------------------------------------------------*/
	import java.io.FileInputStream;
	import java.io.IOException;
	import org.apache.poi.xssf.usermodel.*;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class ExelDataDrivenTestRegistration {

	            public static void main(String[] args) throws IOException {

	                        WebDriver driver=new FirefoxDriver();
	                        driver.get("http://newtours.demoaut.com/");
	                       
	                        //Getting Data from EXCEL Sheet
	                       
	                        FileInputStream file = new FileInputStream("C://Registration.xlsx");  
	           
	                        //Get the workbook instance for XLS file
	                        XSSFWorkbook workbook = new XSSFWorkbook(file);
	                       
	                        //Get first sheet from the workbook
	                        XSSFSheet sheet = workbook.getSheetAt(0);
	                       
	                        //Get first row from the sheet
	                        int noOfRows = sheet.getLastRowNum();
	                       
	                        System.out.println("No. of Records in the Excel Sheet:"+ noOfRows);
	                       
	                        for(int row =1; row<= noOfRows; row++)
	                                                {
	                                                                                                                                   
	                                                XSSFRow current_row = sheet.getRow(row);
	                                               
	                                                            XSSFCell fname = current_row.getCell(0);
	                                                            String First_name = fname.getStringCellValue();
	                                                                                                                       
	                                                            //System.out.println(First_name);
	                                                           
	                                                            XSSFCell lname = current_row.getCell(1);
	                                                            String Last_name = lname.getStringCellValue();
	                                                            //System.out.println(Last_name);
	                                                           
	                                                            XSSFCell ph = current_row.getCell(2);
	                                                            String Phone = ph.getStringCellValue();
	                                                                                                                       
	                                                            XSSFCell mail = current_row.getCell(3);
	                                                            String Email = mail.getStringCellValue();
	                                                           
	                                                            XSSFCell add = current_row.getCell(4);
	                                                            String Address = add.getStringCellValue();
	                                                           
	                                                            XSSFCell city = current_row.getCell(5);
	                                                            String City = city.getStringCellValue();
	                                                           
	                                                            XSSFCell st = current_row.getCell(6);
	                                                            String State = st.getStringCellValue();
	                                                           
	                                                            XSSFCell pin = current_row.getCell(7);
	                                                            String PinCode = pin.getStringCellValue();
	                                                           
	                                                            XSSFCell ctry= current_row.getCell(8);
	                                                            String Country = ctry.getStringCellValue();
	                                                           
	                                                            XSSFCell uname = current_row.getCell(9);
	                                                            String UserName = uname.getStringCellValue();
	                                                           
	                                                            XSSFCell passwrd = current_row.getCell(10);
	                                                            String Password = passwrd.getStringCellValue();
	                                                           
	                                                           
	                                                            //Registration Process
	                                                                                                            driver.findElement(By.linkText("REGISTER")).click();
	                                                           
	                                                            // Entering Contact information
	                                                            driver.findElement(By.name("firstName")).sendKeys(First_name);                                             driver.findElement(By.name("lastName")).sendKeys(Last_name);                                                            driver.findElement(By.name("phone")).sendKeys(Phone);
	                                                            driver.findElement(By.name("userName")).sendKeys(Email); // email id
	                                                           
	                        //Entering mailing information
	                                                                                                                        driver.findElement(By.name("address1")).sendKeys(Address);
	                                    driver.findElement(By.name("address2")).sendKeys(Address);                                                    driver.findElement(By.name("city")).sendKeys(City);
	                                                            driver.findElement(By.name("state")).sendKeys(State);
	                                                            driver.findElement(By.name("postalCode")).sendKeys(PinCode);
	                                                           
	            //Country selection
	                        Select dropcountry=new Select(driver.findElement(By.name("country")));
	                                                            dropcountry.selectByVisibleText(Country);
	                                                           
	            //Entering User information
	                                                                                                                        driver.findElement(By.name("email")).sendKeys(UserName); // user name
	                                                            driver.findElement(By.name("password")).sendKeys(Password);
	                                                            driver.findElement(By.name("confirmPassword")).sendKeys(Password);
	                                               
	                        //Submitting form
	                                                                                                                        driver.findElement(By.name("register")).click();
	                                                           
	                                                                                                  if(driver.getPageSource().contains("Thank you for registering"))
	            {
	            System.out.println(" Registration Completed for  " + row+ " record");
	                                                           
	            }
	             else
	             {
	                         System.out.println(" Registration Failed for " + row+ " record");
	                          driver.close();
	             }
	                                                             
	            }
	                                   
	            System.out.println(" Data Driven Test Completed");
	                                               
	                                    driver.close();
	                                    driver.quit();
	                                               
	                                    file.close();
	                                   
	                                                }
	                                               
	                                                }         


}
