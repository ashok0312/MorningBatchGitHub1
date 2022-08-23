package testNGDemo;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Instagram {
	WebDriver driver ;
  @Test
  public void login() throws Exception {
	  driver.get("https://www.instagram.com/accounts/login/"); 
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("ashokgudivada1817@gmail.com");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("annA143143");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
	  String expError = "Sorry, your password was incorrect. Please double-check your password.";
	  Thread.sleep(3000);
	  System.out.println("expected error"+expError);
	  Thread.sleep(3000);
	  String actError = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div[2]/form/div[2]/p")).getText();
	  System.out.println("actualresult"+ actError);
	  Assert.assertEquals(actError, expError);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", ".\\Browsers\\chromedriver.exe");
	  driver =new ChromeDriver ();
	  driver.manage().window().maximize();
  }

}
