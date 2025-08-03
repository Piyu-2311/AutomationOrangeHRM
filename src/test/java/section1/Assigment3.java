package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment3 {
	 
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Bolt T-Shirt')]")).click();	
		Thread.sleep(2000);
		driver.findElement(By.name("add-to-cart")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("ABC");
		driver.findElement(By.id("last-name")).sendKeys("PQRS");
		driver.findElement(By.cssSelector("input[placeholder='Zip/Postal Code']")).sendKeys("123456");
		driver.findElement(By.className("submit-button")).click();
		String ShowTshirt=driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bolt T-Shirt')]")).getText();
		
		System.out.println(ShowTshirt);
		
		if(ShowTshirt.contains("Labs")) {
			System.out.println("T-shirt Checkout Succefully");

		}else {
			System.out.println("T-shirt Checkout Failed");
		}
		
		driver.findElement(By.cssSelector("button[data-test='finish']")).click();
		
		String ShowOrderPlace=driver.findElement(By.xpath("//h2[contains(text(),'Thank')]")).getText();
		System.out.println(ShowOrderPlace);
		
		Thread.sleep(2000);
		
		if(ShowOrderPlace.contains("order!")) {
			System.out.println("Order place Succefully");
		}else
		{
			System.out.println("Order Not place");
		}
		driver.quit();


    }
}