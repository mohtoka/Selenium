package com.syntax.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.Utils.BaseClass;

public class LoginPageWithFindBy extends BaseClass{
	
	@FindBy (id = "txtUsername")
	public WebElement usernameTextBox;
	
	@FindBy (xpath = "//input[@id= 'txtPassword']")
	public WebElement passwordTextBox;
	
	@FindBy (css = "input#btnLogin")
	public WebElement loginButton;
	
//	@FindBy (xpath = "//table[@id='resultTable']/tbody/tr")				// <- in dif page
//	public List<WebElement> table;
	
	public LoginPageWithFindBy() {
		PageFactory.initElements(driver, this);
	}
	
	

}
