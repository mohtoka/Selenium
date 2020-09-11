package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement fileUpload = driver.findElement(By.linkText("File Upload"));
		fileUpload.click();
		
		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		chooseFile.sendKeys("/Users/tokamohamed/Desktop/unnamed document.pdf");
		
		WebElement uploadButton = driver.findElement(By.id("file-submit"));
		uploadButton.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
