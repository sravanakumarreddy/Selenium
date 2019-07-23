package PavanTesting;

public class ExcelTest6 {
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.*;


	public class Excelwritingtest2 {

	            public static void main(String[] args) throws IOException {
	                       
	                        FileOutputStream file=new FileOutputStream("C://Test2.xlsx");
	                       
	                        XSSFWorkbook workbook=new XSSFWorkbook();
	                       
	                        XSSFSheet sheet=workbook.createSheet("Data");
	                       
	                        for(int i=0;i<=5;i++)
	                        {
	                                   
	                                    XSSFRow row=sheet.createRow(i);
	                                    XSSFCell cell=row.createCell(0);
	                                    cell.setCellValue("ABCD");
	                                   
	                        }
	                       
	                        workbook.write(file);
	                        file.close();
	                                   
	                       
	            }

	}


}
