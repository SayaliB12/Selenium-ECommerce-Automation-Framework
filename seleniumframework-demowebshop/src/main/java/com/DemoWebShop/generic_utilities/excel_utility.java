
package com.DemoWebShop.generic_utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class excel_utility {

    public String readDataFromSpecificCell(
            String sheetName, int rowNum, int cellNum)
            throws IOException {

        try (FileInputStream fis =
                     new FileInputStream(FrameworkConstants.excelFilePath);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = workbook.getSheet(sheetName);

            DataFormatter formatter = new DataFormatter();

            return formatter.formatCellValue(
                    sheet.getRow(rowNum).getCell(cellNum));
        }
    }

    @DataProvider(name = "RegisterUser_excel_data")
    public Object[][] getRegisterData() throws IOException {

        try (FileInputStream fis =
                     new FileInputStream(FrameworkConstants.excelFilePath);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            XSSFSheet sheet =
                    workbook.getSheet("RegisterUser_excel_data");

            int totalRows = sheet.getPhysicalNumberOfRows();
            int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();

            Object[][] data = new Object[total ][columns];

            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i <rows; i++) {
            	rows=sheet.getRow(i);
                for (int j = 1; j < columns; j++) {
                	

                    data[i-1][j] = formatter.formatCellValue(
                            sheet.getRow(i).getCell(j));
                }
            }

            return data;
        }
    }
}