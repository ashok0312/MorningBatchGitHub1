package dataDrivenFrameWorks;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsSelected {
	WebDriver driver ;
  @Test
  public void f() {
	  driver.get("http://www.tirupatinews.in/wp-admin");
	//  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	  
	  boolean rememberme =  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
	if  (rememberme==true)
	{
		  System.out.println("checkbox is selsected");	
	  }
		  else {
			  System.out.println("checkbox is not selsected");
		  }
		  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", ".\\Browsers\\chromedriver.exe");
	  driver =new ChromeDriver ();
	  driver.manage().window().maximize();
  }

}
