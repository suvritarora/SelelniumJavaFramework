package testNGTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumWaits {

	static WebDriver driver;
	
	public static void main(String[] args) {
		browser();
	}
	
	public static void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//It is applicable for entire sesion of the browser until the test case is quit
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//default poll time of implicit wait is 250 ms
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).click();
		driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("Automation");
		driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys(Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("abc")));
		
		driver.findElement(By.xpath("abc")).click();
	
}
}
