package section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffAlertPop {
	
	 public static void main(String[] args) {
		 
		 System.out.println("Browser lunching");
		
		 ChromeDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			driver.findElement(By.className("email-input")).sendKeys("Abc");
			driver.findElement(By.xpath("//button[(text()='Log In')]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Alert alt=driver.switchTo().alert();
			String alertmsg=alt.getText();
			System.out.println(alertmsg);
			
			alt.accept();
			
	 }

}
