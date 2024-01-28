package Utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDecTest {

	static WebDriver driver;
	/*public static void main(String[] args) throws IOException {
		test("D:\\Scratch\\Data\\Datasheet.xlsx", "Sheet2");
	} */
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider = "testdata")
	public void mainTest(String Username, String Password) throws InterruptedException {
		System.out.println(Username+ " | " +Password);
		driver.get("https://helm360.greythr.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//button[text()=\" Log in \"]")).click();
	}
	
/*	@Test(dataProvider="testdata1")
	public void mainTest(String Username, String Password) throws InterruptedException {
		System.out.println(Username+" | "+Password);
		driver.get("https://helm360.greythr.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//button[text()=\" Log in \"]")).click();
	} */
	
	@DataProvider(name="testdata")
	public Object[][] getData() throws IOException {
		String excelPath = "D:\\Scratch\\Data\\Datasheet.xlsx";
		String sheetName = "Sheet1";
		Object data[][]  = test(excelPath, sheetName);
		return data;
	}
	
	
	public static Object[][] test(String excelPath, String sheetName) throws IOException {
	
	ExcelDeclaration excel = new ExcelDeclaration(excelPath, sheetName);
	int rowCount = excel.getRowCount();
	int colCount = excel.getColCount();
	
	Object data[][] = new Object[rowCount-1][colCount];
	
	
	for(int i=1;i<rowCount;i++) {
		for(int j=0;j<colCount;j++) {
			
			String value = excel.getCellDataDynamic(i, j);
			System.out.println("The valus are: " +value);
			
			data[i-1][j] = value;
		}
	}
	return data;
	
	
	
	
//	System.out.println("Row Count: " +rowCount);
//	System.out.println("Column Count: " +colCount);
	}
}
