package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Itempage_visit {
	
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
	    driver.navigate().to("https://www.nexchar.com/admin/items");
		
	    // click add new item
	    driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
	    
	    //inserting item name
	    driver.findElement(By.id("Name")).sendKeys("ABC");
	    
	    //Inserting Description
	    driver.findElement(By.id("Description")).sendKeys("This is good");
	    
	    //Inserting Inventory-SKU
	     driver.findElement(By.id("SKU")).sendKeys("0123");
	   
	     //Inserting Inventory-Barcode
	     driver.findElement(By.id("Barcode")).sendKeys("00998");
	  
	     //Inserting Quantity
		  driver.findElement(By.id("Outlets_0__Quantity")).sendKeys("50");

	    //Inserting Retail Pricing
		  driver.findElement(By.id("RetailPrice")).sendKeys("400");

	    //Inserting wholesale Pricing
		  driver.findElement(By.id("CostPerItem")).sendKeys("250");
	    
	    //ADDITIONAL UNIT OF MEASURES
	    
        // Inserting Unit
		//  Select dropdownunit = new Select(driver.findElement(By.id("Unit")));
		  //dropdownunit.selectByVisibleText("");

	     
	    //Inserting weight
		  driver.findElement(By.id("Weight")).sendKeys("500");
		  Select dropdown = new Select(driver.findElement(By.id("WeightUnit")));
		  dropdown.selectByVisibleText("g"); 
			
		  
	    //Inserting size
		//  Select dropdownsize = new Select(driver.findElement(By.id("Size")));
	     // dropdownsize.selectByVisibleText("");

	    
	    //Choose color
	    
	    //Status select
			Select dropdownbox1=new Select(driver.findElement(By.id("Status")));
			dropdownbox1.selectByVisibleText("Draft"); 

	  
	    //Category Select
			Select dropdownbox2=new Select(driver.findElement(By.id("CategoryId")));
			dropdownbox2.selectByVisibleText("Valentines Day Gift"); 

	    //Inserting supplier name
	      driver.findElement(By.id("SupplierName")).sendKeys("Abul");
			
	    // Sales Channel select
	      //driver.findElement(By.id("SalesFromPointOfSaleFlag")).click(); 
	     // driver.findElement(By.xpath("//input[@type='checkbox']")) .click(); 
	      

			List<WebElement>checkbox1=driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println("The size of the checkbox: "+checkbox1.size());
			
			for(WebElement sales:checkbox1)
			{
				// click the sales object
				sales.click();
			}  

	    
	    //Inserting Title
	      driver.findElement(By.id("SEOMetaTag_Title")).sendKeys("Title");
	    
	    //Inserting Description
	      driver.findElement(By.id("SEOMetaTag_Description")).sendKeys("Description");

	    
	    //Inserting keyword
	      driver.findElement(By.id("SEOMetaTag_Keyword")).sendKeys("keyword");

	    
	    
		 
	}

}
