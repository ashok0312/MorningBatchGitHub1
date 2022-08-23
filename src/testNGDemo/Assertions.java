package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertions {
	WebDriver driver ;
 
  @Test
  public void assertions () {
	  driver.get("http://www.tirupatinews.in/");
	//  String expTitle = "Ashok";
	  String expTitle = "Mytri";
	  System.out.println("Expected Website Title is-"+expTitle);
	  String actTitle = driver.getTitle();
	  System.out.println("Actual Website Title is -"+actTitle);
	  Assert.assertEquals(actTitle, expTitle);
  }
  
  @Test
  public void verifyURl() {
	  driver.get("http://www.tirupatinews.in/");
	  String expURL= "http://www.tirupatinews.in/";
	  System.out.println("Expected Website Title is-"+expURL);
	  String actURL = driver.getCurrentUrl();

		System.out.println("Actual Website URL is -"+actURL);
		
		Assert.assertEquals(actURL, expURL);
	  
  }
	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");

		driver=new ChromeDriver () ;

		driver.manage().window().maximize();
	}
}
