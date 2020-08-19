package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTask {
	
	static String url = "http://166.62.36.207/syntaxpractice/bootstrap-iframe.html";
	
	public static void main(String[] arg) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.switchTo().frame(0);
		
		WebElement iframeLogo = driver.findElement(By.xpath("//img[@id= 'hide']"));
		boolean isLogoDisplayed = iframeLogo.isDisplayed();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		
		WebElement enrollButton = driver.findElement(By.xpath("//a[@class= 'enroll-btn']"));
		boolean isButtonEnabled = enrollButton.isEnabled();
		
		System.out.println("Is Logo Displayed: " + isLogoDisplayed + ", and Is Button Enabled: " + isButtonEnabled);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
