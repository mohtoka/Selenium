package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	
	static String url = "http://www.uitestpractice.com/Students/Switchto";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//by index
		driver.switchTo().frame(0);
		
		WebElement textBox = driver.findElement(By.id("name"));
		
		textBox.sendKeys("Batch 7");
		
		driver.switchTo().defaultContent();
		
		WebElement clickOnLinkText = driver.findElement(By.xpath("//h3[text()= 'click on the below link: ']"));
		
		String text = clickOnLinkText.getText();
		System.out.println(text);
		
		//by name/id
		driver.switchTo().frame("iframe_a");
		textBox.clear();
		textBox.sendKeys("Syntax");
		
		driver.switchTo().defaultContent();
		
		//by webelement
		WebElement iframe = driver.findElement(By.xpath("//iframe[@src= '/Demo.html']"));
		driver.switchTo().frame(iframe);
		textBox.clear();
		textBox.sendKeys("Wassup");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
