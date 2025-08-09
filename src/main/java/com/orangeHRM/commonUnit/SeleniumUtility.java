package com.orangeHRM.commonUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtility {
	
	private static WebDriver driver;
	private static WaitUtility waitUtil;

	public SeleniumUtility(WebDriver driver) {
		this.driver=driver;
		this.waitUtil = new WaitUtility(driver);
		
     }
	
	
	public static void enterText(WebElement element, String text) {
		waitUtil.verifyElementVisible(element);
		element.clear();
		element.sendKeys(text);
	}
	
	public static void clickElement(WebElement element) {
		waitUtil.verifyElementClickable(element);
		element.click();
		
	}
	public static void acceptAlert() {
		waitUtil.verifyAlertPresent();
		driver.switchTo().alert().accept();
	}
	
	public static void cancelAlert() {
		waitUtil.verifyAlertPresent();
		driver.switchTo().alert().dismiss();
	}
	
	public static void selectListbox(WebElement element) {
		
		System.out.println("Code is working");
		
		System.out.println("Pass");
	}
	
	public static void switchToFrame() {
		driver.switchTo().frame(2);
	}
		
	public static void windowHandling(String sessionID) {
		driver.switchTo().window(sessionID);
	}
	
	public static void scrollHandling() {
		
	}
	
	
		
		

}

