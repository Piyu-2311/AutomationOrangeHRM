package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class eBayShoeShopping {
	 
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		 
		driver.get("https://www.ebay.com/");
		driver.findElement(By.cssSelector("input[placeholder='Search for anything']")).sendKeys("Puma Shoes");
		driver.findElement(By.className("gh-search-button__label")).click();
		String ShowingPumaShoe=driver.findElement(By.className("srp-controls__count-heading")).getText();
		System.out.println(ShowingPumaShoe);
		
		if(ShowingPumaShoe.contains("results for" )) {
			System.out.println("eBay Validation Pass For Puma Shoes");
		}else
		{
			System.out.println("eBay Validation failed For Puma Shoes");
		}
   }
}