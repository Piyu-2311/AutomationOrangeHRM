package com.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class DashBoardPage {
		
	   @FindBy(xpath="//span[text()='My Info']")
		private WebElement MyInfoLink;
	   
	   @FindBy(css= "span.oxd-userdropdown-tab")
	   private WebElement userDropdown;
	   
	   @FindBy(xpath="//a[text()='Logout']")
	   private WebElement logout;
	   
	
	public  DashBoardPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
	
	public void clickOnMyInfoLink() {
		MyInfoLink.click();
	}
	
	public void clickOnUserDropDown() {
		userDropdown.click();
	}
	
	public void clickOnLogOut() {
		logout.click();
	}
	
	
}
