package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
	
//	HRMS Application Negative Login:
//	Open chrome browser
//	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//	Enter valid username
//	Leave password field empty
//	Verify error message with text “Password cannot be empty” is displayed.

	static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	static String username = "Admin";
	static String password = "";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement usernameTextBox = driver.findElement(By.xpath("//input[@id= 'txtUsername']"));
		WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id ='txtPassword']"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@id= 'btnLogin']"));
		
		usernameTextBox.sendKeys(username);
		loginButton.click();
		
		String passwordCanntBeEmptyErrorText = driver.findElement(By.xpath("//span[@id= 'spanMessage']")).getText();
		
		System.out.println(passwordCanntBeEmptyErrorText);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
