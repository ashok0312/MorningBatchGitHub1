package advancedmethods;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertboxClickEnterDon {
	WebDriver driver ;
  @Test
  public void clickAndEnter() throws Exception {
	  
	 driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(5000);
	
	Alert alt =  driver.switchTo().alert();
	  Thread.sleep(1000);
	  alt.sendKeys("Don");
	  Thread.sleep(3000);
	  alt.accept();
  }
  @BeforeTest
  public void beforeTest() throws Exception  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  driver =new ChromeDriver ();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("http://seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(7000);
	  JavascriptExecutor ashok = (JavascriptExecutor)driver;
	  ashok.executeScript("scroll(0,700)");
  }

}
