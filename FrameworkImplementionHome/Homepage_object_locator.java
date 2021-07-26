package FrameworkImplementionHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage_object_locator {
	

	
	private static WebElement locator=null;
	//private static Select dropdownbox=null;
	
	
		
	//Name function
	
		public static WebElement name(WebDriver driver)
		{
		locator = driver.findElement(By.id("Name"));
		return locator;
		}
		
      //Dropdown Business Type function
		
		public static WebElement dropdown(WebDriver driver)
		{
			
		locator = driver.findElement(By.id("CategoryId"));
		return locator;
		}    

	
	 //Email function
	
	    public static WebElement email(WebDriver driver)
	    {
	    locator = driver.findElement(By.id("Email"));
	    return locator;
	    }
	
	//Password function
	
	    public static WebElement password(WebDriver driver)
	    {
	    locator = driver.findElement(By.id("Password"));
	    return locator;
	    }
	
	//Checkbox click
	    public static WebElement checkbox(WebDriver driver)
	    {
        locator = driver.findElement(By.id("NotReceiveNewsLetter"));
	    return locator;
	    }
	
	//sign_in button
	    public static WebElement signin(WebDriver driver)
	    {
	    locator = driver.findElement(By.xpath("//button[contains(text(),'Create new account')]"));
	    return locator;
        }

}
