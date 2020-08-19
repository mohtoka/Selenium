package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	static String url = "http://166.62.36.207/syntaxpractice/javascript-alert-box-demo.html";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement simpleAlertButton = driver.findElement(By.xpath("//button[@onclick= 'myConfirmFunction()']"));
		simpleAlertButton.click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		alert.accept();
		
		WebElement confirmationAlertButton = driver.findElement(By.xpath("//button[@class= 'btn btn-default btn-lg']"));
		confirmationAlertButton.click();
		
		Thread.sleep(3000);
		alert.dismiss();
		
		
		WebElement promptAlertButton = driver.findElement(By.xpath("//button[@onclick= 'myPromptFunction()']"));
		promptAlertButton.click();
		
		Thread.sleep(3000);
		alert.sendKeys("Hey");
		
		Thread.sleep(3000);
		alert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
