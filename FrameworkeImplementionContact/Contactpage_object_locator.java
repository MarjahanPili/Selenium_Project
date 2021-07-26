package FrameworkeImplementionContact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Contactpage_object_locator {
	 
	private static WebElement locator=null;
	
	
	
   //Fullname function
	
   public static WebElement fullname(WebDriver driver)
		{
		     locator = driver.findElement(By.id("FullName"));
		     return locator;
		}

	
	//Email function
	
   public static WebElement email(WebDriver driver)
	    {
	         locator = driver.findElement(By.id("Email"));
	         return locator;
	    }
	    
    //Dropdown function(select type of inquiry)
		
    public static WebElement dropdown(WebDriver driver)
	  	{
	  		
	  		locator = driver.findElement(By.id("Query"));
	  	    return locator;
	  	}
    
	    
    //Message box
	
	public static WebElement message(WebDriver driver)
	    {
	        locator = driver.findElement(By.id("Message"));
	        return locator;
	    }
	    
	// send button
	    
	public static WebElement send11(WebDriver driver)
	    {
	    	locator = driver.findElement(By.xpath("//button[@type='submit']"));
	    	return locator;
	    }
	    

}
