package qualicoach;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import pageobjects.Adminlogin;
import pageobjects.Userlogin;
import resources.Base;

public class LoginuserTest extends Base{
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(Base.class.getName());
	
	@Test(dataProvider ="getData")
	public void baseNavigation(String Username,String Password,String text) throws IOException
	{
	driver = initializeDriver();
	log.info("driver is initialized");
    driver.get("https://test.qualicoach.org/");
    driver.getCurrentUrl();
	Userlogin usn = new Userlogin(driver);
	usn.getUser().sendKeys("Username");
	usn.getPassword().sendKeys("Password");
	Log.info(text);
	usn.getLogin().click();
    }
	
	@DataProvider
	public Object[][] getData()
	  {
		Object[][] data = new Object[2][3]  ;
		data[0][0] = "user88";
		data[0][1] = "User@9146";
		data[0][2] = "Home page should be displayed";
		
		
		data[1][0] = "user88";
		data[1][1] = "hhho";
		data[1][2] = " Home page should not be displayed";
		
		
		
		 return data;
		 
}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
