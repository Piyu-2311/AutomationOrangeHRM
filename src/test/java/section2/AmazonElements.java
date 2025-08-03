package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonElements {
	
	public static void main(String[] args) {
		
		System.out.println("Browser lunching start");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("Fridge");
		
		List<WebElement> suggestions=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		
		System.out.println("Total suggestion is : " + suggestions.size());
		
		for(WebElement wb : suggestions) {
			String text=wb.getText();
			System.out.println(text);
			System.out.println("-------------------------------------");
			
			if(text.equals("fridge double door")) {
				System.out.println("Suggestion present ");
				wb.click();
				break;
			}
		}
		
	}
	
	

}
	