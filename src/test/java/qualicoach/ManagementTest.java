package qualicoach;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Adminlogin;
import pageobjects.Courses;
import resources.Base;

public class ManagementTest extends Base {
	
		
		public WebDriver driver;
		public static Logger log =LogManager.getLogger(Base.class.getName());

		
		@Test
		public void baseNavigation() throws IOException
		{
		driver = initializeDriver();
		log.info("driver is initialized");
	    driver.get("https://test.qualicoach.org/admin/search.php");
		Adminlogin alp = new Adminlogin(driver);
		alp.getemail().sendKeys("admin55");
		alp.getpassword().sendKeys("Admin@6155");
		alp.getlogin().click();	
		
		Courses c1 = new Courses(driver);
		c1.getcourses().click();
		c1.getmcc().click();
		c1.getcreatenew().click();
        c1.getcreatecategory().click();
	  	c1.getcategoryname().sendKeys("Automation");
		
		c1.getcidno().sendKeys("10");
 	    c1.getcreatecategory().click();	
	}
		@AfterTest
		   public void teardown()
		  {
			driver.close();
		}
}

