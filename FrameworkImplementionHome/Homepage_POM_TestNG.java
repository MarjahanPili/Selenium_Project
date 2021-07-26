package FrameworkImplementionHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage_POM_TestNG {
	
	//create class variable
			private static WebDriver driver= null;
			//private static Select dropdownbox;
			
			
		 //Before Test Function
			@BeforeTest
			public void setupTest()
			{
			  //WebDriverManager.chromedriver().setup();
				WebDriverManager.chromedriver().setup();
		    	driver= new ChromeDriver();

			}
			
			
		 //test function	
			@Test
			public void testStep() throws InterruptedException
			{
		        driver.get("https://www.nexchar.com/signup");
		        
		        //Name Test action
		        
		        Homepage_object_locator.name(driver).sendKeys("ACB123");
		        
		        //Dropdown test action
		        
		        Select dropdown = new Select(Homepage_object_locator.dropdown(driver));
		        dropdown.selectByVisibleText("Cafe and food truck");
				
				
				//Email test action
				
		        Homepage_object_locator.email(driver).sendKeys("gift_shop");
				
				//password test action
		        
		        Homepage_object_locator.password(driver).sendKeys("12345");
		        
				
				//Remember_me test action
		        Homepage_object_locator.checkbox(driver) .click();
		     
				 
				//Sign_in test action
		        Homepage_object_locator.signin(driver).click();
		        
		        
			    Thread.sleep(3000); 
			}
					
			
			//close function
			@AfterTest
			public void browser_close()
			
			{
				// driver.close();
			}
			

}
