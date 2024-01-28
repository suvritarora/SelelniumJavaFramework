package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDeclaration {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static String excelPath;
	static String sheetName;
	
	public ExcelDeclaration(String excelPath, String sheetName) throws IOException {
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
	}
	
	public static void main(String[] args) throws IOException {
		getRowCount();
		getColCount();
		getCellData();
		getCellDataDynamic(4, 1);
	}

	public static int getRowCount() throws IOException {
	int rowCount = sheet.getPhysicalNumberOfRows();
	//System.out.println("Total no of rows are: " +rowCount);
	return rowCount;
	}
	
	public static int getColCount() throws IOException {
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println("The total no of columns are: " +colCount);
		return colCount;
	}
	
	public static void getCellData() throws IOException {
		workbook = new XSSFWorkbook("D:\\Scratch\\Data\\Datasheet.xlsx");
		sheet = workbook.getSheet("Sheet1");
		String cellValue = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println("The username is: " +cellValue);
	}
	
	public static String getCellDataDynamic(int rowNum, int colNum) throws IOException {
		String cellDataDynamic = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println(cellDataDynamic);
		return cellDataDynamic;
	}
}
