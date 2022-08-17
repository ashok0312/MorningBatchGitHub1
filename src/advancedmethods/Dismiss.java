package advancedmethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Dismiss {
	WebDriver driver ;
  @Test
  public void dismiss() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(4000);
	  driver.switchTo().alert().dismiss();
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(3000);
	
		JavascriptExecutor ashok = (JavascriptExecutor)driver;
		  ashok.executeScript("scroll(0,500)");

  }

}
