package com.syntax.Test;

import com.syntax.Pages.LoginPage;
import com.syntax.Utils.BaseClass;

public class LoginTest {

	public static void main(String[] args) {

		BaseClass.setUp();
		
		LoginPage lg = new LoginPage();
		 
		lg.username.sendKeys("Admin");
		lg.password.sendKeys("Hum@hrm123");
		lg.loginButton.click();
		
		
		
		
		
		
		
		
		
		
		
		BaseClass.tearDown();

	}

}
