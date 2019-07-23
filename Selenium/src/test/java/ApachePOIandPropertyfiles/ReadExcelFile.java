package Training.src.ApachePOIandPropertyfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile 
{
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException 
	{
		
		File file = new File("src/demo1/Demo1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		XSSFRow row = sh.getRow(1);
		XSSFCell cell = row.getCell(0);
		
		String fName = cell.getStringCellValue();
		System.out.println("fNmae:- "+ fName);
		
		String lastName = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println("lastName:- "+ lastName);
		
		
//Workbook wb1 = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Sheet1");
//		System.out.println("Val:- "+sh.getRow(1).getCell(1).getStringCellValue());
		
		

//		driver.findElement(By.xpath("username xpath")).sendKeys(fName);
//		driver.findElement(By.xpath("username xpath")).sendKeys(lastName);
//		driver.findElement(By.xpath("username xpath")).sendKeys("Tony@gmail.com");
		
		
	}
}
