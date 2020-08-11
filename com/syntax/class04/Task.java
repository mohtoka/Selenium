package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
//	Open chrome browser
//	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//	Enter valid username and password (username - Admin, password - Hum@nhrm123)
//	Click on login button
//	Then verify Syntax Logo is displayed.
	
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static String username = "Admin";
	public static String password = "Hum@nhrm123";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		WebElement usernameBox = driver.findElement(By.xpath("//input[@id= 'txtUsername']"));
		WebElement passwordBox = driver.findElement(By.xpath("//input[@id= 'txtPassword']"));
		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password);
		
		Thread.sleep(1000);
		WebElement loginButton = driver.findElement(By.xpath("//input[@id= 'btnLogin']"));
		loginButton.click();
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt= 'OrangeHRM']"));
		if(logo.isDisplayed()) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("Logo is NOT displayed");
		}
			
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
