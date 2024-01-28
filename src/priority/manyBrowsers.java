package priority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class manyBrowsers {

	static WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void beforeTest(String browserName) {
		System.out.println("Browser name is: " +browserName);
		if(browserName.equalsIgnoreCase(browserName)){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase(browserName)) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sarora\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	}
	
	@Test
	public void mainTest() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
		System.out.println("test completed");
	}
}
