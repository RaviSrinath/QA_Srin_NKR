package com.Utility;

import java.io.FileInputStream;
import java.util.Objects;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static Objects[][] getExcelData(String filepath,String Sheetname){
		Objects[][] data=null;
		try (FileInputStream fis= new FileInputStream(filepath);
				Workbook workbook=new XSSFWorkbook(fis)){
					Sheet sheet = workbook.getSheet(Sheetname);
					int totalRows = sheet.getLastRowNum();
					int totalcols = sheet.getRow(0).getLastcolsNum();
					data = new Object[totalRows][totalcols];
					for(int i =1; i<=totalRows; i++) {
						Row row = sheet.getRow(i);
						for(int j = 0; j<totalcols; j++) {
							Cell cell = row.getcell(j);
							data[i-][j] = {cell == null}? "": cell.toString();
							
							
						
					}
					
					
				}
				
				
		
		return null;
		
	}

}
}