package section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHRM.commonUnit.BaseTest;
import com.orangeHRM.commonUnit.DataHandler;
import com.orangeHRM.pages.DashBoardPage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.pages.MyInfoPage;

@Listeners(com.orangeHRM.commonUnit.ExecutionMoniter.class)
public class MyInfoVerificationTest extends BaseTest {
	
	
	@Test
	public void myInfovalidation() {
		
		DashBoardPage dashboard = new DashBoardPage (driver); 
		dashboard.clickOnMyInfoLink();
		
		MyInfoPage myinfopage = new MyInfoPage(driver);
		myinfopage.clickOnJobTab();
		
		
		String JobHeader=myinfopage.getJobDetails();
		
		if(JobHeader.equals(handler.getDataFromExcel("MySheetTC", 1, 2))) {
			Reporter.log("Test Pass" , true);
		}else {
			Reporter.log("Test fail" , true);
		}
		
	}

}

