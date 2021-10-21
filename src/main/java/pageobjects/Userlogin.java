package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Userlogin {
	public WebDriver driver;
	  
    By username = By.id("username");
    By password = By.id("password");
    By Login = By.id("loginbtn");
    
    public Userlogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
			this.driver =driver;
	}


        public WebElement getUser() {

    	 return driver.findElement(username);
    	   
    	 }
    	         
    	 public WebElement getPassword()
    	 {
    	 return driver.findElement(password);
    	 }

    	 public WebElement getLogin()
    	 {
    	 return driver.findElement(Login);
    	 }


}
