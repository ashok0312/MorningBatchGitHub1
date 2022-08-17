package testNGDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class EnabledDiscriptiontimeout {
	
	WebDriver driver ;
 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  
	  driver  = new ChromeDriver ();
	  
	  driver.manage().window().maximize();
	  
	  Thread.sleep(2000);
  }
  
  @Test(priority=1)
  public void zomato() throws Exception {
	  driver.get("http://zomato.com");
	  Thread.sleep(2000);
  }
  
  @Test(description="swiggy.com",priority=2,timeOut=6000)    //swiggy url open in 4 sec you will give lessthan 4 sec it is failure
  public void swiggy() throws Exception {
	  
	  driver.get("http://swiggy.com");
	  Thread.sleep(2000);
  }
  
  @Test(description="gmail.com",priority=3)
  public void gmail() throws Exception {
	  
	  driver.get("http://gmail.com");
	  Thread.sleep(2000);
  }
  @Test(description="amazon.com",priority=4)
  public void amazon() throws Exception {
	  driver.get("http://amazon.com");
	  Thread.sleep(2000);
  }
  @Test(enabled=false,priority=0)
  public void close() throws Exception {
	  driver.get("http://seleniumlearn.com");
	  Thread.sleep(3000);
  }

  @AfterTest
  public void seleniumlearn() {
	  
	  driver.close();
	  
  }
}
