package FrameworkImplementionLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage_object_locator {
	
	private static WebElement locator = null;
	
//Email Function
	public static WebElement email(WebDriver driver)
	{
	locator= driver.findElement(By.id("Email"));
	return locator; 
	}
    
//password Function
	public static WebElement password(WebDriver driver)
	{
		locator = driver.findElement(By.id("Password"));
		return locator;
	} 
	
//RememberMe checkbox click Function
	public static WebElement rememberme(WebDriver driver)
	{
		locator = driver.findElement(By.id("RememberMe"));
		return locator;
	}
	
//SignIn BUtton Function
	public static WebElement signin(WebDriver driver)
	{
		locator = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
		return locator;
	}
	
	
	
}
