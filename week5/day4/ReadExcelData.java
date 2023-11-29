package week5.day4;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {
	@Test
	public void readExcelData() throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		XSSFSheet sheetAt = book.getSheetAt(0);
		
		
		  int lastRowNum = sheetAt.getLastRowNum(); System.out.println(lastRowNum);
		  
		  short lastCellNum = sheetAt.getRow(lastRowNum).getLastCellNum();
		  System.out.println(lastCellNum);
		  
		  String stringCellValue = sheetAt.getRow(2).getCell(2).getStringCellValue();
		  System.out.println(stringCellValue);
		 
	}

}
