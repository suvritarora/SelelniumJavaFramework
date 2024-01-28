package First;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DekhoYT 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);

		driver.manage().window().maximize();
		Thread.sleep(1000);

		System.out.println("Dekhlo Video");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='search_query' and @placeholder='Search']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='search_query' and @placeholder='Search']")).sendKeys("Arijit Singh Songs");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@aria-label='Search' and @id='search-icon-legacy']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//yt-formatted-string[text()='Best Of Arijit Singh Romantic Songs /#arijitsingh #romanticsongs #bestofbest Arijit Singh All Song']")).click();
		Thread.sleep(15000);

		System.out.println("Asha hai aapko acha laga hoga Arijit ka gaana sunke!");
		Thread.sleep(1000);

		driver.close();

		driver.quit();
	}

}
