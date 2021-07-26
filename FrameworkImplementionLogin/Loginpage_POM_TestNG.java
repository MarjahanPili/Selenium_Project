package FrameworkImplementionLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage_POM_TestNG {
	
	
	//create class variable
	private static WebDriver driver = null;
   
	//Before Test Function
	@BeforeTest
	public void testSetup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); 
	}
	
	//Test Function
	@Test
	public void testStep()
	{
		driver.get("https://www.nexchar.com/signin");
		
		//email test action
		Loginpage_object_locator.email(driver).sendKeys("gift_shop");
		
		//password test action
		Loginpage_object_locator.password(driver).sendKeys("12345");
		
		//Remember_me test action
		Loginpage_object_locator.rememberme(driver).click();
		
		//sign_in
		Loginpage_object_locator.signin(driver).click(); 
	}
	
	//After Test Function
	@AfterTest
	public void testClose()
	{
		driver.close();
	}
}
