package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicTable {
	
	static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fdefault.aspx";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement usernameBox = driver.findElement(By.id("ctl00_MainContent_username"));
		WebElement passwordBox = driver.findElement(By.id("ctl00_MainContent_password"));
		WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
		usernameBox.sendKeys("Tester");
		passwordBox.sendKeys("test");
		loginButton.click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id= 'ctl00_MainContent_orderGrid']/tbody/tr"));
		System.out.println("Number of rows: " + rows.size());
		
		for(int i = 1; i<rows.size(); i++) {
			WebElement r = rows.get(i);
			String rowText = r.getText();
			System.out.println(rowText);
			if(rowText.contains("FamilyAlbum")) {
				driver.findElements(By.xpath("//table[@id= 'ctl00_MainContent_orderGrid']/tbody/tr/td[1]")).get(i-1).click();
				//break;
			}
		}
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
	

}
