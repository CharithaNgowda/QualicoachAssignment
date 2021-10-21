package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Base {
	
	public WebDriver driver;
	
	   
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis  = new FileInputStream("D:\\Selenium\\QualicoachE2E\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
	String browsername =prop.getProperty("browser");
	System.out.println(browsername);
	
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriverneww.exe");
		
		 driver =new ChromeDriver();
		//driver.get("https://test.qualicoach.org/admin/search.php");
	}
	
	else if(browsername.equals("mse"))
	{
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		 driver =new EdgeDriver();
	//	driver.get("https://test.qualicoach.org/admin/search.php");
	}
	
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	
		public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
			FileUtils.copyFile(source,new File(destinationFile));
			return destinationFile;


		}

}
