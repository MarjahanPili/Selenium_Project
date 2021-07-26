package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PurchasePage_visit {
	
public static void main(String[] args) {
		
		// Web Driver Connect
		WebDriverManager.chromedriver().setup();
		  
		// Web Driver Object
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nexchar.com/signin");
		
	  
	     
	    driver.findElement(By.id("Email")).sendKeys("gift_shop");
	    
	    driver.findElement(By.id("Password")).sendKeys("12345");
	    
	    
	    driver.findElement(By.id("RememberMe")).click();
	    
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		
		 // Visit another website
	    driver.navigate().to("https://www.nexchar.com/admin/Purchase/index?startdate=11-07-2021&enddate=18-07-2021");
			
		
	}


}
