package PavanTesting;

public class ExcelTest7 {
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.*;
	public class Excelwritingmultiplerowsandcolumns {

	            public static void main(String[] args) throws IOException {
	                       
	                        FileOutputStream file=new FileOutputStream("C://Test3.xlsx");
	                       
	                        XSSFWorkbook workbook=new XSSFWorkbook();
	                       
	                        XSSFSheet sheet=workbook.createSheet("Data");
	                       
	                       
	                        for(int i=0;i<=5;i++)
	                        {
	                                    XSSFRow row=sheet.createRow(i);
	                                   
	                                    for(int j=0;j<=3;j++)
	                                    {
	                                                XSSFCell cell=row.createCell(j);
	                                                cell.setCellValue("ADASDA");
	                                    }
	                                               
	                        }
	                                   
	                        workbook.write(file);
	                        file.close();
	                       
	            }

	}


}
