package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adminlogin {
	public WebDriver driver;
	  
    By email = By.id("username");
    By password = By.id("password");
    By Login = By.id("loginbtn");
    
    public Adminlogin(WebDriver driver) {
    	  
    	this.driver = driver;
    	}


    	public WebElement getemail() {

    	return driver.findElement(email);
    	  
    	}
    	        
    	public WebElement getpassword()
    	{
    	return driver.findElement(password);
    	}

    	public WebElement getlogin()
    	{
    	return driver.findElement(Login);
    	}

    	}



