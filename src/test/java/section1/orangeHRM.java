package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRM {

        public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
            System.out.println("Browser lunching start");

			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(5000);
            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[contains(text(), Login)]")).click();
            Thread.sleep(5000);
            
            String Results=driver.findElement(By.xpath("//span[text()='Dashboard']")).getText();
            
            System.out.println(Results);
			if(Results.contains("Dashboard")) {
				System.out.println("Validation Pass");
				
			}else {
				System.out.println("Validation Failed");
			}
            
          driver.quit();
	}
   
}
 