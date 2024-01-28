package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects {
	
	//private static WebElement element = null;
	
	//M
	public static WebElement searchBox(WebDriver driver) {
		WebElement  element = driver.findElement(By.xpath("//textarea[@title=\"Search\"]"));
		return element;
	}
	
	//A
	public static WebElement signInBtn(WebDriver driver) {
		 WebElement element1 = driver.findElement(By.xpath("//span[text()=\"Sign in\"]"));
		 return element1;
	}
	
	public static WebElement username(WebDriver driver) {
		WebElement userName = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		return userName;
	}
	
	public static WebElement password(WebDriver driver) {
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		return password;
	}
	
	public static WebElement loginBtn(WebDriver driver) {
		WebElement loginButton = driver.findElement(By.xpath("//button[text()=\" Log in \"]"));
		return loginButton;
	}
	
	public static WebElement logOut(WebDriver driver) {
		WebElement logOutBtn = driver.findElement(By.xpath("//a[@title=\"Logout\"]//div"));
		return logOutBtn;
	}
	
}
