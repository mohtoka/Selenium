package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
	
	static String url = "https://www.facebook.com/r.php";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		String first, last, num, pass;
		WebElement firstName, lastName, number, password, month, day, year, gender, signUpButton;
		Select monthSelect, daySelect, yearSelect;
		List<WebElement> monthList, dayList, yearList;
		
		first = "Toka";
		last = "Mohamed";
		num = "1234567890";
		pass = "toka123";
		
		firstName = driver.findElement(By.xpath("//input[@name= 'firstname']"));
		lastName = driver.findElement(By.xpath("//input[@name= 'lastname']"));
		number = driver.findElement(By.xpath("//input[@name= 'reg_email__']"));
		password = driver.findElement(By.xpath("//input[@name= 'reg_passwd__']"));
		month = driver.findElement(By.id("month"));
		day = driver.findElement(By.id("day"));
		year = driver.findElement(By.id("year"));
		gender = driver.findElement(By.xpath("//input[@value= '1']"));
		signUpButton = driver.findElement(By.xpath("//button[text() = 'Sign Up']"));
		
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		number.sendKeys(num);
		password.sendKeys(pass);
		
		monthSelect = new Select(month);
		daySelect = new Select(day);
		yearSelect = new Select(year);
		
		monthList = monthSelect.getOptions();
		dayList = daySelect.getOptions();
		yearList = yearSelect.getOptions();
		
		for(WebElement m : monthList) {
			String monthText = m.getText();
			if(monthText.equals("Nov")) {
				monthSelect.selectByVisibleText(monthText);
			}}
		for(WebElement d : dayList) {
			String dayText = d.getText();
			if(dayText.equals("27")) {
				daySelect.selectByVisibleText(dayText);
			}}
		for(WebElement y : yearList) {
			String yearText = y.getText();
			if(yearText.equals("1996")) {
				yearSelect.selectByVisibleText(yearText);
			}}
		
		gender.click();
		signUpButton.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
	}
	

}
