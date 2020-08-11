package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		
		//driver.navigate().to("http://facebook.com");
		
		//driver.navigate().back();
		//driver.navigate().forward();
		
		//driver.manage().window().fullscreen();
		
		//driver.close();
		driver.navigate().refresh();
		driver.quit();
		
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		
	}

}
