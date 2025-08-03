package com.orangeHRM.commonUnit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	
	private WebDriver driver;
	private WebDriverWait wait;

	public WaitUtility(WebDriver driver) {
		this.driver=driver;
		this.wait= new WebDriverWait(this.driver, Duration.ofSeconds(10));
		
	}
	
	public void verifyElementVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void verifyElementClickable(WebElement element) {
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void verifyAlertPresent() {
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void verifyListBoxselect(WebElement element) {
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
//	
//	public void verifyScroll() {
//		wait.until(ExpectedConditions.w))
//
//	}
	
	public void verifyFrame(WebElement FrameElement) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt( FrameElement));
		
	}
	public void verifySwitchToWindow() {
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	}
	
	
	
}
