package com.orangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
	

	@FindBy(xpath="//span[text()='Leave']")
	private WebElement Leave;
	
	
	
	public LeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnLeavePageTb() {
		Leave.click();
	}

	


}
