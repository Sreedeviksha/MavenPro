package com.test.concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void main(String[] args) throws IOException {						//.xls
		File f = new File("C:\\Workspace\\eclipse-workspace_Demo\\MavenPro\\Credentials.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis); //HSSF
		Sheet sheetAt = wb.getSheetAt(0);
		
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row = sheetAt.getRow(i);
			
			int cellsize = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellsize; j++) {
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}else if (cellType.equals(CellType.NUMERIC)) {
					double d = cell.getNumericCellValue();
					long value = (long) d;
					String valueOf = String.valueOf(value);
					System.out.println(valueOf);
				}
				
				Cell createCell = wb.getSheetAt(0).createRow(6).createCell(4);
				createCell.setCellValue("Datas");
				
				FileOutputStream fos = new FileOutputStream(f);
				wb.write(fos);
				wb.close();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}
		
	}

}
