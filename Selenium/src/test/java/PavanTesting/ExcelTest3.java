package PavanTesting;

public class ExcelTest3 {
    FileInputStream file=new FileInputStream("C://data3.xlsx");
    XSSFWorkbook workbook=new XSSFWorkbook(file);
    XSSFSheet sheet=workbook.getSheetAt(0);
   
    int rowcount=sheet.getLastRowNum();
                System.out.println(rowcount);
   
    XSSFRow row=sheet.getRow(0);
    int colcount=row.getLastCellNum();
                System.out.println(colcount);
               
    for(int i=1;i<=rowcount;i++)
    {
                XSSFRow r=sheet.getRow(i);
               
                for(int j=0;j<colcount;j++)
                {
                           
                            XSSFCell col=r.getCell(j);
                                                                                                               
                            //System.out.println(col.getCellType());
                            //String value=col.toString();
                            //System.out.println(value);
                           
                            switch (col.getCellType()) // Method will return the cell type
                            {
                           
                            case XSSFCell.CELL_TYPE_STRING:
                                        System.out.println(col.getStringCellValue());break;
                            case XSSFCell.CELL_TYPE_BOOLEAN:
                                        System.out.println(col.getBooleanCellValue());break;
                            case XSSFCell.CELL_TYPE_NUMERIC:
                                        System.out.println((int)col.getNumericCellValue());break;
                            default:System.out.println("null");
                            }
                           
                           
                }
                                                   
    }
               

}

}


}
