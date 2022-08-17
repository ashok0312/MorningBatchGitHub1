package advancedmethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GetTextFB {
	WebDriver driver;
  @Test
  public void getTextFB() {
	  String obj = driver.findElement(By.id("reg_pages_msg")).getText();
	  System.out.println("Hello Text :"+obj);
  }
  
  @BeforeTest
  public void beforeTest() {
		
		 

			  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\LENOVO\\\\OneDrive\\\\Documents\\\\Lib\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com");
  }

}
