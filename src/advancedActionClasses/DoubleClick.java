package advancedActionClasses;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class DoubleClick {
	WebDriver driver ;
  @Test
  public void mousehover () throws InterruptedException {
	  
	  Actions ashok =new Actions (driver);
	  Thread.sleep(1000);
	  ashok.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-336-1\"]/a"))).build().perform();
	  Thread.sleep(1000);
	  ashok.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Selenium Quiz']"))).click().perform();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	driver=new ChromeDriver ();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("http://seleniumlearn.com/double-click");
	Thread.sleep(2000);
	
  }

}
