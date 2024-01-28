package Utils;

public class excelTest {
	
	public static void main(String[] args) throws Exception {
	
		excelUtils excelUtils = new excelUtils("D:\\Scratch\\Data\\Datasheet.xlsx", "Sheet1");
		excelUtils.getCellData1(1, 0);
	}
}
