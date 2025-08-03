package section2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Browesr lunching start");
		driver.get("https://indianfrro.gov.in/frro/FormC/accom_reg.jsp?t4g=W7FE2NB4");
				
		Thread.sleep(1000);
		WebElement tp1=driver.findElement(By.id("u_secques"));
	   Select s1=new Select(tp1);
	   s1.selectByIndex(3);
	   
	   Thread.sleep(1000);
	   WebElement tp2=driver.findElement(By.name("u_gender"));
	   Select s2=new Select(tp2);
	   s2.selectByValue("X");
		
	}

}
