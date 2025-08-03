package section2;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginProperties {
	 
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("D:\\Automationwoekspace\\Automation\\src\\main\\resources\\data.properties");
		
		Properties pobj = new Properties();
		pobj.load(fis);
		
		String url=pobj.getProperty("url");
		String username=pobj.getProperty("username");
		String password= pobj.getProperty("password");
		
		System.out.println("Link :"+ url +"\n" + "username : " + username + "\n" + "Password : " + password  );
		
		System.out.println("Browesr lunching start");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		
	}
	
	
	
}
