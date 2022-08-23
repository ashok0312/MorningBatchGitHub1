package dataDrivenFrameWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IsEnabled {
	WebDriver driver ;
	  @Test
	  public void f() {
		  driver.get("http://www.tirupatinews.in/wp-admin");
		//  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		  
		  boolean rememberme =  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();
		if  (rememberme==true)
		{
			  System.out.println("checkbox is Enabled");	
		  }
			  else {
				  System.out.println("checkbox is not Enabled");
			  }
			  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", ".\\Browsers\\chromedriver.exe");
		  driver =new ChromeDriver ();
		  driver.manage().window().maximize();
	  }

	}
