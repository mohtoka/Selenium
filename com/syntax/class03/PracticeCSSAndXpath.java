package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCSSAndXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		String enterValue, sum1, sum2;
		enterValue = "Hello, this is test value";
		sum1 = "1000";
		sum2 = "111";
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver usingXPath = new ChromeDriver();
		
		usingXPath.get("http://166.62.36.207/syntaxpractice/index.html");
		usingXPath.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
		
		Thread.sleep(2000);
		usingXPath.findElement(By.xpath("(//a[text()='Simple Form Demo'])[3]")).click();
		Thread.sleep(2000);
		
		usingXPath.findElement(By.xpath("//input[@id ='user-message']")).sendKeys(enterValue);
		usingXPath.findElement(By.xpath("//button[text() ='Show Message']")).click();
		
		usingXPath.findElement(By.xpath("//input[@id = 'sum1']")).sendKeys(sum1);
		usingXPath.findElement(By.xpath("//input[@id = 'sum2']")).sendKeys(sum2);
		usingXPath.findElement(By.xpath("//button[text()= 'Get Total']")).click();
		
		Thread.sleep(3000);
		
		usingXPath.close();
//
//		
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://166.62.36.207/syntaxpractice/index.html");
		driver2.findElement(By.cssSelector("a[id='btn_basic_example']")).click();
		
		Thread.sleep(2000);
		driver2.findElement(By.xpath("(//a[text()='Simple Form Demo'])[3]")).click();
		Thread.sleep(2000);
		
		driver2.findElement(By.cssSelector("input#user-message")).sendKeys(enterValue);
		driver2.findElement(By.cssSelector("button[onclick ='showInput();']")).click();
		
		driver2.findElement(By.cssSelector("input#sum1")).sendKeys(sum1);
		driver2.findElement(By.cssSelector("input#sum2")).sendKeys(sum2);
		driver2.findElement(By.cssSelector("button[onclick ='return total()']")).click();
		
		Thread.sleep(3000);
		driver2.close();
	}

}
