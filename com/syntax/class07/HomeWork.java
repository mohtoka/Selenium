package com.syntax.class07;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
	
/*Verify the title is displayed
Print out the title of the main page	
*/
	static String url = "https://demoqa.com/browser-windows";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		String mainWindowHandle = driver.getWindowHandle();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement newTabButton = driver.findElement(By.id("tabButton"));
		WebElement newWindowButton = driver.findElement(By.id("windowButton"));
		WebElement newWindowMessageButton = driver.findElement(By.id("messageWindowButton"));
//
		newTabButton.click();
		Set<String> allTabHandles = driver.getWindowHandles();
		for(String tab: allTabHandles) {
			driver.switchTo().window(tab);
		}
		String newTabText = driver.findElement(By.xpath("//h1[@id= 'sampleHeading']")).getText();
		System.out.println(newTabText);
		driver.close();
		driver.switchTo().window(mainWindowHandle);
//
		newWindowButton.click();
		Set<String> newWindowSet = driver.getWindowHandles();
		for(String window: newWindowSet) {
			driver.switchTo().window(window);
		}
		String newWindowText = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(newWindowText);
		driver.close();
		driver.switchTo().window(mainWindowHandle);
//
		newWindowMessageButton.click();
		Set<String> allWindowMessageHandles = driver.getWindowHandles();
		for(String windowmessage: allWindowMessageHandles) {
			driver.switchTo().window(windowmessage);
		}
//		String newWindowMessageText = driver.findElement(By.xpath("/html/body")).getText();
//		System.out.println(newWindowMessageText);
		driver.close();
		driver.switchTo().window(mainWindowHandle);
		
		WebElement header = driver.findElement(By.xpath("//div[@class = 'main-header']"));
		boolean isHeaderDisplayed = header.isDisplayed();
		String headerText = header.getText();
		
		System.out.println("is header displayed?: " + isHeaderDisplayed + ", : " + headerText);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
