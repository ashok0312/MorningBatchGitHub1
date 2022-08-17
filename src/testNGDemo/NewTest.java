package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver ;
	
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  
	  driver = new ChromeDriver () ;
	  
	  driver.manage().window().maximize();
	  
	  Thread.sleep(3000);
  }
  
  @Test
  public void twitter() {
	  
	  driver.get("http://WWW.twitter.com");
  }
  
  @Test
  public void facebook() {
	  
	  driver.get("http://WWW.twitter.com");
  }

  
  @Test
  public void google() {
  }

  
  @Test
  public void zomoto() {
  }

  
  @Test
  public void flipcart() {
  }

  
  @Test
  public void amazon() {
  }


  @AfterTest
  public void afterTest() {
  }

}
