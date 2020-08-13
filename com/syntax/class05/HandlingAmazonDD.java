package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingAmazonDD {
	
	static String url = "http://amazon.com";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
		
		Select select = new Select(categoriesDD);
		
		List<WebElement> options = select.getOptions();
		
		int size = options.size();
		System.out.println(size);
		
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		
		select.selectByValue("search-alias=alexa-skills");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}
	

}
