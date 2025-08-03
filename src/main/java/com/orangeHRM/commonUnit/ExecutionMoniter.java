package com.orangeHRM.commonUnit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExecutionMoniter implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		String name=result.getName();
		System.out.println("testcase failed name is : " + name);
		TakesScreenshot ts =(TakesScreenshot) BaseTest.listenerDriver;
		File screenshot= ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screenshot, new File("./screenshot/" + name + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
 }
}