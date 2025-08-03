package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(" Browser lunching Start ");
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	   Thread.sleep(5000);
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   driver.findElement(By.name("password")).sendKeys("admin123");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//span[text()='Leave']")).click();
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//label[text()='Leave Type']")).click();

	}

}
//div[@class='oxd-select-text-input']/../preceding-sibling::div/label
//div[@text='Leave Type']/../div[@text()='-- Select --']