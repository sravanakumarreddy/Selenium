package PavanTesting;

public class ExcelTest5 {
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.*;

	// How to write a single row into Excel
	public class Excelwritingtest1 {

	            public static void main(String[] args) throws IOException {
	                       
	                        FileOutputStream file=new FileOutputStream("C://Test1.xlsx");
	                       
	                        XSSFWorkbook workbook=new XSSFWorkbook();
	                        XSSFSheet sheet=workbook.createSheet("FirstSheet");
	                       
	                        XSSFRow row=sheet.createRow(0);
	                       
	                        XSSFCell cell0=row.createCell(0);
	                                    cell0.setCellValue("abcd");
	                                   
	                        XSSFCell cell1=row.createCell(1);
	                                    cell1.setCellValue("XYZ");       
	                                   
	                        XSSFCell cell2=row.createCell(2);
	                                    cell2.setCellValue(12345);                 
	                                   
	                        XSSFCell cell3=row.createCell(3);
	                                    cell3.setCellValue(true);
	                       
	                        workbook.write(file);
	                                   
	            }

	}


}
