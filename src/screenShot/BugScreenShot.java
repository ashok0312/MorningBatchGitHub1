package screenShot;




import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BugScreenShot {
	WebDriver driver;
	//private Object screenshotFile;


	@Test 
	public void TakeScreenshot() throws Exception {      
		driver.get("https://www.google.com/");
		try {                
			driver.findElement(By.name("q")).sendKeys("Vinayaka chavithi Date in 2022");			
			driver.findElement(By.name("aaaaaa")).sendKeys(Keys.ENTER);
			}
		catch(Exception e) {      
	 
			takeScreenshot();       
		}      
	}
	
	 public void takeScreenshot() throws Exception {              
         File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileHandler.copy(f, new File("C:\\Screenshot\\googlesearch.png")); //Linux path     
        
      }
	 
	 
	@BeforeTest
	  public void beforeTest() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver ();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	  }
	

}
