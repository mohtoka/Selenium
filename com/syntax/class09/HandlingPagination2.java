package com.syntax.class09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPagination2 {

	static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	static String username = "Admin";
	static String password = "Hum@nhrm123";
	static String firstName = "Sample";
	static String lastName = "Person";
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement usernameBox = driver.findElement(By.id("txtUsername"));
		WebElement passwordBox = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
	
		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password);
		loginButton.click();
		
		WebElement pim = driver.findElement(By.linkText("PIM"));
		pim.click();
		
		WebElement addEmployee = driver.findElement(By.id("menu_pim_addEmployee"));
		addEmployee.click();
		
		WebElement firstNameBox = driver.findElement(By.id("firstName"));
		WebElement lastNameBox = driver.findElement(By.id("lastName"));
		
		firstNameBox.sendKeys(firstName);
		lastNameBox.sendKeys(lastName);
		
		WebElement empIDBox = driver.findElement(By.id("employeeId"));
		String empID = empIDBox.getAttribute("value");
		
		WebElement saveButton = driver.findElement(By.id("btnSave"));
		saveButton.click();
		
		WebElement employeeList = driver.findElement(By.linkText("Employee List"));	
		employeeList.click();
		
		boolean flag = true;
		
		while(flag) {
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id= 'resultTable']/tbody/tr"));
			for(int i = 0; i<rows.size(); i++) {
				String rowText = rows.get(i).getText();
				if(rowText.contains(empID)) {
					WebElement checkbox = driver.findElement(By.xpath("//table[@id= 'resultTable']/tbody/tr[" + i + "]/td[1]"));
					checkbox.click();
					WebElement delete = driver.findElement(By.id("btnDelete"));
					delete.click();
					WebElement confirmDelete = driver.findElement(By.id("dialogDeleteBtn"));
					confirmDelete.click();
					break;
				}
			}
			WebElement next = driver.findElement(By.linkText("Next"));
			next.click();
		}
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}
}
