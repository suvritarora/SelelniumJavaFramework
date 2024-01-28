package config;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class madhav {
	
	static Properties prop;
	static String browser;
	static String url;
	static String id;
	static String password;
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException{
		getProperties();
		openBrowser();
		setProperty();
		closeBrowser();
		
		getProperties();
		openBrowser();
		closeBrowser();
		
	}
		public static void getProperties() throws IOException{
		prop = new Properties();
		InputStream input = new FileInputStream("D:\\Scratch\\src\\config\\madhavconfig.properties");
		prop.load(input);
		browser = prop.getProperty("browser");
		url = prop.getProperty("url");
		id = prop.getProperty("id");
		password = prop.getProperty("password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(id);
		System.out.println(password);
		}
		
		public static void openBrowser() throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			//driver = new ChromeDriver();
			
			if(browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				driver = new ChromeDriver();			
			}		
			else if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\sarora\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			driver.get(url);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(id);
			driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
			driver.findElement(By.xpath("//button[text()=\" Log in \"]")).click();
		}
		
		public static void setProperty() throws IOException{
			FileOutputStream output = new FileOutputStream("D:\\Scratch\\src\\config\\madhavconfig.properties");
			prop.setProperty("browser", "Firefox");
			String browser = prop.getProperty("browser");
			prop.store(output, null);
			System.out.println("The Browser written is: " +browser);
		}
		
		public static void closeBrowser() {
			driver.quit();
			System.out.println("Pass");
		}
		
		
		
		
		
		
		/*Properties prop = new Properties();

		InputStream input = new FileInputStream("D:\\Scratch\\src\\config\\config.properties");

		prop.load(input);

		String browser = prop.getProperty("browser");

		String url = prop.getProperty("url"); */
	}
