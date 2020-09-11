package com.syntax.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.Pages.DashBoardPage;
import com.syntax.Pages.LoginPageWithFindBy;
import com.syntax.Utils.BaseClass;

public class LoginTestWithFindBy {
	
	public static void main(String[] args) {
		
		BaseClass.setUp();
		
		LoginPageWithFindBy lg = new LoginPageWithFindBy();
		DashBoardPage db = new DashBoardPage();
		
		lg.usernameTextBox.sendKeys("Admin");
		lg.passwordTextBox.sendKeys("Hum@nhrm123");
		lg.loginButton.click();
		
		
		TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		
		try {
		FileUtils.copyFile(file, new File("screenshots/HRMS/dashboard.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		String adminText = db.welcomeAdmin.toString();
		System.out.println(adminText);
		
		
		BaseClass.tearDown();
		
		
		
		
		
		
		
		
	}

}
