package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertiesFile {
	
	static WebDriver driver;
	static Properties prop;
	
	public static void main(String[] args) throws IOException {
		getProperties();
		setProperty();
	}

	public static void getProperties() throws IOException {
		prop = new Properties();
		InputStream input = new FileInputStream("D:\\Scratch\\src\\config\\config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		System.out.println("Browser selected is: " +browser);
		System.out.println("URL selected is: " +url);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarora\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static void setProperty() throws IOException{
		FileOutputStream output = new FileOutputStream("D:\\Scratch\\src\\config\\config.properties");
		prop.setProperty("browser", "Firefox");
		String browser = prop.getProperty("browser");
		prop.store(output, null);
		System.out.println("The Browser written is: " +browser);
	}
	

}
