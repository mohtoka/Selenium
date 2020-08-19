package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	
	static String url = "http://www.uitestpractice.com/Students/Switchto";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement simpleAlertButton = driver.findElement((By.id("alert")));
		simpleAlertButton.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		//simple alert
		alert.accept();
		
		Thread.sleep(2000);
		
		WebElement confirmationAlertButton = driver.findElement(By.id("confirm"));
		confirmationAlertButton.click();
		
		Thread.sleep(5000);
		
//		Alert confirmationAlert = driver.switchTo().alert();				*only need to create instance
//		confirmationAlert.dismiss();										of interface once
		
		
		String confirmAlertText = alert.getText();
		System.out.println(confirmAlertText);
		//confirmation alert
		alert.dismiss();
		
		Thread.sleep(2000);
		
		WebElement promptAlertButton = driver.findElement(By.id("prompt"));
		promptAlertButton.click();
		Thread.sleep(3000);
		
		alert.sendKeys("Syntax");
		Thread.sleep(2000);
		//prompt alert
		alert.accept();
		
		
		String s = driver.findElement(By.xpath("//div[@id= 'demo']")).getText();
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
