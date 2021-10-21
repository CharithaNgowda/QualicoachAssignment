package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Edituser {
	public WebDriver driver;

	By user = By.xpath("//a[text() = 'Users']");
    By list = By.xpath("//a[text() = 'Browse list of users']");
    By  username = By.id("id_realname");
    By addfilter = By.id("id_addfilter");
    By editicon = By.xpath("//img[@alt='Edit']");
    
    public Edituser(WebDriver driver) {
  	  
    	this.driver = driver;
    	}

    
    public WebElement getuser() {

    	return driver.findElement(user);

    	    }
    
    public WebElement getlist() {

    	return driver.findElement(list);

    	    }
    
    public WebElement getusername() {

    	return driver.findElement(username);

    	    }
    public WebElement getaddfilter() {

    	return driver.findElement(addfilter);

    	    }
    public WebElement getediticon() {
    	JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(894,726)");
		

    	return driver.findElement(editicon);

    	    }

}
