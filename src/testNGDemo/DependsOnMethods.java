package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DependsOnMethods {
	WebDriver driver ;
  
  @BeforeTest
  public void beforeTest() throws Exception {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  
	  driver  = new ChromeDriver ();
	  
	  driver.manage().window().maximize();
	  
	  Thread.sleep(2000);
	  
  }

  @Test(dependsOnMethods="method1")
  public void method2() {
	  
	driver.findElement(By.name("q")).sendKeys("AshokKumarG");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
  
  @Test
  public void method1() {
	  
	  driver.get("http://google.com");
  }
  
  
  /*@AfterTest
  public void afterTest() {
	  driver.quit();
  }*/

}
