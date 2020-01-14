package PavanTesting;

import java.io.FileInputStream;
import java.sql.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltest1 {
    FileInputStream file=new FileInputStream("C://data1.xlsx"); // creating file object
    
    XSSFWorkbook workbook=new XSSFWorkbook(file);   // creating workbook object
   
    XSSFSheet sheet=workbook.getSheetAt(0);   // creating sheet object
   
    XSSFRow row=sheet.getRow(0);  // creating row object
   
    // focussing on cells/columns
    XSSFCell cella1=row.getCell(0);     
    XSSFCell cellb1=row.getCell(1);
    XSSFCell cellc1=row.getCell(2);
    XSSFCell celld1=row.getCell(3);
    XSSFCell celle1=row.getCell(4);
   
    //Extracting data from cells
    double a=cella1.getNumericCellValue();
    int b= (int)cellb1.getNumericCellValue();
    String c=cellc1.getStringCellValue();
    Date d=celld1.getDateCellValue();
    Boolean e=celle1.getBooleanCellValue();
   
   
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
   
}


}
