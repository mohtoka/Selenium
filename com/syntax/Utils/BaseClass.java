package com.syntax.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	/** method to open browser and get url
	 * @return	<-- driver
	 * @author tokamohamed
	 */
	public static WebDriver setUp() {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		return driver;
	}
	
	/**
	 * method to quit browser
	 */
	public static void tearDown(){
		if(driver!=null) {
			driver.quit();
		}
		
	}

}
