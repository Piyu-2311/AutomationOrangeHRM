package section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testing {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Browser lunching start");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("Gold rate");
		
		Thread.sleep(2000);
		List<WebElement> Suggestions=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		System.out.println("Total suggestion : " + Suggestions.size() );
		
		for(WebElement wb: Suggestions) {
			String text = wb.getText();
			System.out.println(text);
		}
		
		
	}

}
