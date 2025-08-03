package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PastDateCalender {
	
	public static void main(String[] args) {
		
		System.out.println("Browser lunching ");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		WebElement newframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(newframe);
		driver.findElement(By.id("datepicker")).click();
		
		String year="2022";
		String month="November";
		String date="10";
		
		while(true) {
			
			WebElement actualYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
			String yearValue=actualYear.getText();
			
			if(yearValue.equals(year)) {
				String monthValue=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				
				if(monthValue.equals(month)) {
					driver.findElement(By.xpath("//a[text()="+ date +"]")).click();
					
					break;
				}else {
					
					driver.findElement(By.xpath("//a[@title='Prev']")).click();
				}
			}else {
				driver.findElement(By.xpath("//a[@title='Prev']")).click();
				
			}
			
			
		}
		
		
		
	}

	

}
