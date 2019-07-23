package ApachePOIandPropertyfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcelFile 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Start");
		File file = new File("src/demo1/Demo1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		sh.createRow(2).createCell(2).setCellValue("Testing");
		sh.createRow(8).createCell(4).setCellValue("Testing-8_4");
		
		FileOutputStream fot = new FileOutputStream(file);
		wb.write(fot);
		System.out.println("END");
		
		
	}

	
}
