package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public excelUtils(String excelPath, String sheetName) throws Exception {
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
	}
	
	public static void main(String[] args) throws Exception {
		getRowCount();
		getColCount();
		getCellData();
		getNumericCellValue();
		getCellData(0, 0);
	}
	
	public static int getRowCount() throws IOException {
	workbook = new XSSFWorkbook("D:\\Scratch\\Data\\Datasheet.xlsx");
	sheet = workbook.getSheet("Sheet1");
	int rowCount = sheet.getPhysicalNumberOfRows();
	System.out.println("The total no of rows are: " +rowCount);
	return rowCount;
	}
	
	public static int getColCount() throws IOException {
		workbook = new XSSFWorkbook("D:\\Scratch\\Data\\Datasheet.xlsx");
		sheet = workbook.getSheet("Sheet1");
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("The total no of rows are: " +colCount);
		return colCount;
		}
	
	public static void getCellData() throws Exception {
		workbook = new XSSFWorkbook("D:\\Scratch\\Data\\Datasheet.xlsx");
		sheet = workbook.getSheet("Sheet1");
		String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellData);
	}
	
	public static void getNumericCellValue() throws Exception {
		workbook = new XSSFWorkbook("D:\\Scratch\\Data\\Datasheet.xlsx");
		sheet = workbook.getSheet("Sheet1");
		String cellData1 = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(cellData1);
		
	} 
	
	public static void getCellData(int rowNum, int columnNum) throws Exception {
		workbook = new XSSFWorkbook("D:\\Scratch\\Data\\Datasheet.xlsx");
		sheet = workbook.getSheet("Sheet1");
		String cellData = sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
		System.out.println(cellData);
	} 
	
	public static String getCellData1(int rowNum, int columnNum) throws Exception {
		String cellData = sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
		//System.out.println(cellData);
		return cellData;
	}
	
	
	
	
}
