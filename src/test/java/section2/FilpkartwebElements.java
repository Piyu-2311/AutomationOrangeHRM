package section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartwebElements {
	
	 public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.className("Pke_EE")).sendKeys("nokia");
		
		
		Thread.sleep(1000);
		List<WebElement> suggestion=driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
		
		System.out.println("Total mobile present in suggestion : " + suggestion.size());
		
		for(WebElement wb : suggestion) {
			System.out.println(wb.getText());
			System.out.println("------------------------------");
			String text =wb.getText();
		
		if(text.equals("nokia flip mobile")) {
			System.out.println("Suggestion presnt in Filpkart");
			wb.click();
			break;
			
		   }
		}
		
		
	 }	
}
