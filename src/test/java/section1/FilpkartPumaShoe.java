package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartPumaShoe {
	
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			Thread.sleep(2000);
			driver.findElement(By.className("Pke_EE")).sendKeys("puma shoes");
			driver.findElement(By.cssSelector("button[class='_2iLD__']")).click();
			String showingResult=driver.findElement(By.xpath("//span[contains(text(),'results for ')]")).getText();
			System.out.println(showingResult);
			
			if(showingResult.contains("puma shoes")) {
				System.out.println("validation pass");
			}
			else {
				
				System.out.println("validation failed");

				
			}
			driver.quit();
		}
		

	}
                       