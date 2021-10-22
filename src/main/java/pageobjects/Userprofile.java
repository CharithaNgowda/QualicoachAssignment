package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Userprofile {
    public WebDriver driver;
	
By  profileicon= By.xpath("//*[@id=\"action-menu-toggle-0\"]/span/span/span/img");
By  profile = By.id("\"actionmenuaction-2\"");


    public Userprofile(WebDriver driver) 
       {
       this.driver = driver;
       }
	
    public WebElement getprofileicon()
    {
	return driver.findElement(profileicon);
    }
    
   
}

