package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestNGxml2 {
	WebDriver driver ;

  @BeforeClass (groups="regression")
  public void beforeClass() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	driver=new ChromeDriver ();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("http://www.seleniumlearn.com/user");
	Thread.sleep(2000);
  }
  
  @Test (priority=0,groups="regression")
  public void loginID() throws Exception {
	  driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys("love you DAD");
	  Thread.sleep(2000);
  }
  
  @Test(priority=1,groups="regression")
  public void password() throws Exception {
	  driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("Dad143");
	  Thread.sleep(2000);
  }
  
  @Test(priority=2,groups="regression")
  public void captcha() throws Exception {
	  
	  driver.findElement(By.name("captcha_response")).sendKeys("143");
	  Thread.sleep(2000);
	  
  }
  
  @Test(priority=3,groups="regression")
  public void login() throws Exception {
	  driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=4,groups="sanity")
  public void google() {
	  driver.get("https://google.com");
  }
  
  @Test(priority=5,groups="sanity")
  public void amazon() {
	  driver.get("https://amazon.com");
	  
  }
  
  
  @Test(priority=6,groups="sanity")
  public void flipkart() {
	  driver.get("https://flipkart.com");
  }
  
  

}
