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
import pageobjects.Userprofile;
import pageobjects.Userlogin;
import resources.Base;

public class UpdateuserTest extends Base{
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(Base.class.getName());
	
	@Test
	public void baseNavigation() throws IOException
	{
	driver = initializeDriver();
	log.info("driver is initialized");
    driver.get("https://test.qualicoach.org/");
    driver.getCurrentUrl();
	Userlogin usn = new Userlogin(driver);
	usn.getUsername().sendKeys("user90");
	usn.getUserPassword().sendKeys("User@0129");
	//Log.info(text);
	usn.getUserLogin().click();
	Userprofile UP = new Userprofile(driver);
	UP.getprofileicon().click();
	
	
	
    }

	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
