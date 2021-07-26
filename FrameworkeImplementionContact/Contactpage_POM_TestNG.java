package FrameworkeImplementionContact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Contactpage_POM_TestNG {

	
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
			driver.get("https://www.nexchar.com/contactus");
			
			//Inserting Full Name
			Contactpage_object_locator.fullname(driver).sendKeys("ACB123");
			
			//Inserting Email 
			Contactpage_object_locator.email(driver).sendKeys("marjahan6469@gmail.com");
			
			//Inserting dropdown inquiry
			Select dropdown = new Select(Contactpage_object_locator.dropdown(driver));
			dropdown.selectByVisibleText("Report a bug");
			
			
			//Inserting a message
			Contactpage_object_locator.message(driver).sendKeys("habijabi"); 
			
			//click send button
			Contactpage_object_locator.send11(driver).click(); 
			//send(driver).click();
		}
		
		//After Test Function
		@AfterTest
		public void testClose()
		{
			//driver.close();
		}

}
