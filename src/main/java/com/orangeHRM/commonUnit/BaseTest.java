package com.orangeHRM.commonUnit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.orangeHRM.pages.DashBoardPage;
import com.orangeHRM.pages.LoginPage;

public class BaseTest {
	
	 public DataHandler handler= new DataHandler();
	 public  WebDriver driver;
	 public static WebDriver listenerDriver;
	
	 @BeforeClass
	public void confiBC() {
		 driver=new ChromeDriver();
		 listenerDriver=driver;
		 driver.get(handler.getDataFromProperty("url"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@BeforeMethod
	public void configBM() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginToHRM(handler.getDataFromProperty("username"),handler.getDataFromProperty("password"));
		
	}
	
	@AfterMethod
	public void configAM() {
		DashBoardPage dashboard = new DashBoardPage (driver); 
		dashboard.clickOnUserDropDown();
		dashboard.clickOnLogOut();
		
	}
	
	@AfterClass
	public void configAC() {
		driver.quit();
		
	}

}
;
