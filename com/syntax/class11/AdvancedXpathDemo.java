package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpathDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		
		WebElement search = driver.findElement(By.xpath("//label[@id='nav-search-label']/following-sibling::input"));
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
