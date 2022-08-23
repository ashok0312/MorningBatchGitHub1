package dataDrivenFrameWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IsDisabled {
	WebDriver driver ;
	  @Test
	  public void f() {
		  driver.get("http://www.tirupatinews.in/wp-admin");
		//  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		  
		/*  boolean rememberme =  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isDisplayed();
		if  (rememberme==true)
		{
			  System.out.println("checkbox is Displayed");	
		  }
			  else {
				  System.out.println("checkbox is not Displayed");
			  }*/
		  boolean rememberme =  driver.findElement(By.xpath("//*[@id=\"login\"]/h1/a")).isDisplayed();
			if  (rememberme==true)
			{
				  System.out.println("checkbox is Displayed logo");	
			  }
				  else {
					  System.out.println("checkbox is not Displayed logo");
				  }
				  
			  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", ".\\Browsers\\chromedriver.exe");
		  driver =new ChromeDriver ();
		  driver.manage().window().maximize();
	  }

	}
