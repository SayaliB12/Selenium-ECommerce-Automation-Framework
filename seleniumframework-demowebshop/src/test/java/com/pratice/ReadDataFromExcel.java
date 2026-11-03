package com.pratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//*step 1 create the object of file class and handle(java.io)
		//and handle  File Not FoundException
		
		File file =new File("C:\\Users\\banga\\OneDrive\\Documents\\excel data test.xlsx");
		
		//step 2 create the object of FileInputStream(java.io)
		//handle  FileNotFoundException
		
		FileInputStream fis =new FileInputStream(file);
		
		//step 3 create the object of XSSFWORKBOOK class (From Apache poi)
		//help to open a workbook in a Excel file
		
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		
		//call getsheet(String sheetName)To navigate into a particular sheet
		
		XSSFSheet sheet = workbook.getSheet("UserDetail");
		//call getrow (int rowNum )to navigate into a row of specific no
		XSSFRow firstRow = sheet.getRow(0);
		XSSFRow secondRow = sheet.getRow(1);
		
		//call getCall(int cellNum) to navigate into a specific cell of the row
		XSSFCell firstCell = firstRow.getCell(0);
		
		//converting the object to string 
		String firstCellData = firstCell.getStringCellValue();
		 String secondCellData = firstRow.getCell(1).getStringCellValue();
		 String thirdCellData = firstRow.getCell(2).getStringCellValue();
		 String fourthCellData = firstRow.getCell(3).getStringCellValue();
		
		
		 String firstCellData1 = secondRow.getCell(0).toString();
		 String secondCellData1 = secondRow.getCell(1).getStringCellValue();
		 String thirdCellData1 = secondRow.getCell(2).toString();
		 String fourthCellData1 = secondRow.getCell(3).getStringCellValue();
		 
				
				 //printing the data
		System.out.println( firstCellData);
		System.out.println( "-->"+firstCellData1);
		
		System.out.println( secondCellData);
		System.out.println( "-->"+secondCellData1);
		
		System.out.println(thirdCellData);
		System.out.println( "-->"+thirdCellData1);
		
		System.out.println( fourthCellData);
		System.out.println( "-->"+fourthCellData1);
		
		workbook.close();
		
		
		
		

	}

}
