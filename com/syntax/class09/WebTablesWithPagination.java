package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesWithPagination {
	
	static String url = "http://166.62.36.207/syntaxpractice/table-pagination-demo.html";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class= 'table table-hover']/tbody/tr"));
		WebElement next = driver.findElement(By.xpath("//a[@class= 'next_link']"));
		boolean flag= true;
		while(flag) {
			for(WebElement row :rows) {
				String rowText= row.getText();
				if(rowText.contains("Archy J")) {
					flag = false;
					System.out.println(rowText);
					break;
				}
			}
			next.click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
