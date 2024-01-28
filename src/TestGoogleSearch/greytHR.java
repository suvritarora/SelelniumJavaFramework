package TestGoogleSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Objects;

public class greytHR {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		loginToGreytHR();
	}

	public static void loginToGreytHR() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://helm360.greythr.com/");
		Thread.sleep(5000);
		Objects.username(driver).click();
		Thread.sleep(2000);
		Objects.username(driver).clear();
		Objects.username(driver).sendKeys("HN652");
		Objects.password(driver).click();
		Objects.password(driver).clear();
		Objects.password(driver).sendKeys("Goldenfiss@007");
		Objects.loginBtn(driver).click();
		Thread.sleep(5000);
		Objects.logOut(driver).click();
		driver.quit();
	}
}
