package com.orangeHRM.pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavetypePage {
	
	@FindBy(xpath="//span[text()='Configure ']")
	private WebElement configure;
	
	
	@FindBy(xpath="//a[text()='Leave Types']")
	private WebElement LeaveType;
	
	@FindBy(xpath="//h6[text()='Leave Types']")
	private WebElement LeaveDetails;
	
	public LeavetypePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnConfigure() {
		configure.click();
	}
	public void clickOnLeaveTypes() {
		LeaveType.click();
	}
	public String getLeaveDetails() {
		return LeaveDetails.getText();
	}
	
}	
