package testNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstTest {

	static WebDriver driver;
	static String browserName;

	@BeforeTest
	public static void tearUp() {
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			driver = new ChromeDriver();			
		}		
		else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sarora\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		} 

	}

	@Test	
	public static void mainTest() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(5000);
	}

	@AfterTest
	public static void testDown() {
		driver.quit();
		System.out.println("test case passed");
	}
}
