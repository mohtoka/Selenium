package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {
	
public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		WebElement usernameTextBox = driver.findElement(By.name("ctl00$MainContent$username"));
		usernameTextBox.sendKeys("Tester");
		WebElement passwordTextBox = driver.findElement(By.name("ctl00$MainContent$password"));
		passwordTextBox.sendKeys("test");
		
		Thread.sleep(5000);
		
//		usernameTextBox.clear();
//		passwordTextBox.clear();
		
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		
		WebElement logo = driver.findElement(By.xpath("//h1[text() = 'Web Orders']"));
		
		if(logo.isDisplayed()) {
			String logoText = logo.getText();
			if(logoText.equals("Web Orders")) {
				System.out.println("This is the right logo");
			}else {
				System.out.println("This is the wrong logo");
			}
		}
		
		
		
		
		
		
		
		
		
		//
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
