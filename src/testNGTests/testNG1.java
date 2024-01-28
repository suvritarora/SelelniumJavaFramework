package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class testNG1 {

	static WebDriver driver;
	static String title;
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	static ExtentTest test;
	static ExtentTest test1;
	
	@BeforeTest
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	/*	extent = new ExtentReports();
		spark = new ExtentSparkReporter("Report.html");
		extent.attachReporter(spark); */
	}
	
	@Test
	public static void runTest() {
		driver.get("https://www.tutorialspoint.com/index.htm");
		/*title = driver.getTitle();
		driver.findElement(By.xpath("//a[text()=\"Java\" or @title=\"Java Tutorial\"]")).click();	
		test = extent.createTest("Navigate to TutorialsPoint.com"); */
	}
	
	@Test
	public static void openSpotifyWebPlayer() {
		driver.get("https://open.spotify.com/");
		/*test = extent.createTest("Navigate to Spotify.com");
		
		driver.findElement(By.xpath("//*[text()=\"Search\"]")).click();
		test1 = extent.createTest("User is able to click the search button"); */
	}
	
	@AfterTest
	public static void closeBrowserAndSession() {
	//	System.out.println("The title is: " +title);
		driver.close();
		driver.quit();
		/*System.out.println("The test case is passed");
		test.log(Status.PASS, "User is able to launch the website");
		test.pass("Done");
		
		test1.log(Status.PASS, "User is able to click the Search button");
		test1.pass("Done");
		
		extent.flush(); */
	}	
}
