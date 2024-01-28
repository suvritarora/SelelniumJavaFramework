package First;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessChrome {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).click();
		driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("Automation");
		driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys(Keys.ENTER);
		driver.quit();
		System.out.println("Completed");
	}
	
}
