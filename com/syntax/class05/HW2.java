package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
	
	static String url = "http://ebay.com";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		List<WebElement> headers = driver.findElements(By.xpath("//li[@class= 'hl-cat-nav__js-tab']"));
		System.out.println("Headers size: " + headers.size());
		
		for(WebElement header : headers) {
			String headerText = header.getText();
			System.out.println(headerText);
		}
		
		WebElement allCategories = driver.findElement(By.xpath("//select[@name= '_sacat']"));
		Select select = new Select(allCategories);
		
		List<WebElement> selectAllCategories = select.getOptions();
		
		for(WebElement selectAll : selectAllCategories) {
			String selectAllText = selectAll.getText();
			if(selectAllText.equals("Computers/Tablets & Networking")) {
				select.selectByVisibleText(selectAllText);
			}
		}
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@value= 'Search']"));
		searchButton.click();
		
		String headerTextExpected = "Computers, Tablets & Network Hardware";
		String headerTextActual = driver.findElement(By.xpath("//span[@class= 'b-pageheader__text']")).getText();
		
		if(headerTextExpected.equals(headerTextActual)) {
			System.out.println("Header texts are equal: " + headerTextActual);
		}else {
			System.out.println("Header texts are NOT equal");
			System.out.println("Expected header text: " + headerTextExpected);
			System.out.println("Actual header text: " + headerTextActual);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
