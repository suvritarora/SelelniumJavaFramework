package First;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sarora\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		/*// Used to define the driver along with its path
		//System.setProperty("webdriver.chrome.driver", "D:\\Scratch\\chromeDriver\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		// Initialize the browser using Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize(); */

		// Navigate to the web page
		driver.get("https://www.google.com/");
	/*	Thread.sleep(3000);
		
		// Click the in search box
		driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).click();
		Thread.sleep(5000);
		
		// Enter value in Search box
		driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("Automation");
		Thread.sleep(3000);
		
		// Press Enter keyboard button
		driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		// Click the first link
		driver.findElement(By.xpath("//h3[text()='Automation | Technology, Types, Rise, History, & Examples']")).click();
		
		// Close the Session and Browser
		driver.close();
		driver.quit(); */
	}
}
