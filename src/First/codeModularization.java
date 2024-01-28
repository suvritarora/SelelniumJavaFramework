package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class codeModularization {

	static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		setBrowser();
		setBrowserConfiguration();
		runTests();
	}

	//setBrowser
	//setBrowserConfiguration
	//runTests

	public static void setBrowser() {
		//this browser is the variable but the other methods can't see it, so to make it available for other methods; we would define this variable at the class level and make it static so that it becomes fixed and all the other classes/programs can use it.
		//String browser = "Chrome";
		//now this browser has become the class variable
		browser = "Chrome"; 
	}

	public static void setBrowserConfiguration() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		driver = new ChromeDriver();
	}

	public static void runTests() {
		driver.get("https://www.google.com/");
		driver.quit();
	}
}