package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
	
	public static void main(String[] args) throws InterruptedException {
		
		String firstName, lastName, email, phone, address, city, zip, comment, website;
		firstName = "Toka";
		lastName = "Mohamed";
		email = "mohamedtokaa@gmail.com";
		phone = "1234567890";
		address = "123 Broadway";
		city = "New York";
		zip = "10024";
		comment = "..........";
		website = "website.com";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver usingXpath = new ChromeDriver();
		
		usingXpath.get("http://166.62.36.207/syntaxpractice/index.html");
		usingXpath.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
		
		Thread.sleep(2000);
		usingXpath.findElement(By.xpath("//a[@id = 'btn_inter_example']")).click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		usingXpath.findElement(By.xpath("//a[text()='Input Form with Validations']")).click();
		Thread.sleep(2000);
		
		usingXpath.findElement(By.xpath("//input[@name = 'first_name']")).sendKeys(firstName);
		usingXpath.findElement(By.xpath("//input[@name = 'last_name']")).sendKeys(lastName);
		usingXpath.findElement(By.xpath("//input[@name = 'email']")).sendKeys(email);
		usingXpath.findElement(By.xpath("//input[@name = 'phone']")).sendKeys(phone);
		usingXpath.findElement(By.xpath("//input[@name = 'address']")).sendKeys(address);
		usingXpath.findElement(By.xpath("//input[@name = 'phone']")).sendKeys(lastName);
		usingXpath.findElement(By.xpath("//input[@name = 'city']")).sendKeys(city);
		usingXpath.findElement(By.xpath("//input[@name = 'zip']")).sendKeys(zip);
		usingXpath.findElement(By.xpath("//textarea[@name = 'comment']")).sendKeys(comment);
		usingXpath.findElement(By.xpath("//input[@name = 'website']")).sendKeys(website);
		
		Thread.sleep(10000);
		
		usingXpath.findElement(By.xpath("//button[@class = 'btn btn-default']")).click();
		
		Thread.sleep(3000);
		
		usingXpath.close();
		
//
//		
		
		WebDriver usingCSSSelector = new ChromeDriver();
		
		usingCSSSelector.get("http://166.62.36.207/syntaxpractice/index.html");
		usingCSSSelector.findElement(By.cssSelector("a#btn_basic_example")).click();
		
		Thread.sleep(2000);
		usingCSSSelector.findElement(By.xpath("//a[@id = 'btn_inter_example']")).click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		usingCSSSelector.findElement(By.xpath("//a[text()='Input Form with Validations']")).click();
		Thread.sleep(2000);
		
		usingCSSSelector.findElement(By.cssSelector("input[name = 'first_name']")).sendKeys(firstName);
		usingCSSSelector.findElement(By.cssSelector("input[name = 'last_name']")).sendKeys(lastName);
		usingCSSSelector.findElement(By.cssSelector("input[name = 'email']")).sendKeys(email);
		usingCSSSelector.findElement(By.cssSelector("input[name = 'phone']")).sendKeys(phone);
		usingCSSSelector.findElement(By.cssSelector("input[name = 'address']")).sendKeys(address);
		usingCSSSelector.findElement(By.cssSelector("input[name = 'phone']")).sendKeys(lastName);
		usingCSSSelector.findElement(By.cssSelector("input[name = 'city']")).sendKeys(city);
		usingCSSSelector.findElement(By.cssSelector("input[name = 'zip']")).sendKeys(zip);
		usingCSSSelector.findElement(By.cssSelector("textarea[name = 'comment']")).sendKeys(comment);
		usingCSSSelector.findElement(By.cssSelector("input[name = 'website']")).sendKeys(website);
		
		Thread.sleep(10000);
		
		usingCSSSelector.findElement(By.cssSelector("button#btn btn-default")).click();
		
		Thread.sleep(3000);
		
		usingCSSSelector.close();
		
	}

}
