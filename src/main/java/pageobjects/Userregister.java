package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Userregister {
	public WebDriver driver;
	
	
	By user = By.xpath("//a[text() = 'Users']");
		By newuser = By.xpath("//a[text() = 'Add a new user']");
        By Createuser= By.id("id_submitbutton");
        By username  = By.id("id_username");
       By password1 = By.id("id_newpassword");
        By password = By.xpath("//span/em[contains(text(),'Click to enter text')]");
       
        By firstname = By.id("id_firstname");
        By lastname = By.id("id_lastname");
     
        By emailid = By.xpath(" //*[@id=\"id_email\"]");
        
    
      
        
        
        
        public Userregister(WebDriver driver) {
	        this.driver = driver;
	    }
	
	
	public WebElement getuser() {

	return driver.findElement(user);

	    }
	
	public WebElement getnewuser()
	{
       return driver.findElement(newuser);

	 }
	
	public WebElement getusername()
	{
		return driver.findElement(username);
		
	}
	
	
	public WebElement getpassword()
	{
		//driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
	//	JavascriptExecutor  js = (JavascriptExecutor)driver;
	//	js.executeScript("window.scrollBy(180,9000)");
       return driver.findElement(password);

	 }
	public WebElement getpassword1()
	{
		return driver.findElement(password1);
	}
	
	public WebElement getfirstname()
	{
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(200,600)");
       return driver.findElement(firstname);

	 }
	
	public WebElement getlastname()
	{

	
       return driver.findElement(lastname);

	 }
	
	public WebElement getemailid()
	{
	
       return driver.findElement(emailid);

	 }
	
	
	
      public WebElement Createuser() {
		
    
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(471,2032)");
		
		return driver.findElement(Createuser);

		    }
	
	
}
