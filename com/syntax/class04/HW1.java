package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

//	Go to http://166.62.36.207/syntaxpractice/basic-radiobutton-demo.html
//	Select any radiobutton and the age group ---> use List and loop
//	Click on get values
//	Verify the text in the page -- do not hardcode the values and compare

	static String url = "http://166.62.36.207/syntaxpractice/basic-radiobutton-demo.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		List<WebElement> genderButtonOptions = driver.findElements(By.xpath("//input[@name = 'optradio']"));
		String genderRadioButtonsText = "";
		for(WebElement gender: genderButtonOptions) {
			gender.click();
			genderRadioButtonsText = gender.getAttribute("value");
		}
		
		List<WebElement> sexRadioButtons = driver.findElements(By.xpath("//input[@name = 'gender']"));
		List<WebElement> ageRadioButtons = driver.findElements(By.xpath("//input[@name = 'ageGroup']"));
		String sexRadioButtonsText = "";
		String ageRadioButtonsText = "";
		
		for(WebElement sex:sexRadioButtons) {
			sex.click();
			sexRadioButtonsText= sex.getAttribute("value");
		}
		for(WebElement age:ageRadioButtons) {
			age.click();
			ageRadioButtonsText = age.getAttribute("value");
		}
		
		WebElement genderButton = driver.findElement(By.xpath("//button[text() = 'Get Checked value']"));
		WebElement sexAndAgeButton = driver.findElement(By.xpath("//button[text() = 'Get values']"));
		
		genderButton.click();
		sexAndAgeButton.click();
		
		String genderButtonTextValue = driver.findElement(By.xpath("//p[@class= 'radiobutton']")).getText();
		String sexAndAgeButtonValue = driver.findElement(By.xpath("//p[@class= 'groupradiobutton']")).getText();
		
		
		
		if(genderButtonTextValue.contains(genderRadioButtonsText)) {
			System.out.println(genderButtonTextValue 
					+ " : \"" + genderRadioButtonsText + "\" is present ");
		}
		if(sexAndAgeButtonValue.contains(sexRadioButtonsText) && sexAndAgeButtonValue.contains(ageRadioButtonsText)) {
			System.out.println(sexAndAgeButtonValue 
					+ " : \"" + sexRadioButtonsText + "\" and \"" + ageRadioButtonsText + "\" is present ");
		}
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
