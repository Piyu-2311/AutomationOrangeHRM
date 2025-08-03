package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assign25 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Browser lunching");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Selectmenu')]")).click();
		
		
		WebElement newframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(newframe);
		
		Thread.sleep(2000);
		driver.findElement(By.id("speed-button")).click();
//		String text=driver.findElement(By.xpath("//ul[@id='speed-menu']/li")).getText();
//		System.out.println(text);
		driver.findElement(By.xpath("//div[contains(text(),'Medium')]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("files-button")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Some unknown file')]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("span[id='number-button']")).click();
		driver.findElement(By.cssSelector("div[id='ui-id-5']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("salutation-button")).click();
		driver.findElement(By.xpath(" //div[text()='Dr.']")).click();
		
		
		
	}

}
