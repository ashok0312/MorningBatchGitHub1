package advancedActionClasses;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RightClick {
	WebDriver driver ;
  @Test
  public void rightClick() throws InterruptedException {
	  
	  Actions ashok =new Actions (driver);
	  Thread.sleep(3000);
	  ashok.contextClick(driver.findElement(By.xpath("//a[normalize-space()='Linux']"))).build().perform();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	driver=new ChromeDriver ();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("http://seleniumlearn.com/selenium-advanced");
	Thread.sleep(2000);
  }

}
