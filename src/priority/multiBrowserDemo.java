package priority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multiBrowserDemo {

	static WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		System.out.println("Browser name is: " +browserName);
		//System.out.println("Thread id is: " +Thread.currentThread().getId());
		
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
	public void test() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@AfterTest
	public void close() {
		
		System.out.println("test completed");
	}
}
