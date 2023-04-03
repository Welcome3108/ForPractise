package Selenium;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;

public class readexcel {

	public static void main(String[] args) throws Throwable {
		 
		//By using file path create a string method.
		String excelFilePath="./countries.xlsx.xls";
		
		//To read the file of excel we used Fileinput Stream.
		FileInputStream inputstream=new FileInputStream(excelFilePath);
		 
	    try (//To get the workBook from Sheet.
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream)) {
			//Once workbbok is open get the sheet
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			//OR we can also called a sheet by Index
			//XSSFSheet sheet=workbook.getSheetAt(0);
			
			//Using FOR LOOP
			
			    //To get the Last number of Rows Count.
				int rows=sheet.getLastRowNum();
				
				//To get the Last coulumn in the First Row.
			    int cols=sheet.getRow(1).getLastCellNum();
			
			    
			    for(int r=0;r<rows;r++) //It will read the Data from the Rows.
			    {
			    	XSSFRow row=sheet.getRow(r);
			    	
			    	for(int c=0;c<cols;c++) //It will read the Data from the cell/Column.
			    	{
			    		XSSFCell cell=row.getCell(c);
			    		
			    		switch(cell.getCellType())
			    		{
			    		case STRING:System.out.println(cell.getStringCellValue());break;
			    		case NUMERIC:System.out.println(cell.getNumericCellValue());break;
			    		case BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
						default:
							break;
			    		}
			    	}
			    	System.out.println();
			    }
		}
	}

}
