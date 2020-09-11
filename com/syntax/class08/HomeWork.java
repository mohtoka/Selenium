package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeWork {

	static String url = "https://the-internet.herokuapp.com/dynamic_controls";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type= 'checkbox']"));
		WebElement button = driver.findElement(By.xpath("//button[text()= 'Remove']"));
		checkbox.click();
		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id= 'message']")));
		
		WebElement goneText = driver.findElement(By.xpath("//p[@id= 'message']"));
		System.out.println(goneText.getText());
	
		WebElement textBox = driver.findElement(By.xpath("//input[@type= 'text']"));
		boolean isTextBoxEnabled = textBox.isEnabled();
		System.out.println(" Is text box enabled?: " + isTextBoxEnabled);
	
		WebElement enableButton = driver.findElement(By.xpath("//button[text()= 'Enable']"));
		enableButton.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()= 'It's enabled!']")));
		
		if(textBox.isEnabled()) {
		textBox.sendKeys("Hello World!");
		}
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
