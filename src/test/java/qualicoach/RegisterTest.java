package qualicoach;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Adminlogin;

import pageobjects.Userregister;
import resources.Base;

public class RegisterTest extends Base {
public WebDriver driver;
public static Logger log =LogManager.getLogger(Base.class.getName());


@Test
public void baseNavigation() throws IOException
{
	driver = initializeDriver();
	log.info("driver is initialized");
	driver.get("https://test.qualicoach.org/admin/search.php");
	log.info("Navigate to Admin login page");
Adminlogin alp = new Adminlogin(driver);
alp.getemail().sendKeys("admin55");
alp.getpassword().sendKeys("Admin@6155");
alp.getlogin().click();	

Userregister users = new  Userregister(driver);
users.getuser().click();
users.getnewuser().click();
users.getusername().sendKeys("admin12");
users.getfirstname().sendKeys("Admin");
users.getlastname().sendKeys("user");
//users.getpassword().click();
//driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
//users.getpassword().sendKeys("Admin@6112");
driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
users.getemailid().sendKeys("admin12@qualitest.com");
driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
users.Createuser().click();


  }
@AfterTest
public void teardown()
{
	driver.close();
}
   }
