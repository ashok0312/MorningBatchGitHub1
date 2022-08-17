package advancedmethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GetText {
	WebDriver driver ;
  @Test
  public void getTex() {
	  
	 String obj =  driver .findElement(By.xpath("//*[@id=\"reg_pages_msg\"]")).getText();
	 System.out.println("hai :"+ obj );
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");

		driver=new ChromeDriver () ;

		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
  }

}
