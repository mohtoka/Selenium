package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBTask {
	
	static String url = "https://www.facebook.com/r.php";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement month = driver.findElement(By.id("month"));
		Select monthSelect = new Select(month);
		
		WebElement day = driver.findElement(By.id("day"));
		Select daySelect = new Select(day);
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearSelect = new Select(year);
		
		List<WebElement> monthList = monthSelect.getOptions();
		List<WebElement> dayList = daySelect.getOptions();
		List<WebElement> yearList = yearSelect.getOptions();
		monthList.remove(0);
		dayList.remove(0);
		yearList.remove(0);
		
		int monthSize = monthList.size();
		int daySize = dayList.size();
		int yearSize = yearList.size();
		
		System.out.println("Month size: " + monthSize + ", Day size: " + daySize + ", Year size: " + yearSize);
		
		for (WebElement m : monthList) {
			String monthText = m.getText();
			if(monthText.equals("Nov")) {
				monthSelect.selectByVisibleText("Nov");
			}
		}
		
		for(WebElement d: dayList) {
			String dayText = d.getAttribute("value");
			if(dayText.equals("27")) {
				daySelect.selectByValue("27");
			}
		}
		
		for (WebElement y : yearList) {
			String yearText = y.getText();
			if(yearText.equals("1996")) {
				yearSelect.selectByVisibleText("1996");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
