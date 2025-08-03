package com.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	@FindBy(name="username")
	private WebElement usernameTb;
	
	@FindBy(name="password")
	private WebElement passwordTb;
	
	@FindBy(css="button[type='submit']")
	private WebElement loginbtn;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	public void loginToHRM(String username, String password ) {
		usernameTb.sendKeys(username);
		passwordTb.sendKeys(password);
		loginbtn.click();
	}

	
}
