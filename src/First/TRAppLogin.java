package First;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TRAppLogin {


	public static void main(String[] args) throws Exception {
		login();
		
	}
	
	public static void login() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://3edemo1.helm360.com/TE_3E_Test1/web/ui/dashboard");
		Thread.sleep(4000);
		
		Runtime.getRuntime().exec("D:\\AutoITScripts\\3EAuthentication.exe");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button/span[contains(text(),'Restart')]")).click();
		Thread.sleep(5000);
		
		/*Runtime.getRuntime().exec("D:\\AutoITScripts\\3EAuthentication.exe");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button/span[contains(text(),'Restart')]")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\AutoITScripts\\3EAuthentication.exe"); */
		
		
		
	}
	
}
