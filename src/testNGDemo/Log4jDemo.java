package testNGDemo;

import org.testng.annotations.Test;

import jline.internal.Log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Log4jDemo {
	WebDriver driver ;
  @Test
  public void Log4j() throws Exception {
	  Logger log = Logger.getLogger("Ashok");
	  PropertyConfigurator.configure("Log4j.properties");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  
	  driver  = new ChromeDriver ();
	 log.info("to lanch chrome browser");
	  
	  driver.manage().window().maximize();
	  log.info("to maximize window");
	  
	  Thread.sleep(2000);
  }
 

}
