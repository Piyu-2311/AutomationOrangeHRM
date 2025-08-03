package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class redBus {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
	
		Thread.sleep(2000);
		driver.findElement(By.id("src")).sendKeys("Bengaluru");
		driver.findElement(By.id("dest")).sendKeys("kolhapur");
	    driver.findElement(By.className("dateText")).sendKeys("17-03-2025");
		driver.findElement(By.cssSelector("button[class='sc-cvbbAY gDXYez']")).click();



  }

	
}