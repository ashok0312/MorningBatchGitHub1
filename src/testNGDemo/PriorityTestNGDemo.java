package testNGDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PriorityTestNGDemo {
	
	WebDriver driver ;
 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  
	  driver  = new ChromeDriver ();
	  
	  driver.manage().window().maximize();
	  
	  Thread.sleep(2000);
  }
  
  @Test(priority=1)
  public void zomato() {
	  driver.get("http://zomato.com");
  }
  
  @Test(priority=2)
  public void swiggy() throws Exception {
	  
	  driver.get("http://swiggy.com");
	  Thread.sleep(2000);
  }
  
  @Test(priority=3)
  public void gmail() throws Exception {
	  
	  driver.get("http://gmail.com");
	  Thread.sleep(2000);
  }
  @Test(priority=4)
  public void amazon() throws Exception {
	  driver.get("http://amazon.com");
	  Thread.sleep(2000);
  }
  @Test(priority=0)
  public void seleniumlearn() throws Exception {
	  driver.get("http://seleniumlearn.com");
	  Thread.sleep(3000);
  }

}
