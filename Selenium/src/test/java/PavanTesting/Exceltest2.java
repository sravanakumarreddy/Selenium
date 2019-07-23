package PavanTesting;

public class Exceltest2 {
    FileInputStream file=new FileInputStream("C://data2.xlsx");
    
    XSSFWorkbook workbook=new XSSFWorkbook(file);
   
    XSSFSheet sheet=workbook.getSheetAt(0);
   
    int rowcount=sheet.getLastRowNum();     // counting number of rows present in the sheet
   
    for( int i=0;i<=rowcount;i++)
               
    {
                XSSFRow row=sheet.getRow(i);
                XSSFCell cell=row.getCell(0);
                String s=cell.toString();   // for reading multiple data types from Excel sheet
                System.out.println(s);
                                       
    }

}

}



}
