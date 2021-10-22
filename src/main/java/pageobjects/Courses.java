package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Courses {
	public WebDriver driver;
	    
	    By courses = By.xpath("//*[@id='page-admin-search']/section/div[2]/div/ul/li[3]/a");
	    By mcc = By.xpath("//a[text() = 'Manage courses and categories']");
	    By createnew = By.xpath("//a[text() = 'Create new category']");
	    By categoryname = By.id("id_name");
	    By cidno = By.id("id_idnumber");
	    By createcategory =  By.id("id_submitbutton");
	   
	    public Courses(WebDriver driver) {
	  	  this.driver = driver;
	    	
	    }
	         

	    public WebElement getcourses() {
	    
	    	return driver.findElement(courses);
	     }

	    public WebElement getmcc() {

	    	return driver.findElement(mcc);
	     }

	    public WebElement getcreatenew() {

	    	return driver.findElement(createnew);
	     }

	    public WebElement getcategoryname() {

	    	return driver.findElement(categoryname);
	     }
	    public WebElement getcidno() {

	    	return driver.findElement(cidno);
	     }


	    public WebElement getcreatecategory() {
	    	
	    	JavascriptExecutor  js = (JavascriptExecutor)driver;
	    	js.executeScript("window.scrollBy(400,2000)");
	    	return driver.findElement(createcategory);
	     }


}
