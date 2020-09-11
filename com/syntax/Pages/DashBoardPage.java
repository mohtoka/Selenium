package com.syntax.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.Utils.BaseClass;

public class DashBoardPage extends BaseClass{
	
	@FindBy (css = "a#welcome")
	public WebElement welcomeAdmin;
	
	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}
	

}
