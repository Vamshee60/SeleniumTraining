package org.vamshee.phptravelsautomation.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableWorkbook;

public class ExcelUtil {
	// Data provider should e a static class if used from another class
	@DataProvider(name = "loginData")
	public static Object[][] getLoginData() throws Exception {
		// locate the excel sheet
		Workbook wb = null;
		try {
			wb = Workbook.getWorkbook(new File(
					"C:\\personal\\gitrepos\\vamshee60\\SeleniumTraining\\phptravelsautomation\\src\\test\\resources\\data\\Data.xls"));
		} catch (Exception e) {
			throw new Exception("Data Provide rissue");
		}

		// go to a sheet
		Sheet sheet = wb.getSheet(0);
		int columnCount = sheet.getColumns();
		int rowCount = sheet.getRows();

		// create an object 2D array to hold a table of data
		Object[][] data = new Object[rowCount - 1][columnCount];

		List<String> headers = new ArrayList<String>();
		for (int rowNum = 0; rowNum < rowCount; rowNum++)
			for (int columnNum = 0; columnNum < columnCount; columnNum++) {

				// get the headers
				// headers are in first row only, and in each column
				// so we run for loop on column and keep row constant
				if (rowNum == 0) {
					String content = sheet.getCell(columnNum, rowNum).getContents();
					System.out.println("Cell [" + columnNum + "," + 0 + "] Contents : " + content);
					headers.add(content);
				} else {
					data[rowNum - 1][columnNum] = sheet.getCell(columnNum, rowNum).getContents();
					System.out.println("Cell [" + columnNum + "," + 0 + "] Contents : " + data[rowNum - 1][columnNum]);

				}
			}

		return data;

	}

	public static void main(String[] args) throws Exception {
		ExcelUtil excelUtil = new ExcelUtil();
		Object[][] data = excelUtil.getLoginData();

		for (int i = 0; i < data.length; i++)
			for (int j = 0; i < data[i].length; i++)

				System.out.print(data[i][j] + "\n");
	}
}
