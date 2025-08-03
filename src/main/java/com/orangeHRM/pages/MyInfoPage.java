package com.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage {
	
	@FindBy(xpath="//a[text()='Job']")
	private WebElement JobTab;
	
	@FindBy(xpath="//h6[text()='Job Details']")
	private WebElement JobDetails;
	
	

	public  MyInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnJobTab() {
		JobTab.click();
		
	}
	
	public String getJobDetails() {
		return JobDetails.getText();
		 
	}

}





