
package section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

          public static void main(String[] args) throws InterruptedException {
	     ChromeDriver  driver=new ChromeDriver();
	     System.out.println("Browser lunching");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	      driver.get("https://www.flipkart.com/");
	
     
	      driver.findElement(By.className("Pke_EE")).sendKeys("laptop");
	      
	      driver.findElement(By.cssSelector("button[aria-label='Search for Products, Brands and More']")).click();
	      String Result=driver.findElement(By.xpath("//div[contains(text(),'CHUWI Intel Celeron Dual')]")).getText();
	      
	      System.out.println(Result);
	 
	      driver.findElement(By.className("DByuf4")).click();
	      String mainBrowesrSessionID=driver.getWindowHandle();
	      System.out.println(mainBrowesrSessionID);
	      
	     Set<String>allBrowserSessionID=driver.getWindowHandles();
	     
	     for(String id1 : allBrowserSessionID) {
	    	 if(!id1.equals(mainBrowesrSessionID)) {
	    		 driver.switchTo().window(id1);
	    	 }
	    	 System.out.println(id1);
	    	 
	    	
	   }
	     
	     Thread.sleep(2000);
	     String Text=driver.findElement(By.className("Nx9bqj")).getText();
	     System.out.println(Text);
	     
	     
	      
	     
          }
}   