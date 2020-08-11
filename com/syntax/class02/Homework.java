package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
	
//	1. go to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
//	2. Fill out the sign up form
//	3. Click on register
//	4. close the browser
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("customer.firstName")).sendKeys("Toka");
		driver.findElement(By.name("customer.lastName")).sendKeys("Mohamed");
		driver.findElement(By.name("customer.address.street")).sendKeys("592 Amsterdam Ave");
		driver.findElement(By.name("customer.address.city")).sendKeys("New York");
		driver.findElement(By.name("customer.address.state")).sendKeys("New York");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("10024");
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("6469440970");
		driver.findElement(By.name("customer.ssn")).sendKeys("000000000");
		driver.findElement(By.name("customer.username")).sendKeys("mohtoka");
		driver.findElement(By.name("customer.password")).sendKeys("keenan123");
		driver.findElement(By.name("repeatedPassword")).sendKeys("keenan123");
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(10000);
		driver.quit();
	}

}
