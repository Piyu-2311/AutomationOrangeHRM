package section3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHRM.commonUnit.BaseTest;
import com.orangeHRM.commonUnit.DataHandler;

import com.orangeHRM.pages.LeavePage;
import com.orangeHRM.pages.LeavetypePage;
import com.orangeHRM.pages.LoginPage;

@Listeners(com.orangeHRM.commonUnit.ExecutionMoniter.class)

public class LeaveVerificationTest extends BaseTest{
	
	 @Test
	 public void leaveValidation(){
		 
		LeavePage leavepage = new LeavePage(driver);
		leavepage.clickOnLeavePageTb();
		
		LeavetypePage ltpage = new LeavetypePage(driver);
		ltpage.clickOnConfigure();
		ltpage.clickOnLeaveTypes();
		
		String holiday =ltpage.getLeaveDetails();
		
		if(holiday.equals(handler.getDataFromExcel("MySheetTC", 1, 3))) {
			Reporter.log("The give data present in Web is : " + holiday ,true );
		}else {
			Reporter.log("Test fail", true);
		}
		
		System.out.println("Pass");
		
		
	}


}
