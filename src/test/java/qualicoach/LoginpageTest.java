package qualicoach;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Adminlogin;
import resources.Base;



public class LoginpageTest extends Base {
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(Base.class.getName());
	
		@Test(dataProvider="getData")
		public void baseNavigation(String Username,String Password,String text) throws IOException
		{
		driver = initializeDriver();
		log.info("driver is initialized");
		driver.get("https://test.qualicoach.org/admin/search.php");
		driver.getCurrentUrl();	
    	Adminlogin alp = new Adminlogin(driver);
		alp.getemail().sendKeys("Username");
	    alp.getpassword().sendKeys("Password");
		alp.getlogin().click();	
		log.info(text);
		}
		
		
		@DataProvider
	public Object[][] getData()
			  {
				Object[][] data = new Object[2][3]  ;
				data[0][0] = "admin55";
				data[0][1] = "Admin@6155";
				data[0][2] = "Home page should be displayed";
				
				
				data[1][0] = "admin68";
				data[1][1] = " Admin@9146";
				data[1][2] = " Home page should be displayed";
				
				
				 return data;
				
			  }
   @AfterTest
   public void teardown()
		{
			driver.close();
		}
		}
		
	  


