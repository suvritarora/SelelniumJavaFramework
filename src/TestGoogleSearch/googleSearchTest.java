package TestGoogleSearch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Objects;

//import POM.Objects;

public class googleSearchTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		//S
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		
		Objects.searchBox(driver).click();
		Objects.searchBox(driver).sendKeys("Automation");
		Objects.searchBox(driver).sendKeys(Keys.ENTER);
		Objects.signInBtn(driver).click();
		
		
		/*Objects.searchBox(driver).click();

		Objects.searchBox(driver).sendKeys("automation");

		Objects.searchBox(driver).sendKeys(Keys.RETURN); */

		driver.quit();
	}
}

