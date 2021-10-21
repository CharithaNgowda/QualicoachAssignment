package qualicoach;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Adminlogin;
import pageobjects.Deleteuser;
import resources.Base;


public class DeleteUserTest extends Base {
	
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(Base.class.getName());

	
	
	@Test
	public void baseNavigation() throws IOException
	{
	driver = initializeDriver();
	log.info("driver is initialized");
	driver.get("https://test.qualicoach.org/admin/search.php");	
	log.info("Navigate to Admin  Login page");
	Adminlogin alp = new Adminlogin(driver);
	alp.getemail().sendKeys("admin55");
	alp.getpassword().sendKeys("Admin@6155");
	alp.getlogin().click();	
	
	Deleteuser user = new Deleteuser(driver);
	user.getuser().click();
	user.getlist().click();
	user.getusername().sendKeys("admin12");
	user.getaddfilter().click();
	user.getdeleteicon().click();
}
	@AfterTest
	   public void teardown()
	  {
		driver.close();
	}
}
