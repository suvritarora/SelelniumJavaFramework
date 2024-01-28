package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modularization {

	static WebDriver driver;
	
	public static void main(String[] args) {	
		selectBrowser();
		openBrowser();
		performActions();
		closeBrowser();
		System.out.println("Jeet Gaye");
	}
	
	
	// We need to select the browser first
	// Initialize the browser
	// Get the URLs, Perform Actions
	// Close the browser
	
	public static void selectBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	}
	
	public static void openBrowser() {
		driver = new ChromeDriver();
	}
	
	public static void performActions() {
		driver.get("https://www.google.com/");
		//xyz actions to perform here
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
}
