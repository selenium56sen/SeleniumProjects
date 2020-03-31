package com.cts.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public static String[][] getData(String fileName, String sheetName) throws IOException {
	
		fis = new FileInputStream(fileName);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Row Count: " + rowCount);
		
		XSSFRow row = sheet.getRow(0);
		int cellCount = row.getPhysicalNumberOfCells();
		System.out.println("Cell Count: " + cellCount);
		
		String[][] data = new String[rowCount-1][cellCount];
		
		DataFormatter format = new DataFormatter();
		
		for(int i=1; i< rowCount; i++) {
			for(int j=0; j<cellCount; j++) {
				XSSFCell cell = sheet.getRow(i).getCell(j);
				String cellValue = format.formatCellValue(cell);
				System.out.println("Cell Value: " + cellValue);
				data[i-1][j] = cellValue;
			}
		}
		return data;
	}
}
