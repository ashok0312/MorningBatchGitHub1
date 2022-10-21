package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Twitter {
	WebDriver driver ;
  @Test
  public void url() throws Exception {
	  driver.get("https://twitter.com/i/flow/login");
	  Thread.sleep(3000);
	  
  }
  @Test
  public void login()throws Exception {
	  Thread.sleep(6000);
	//  driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input")).sendKeys("ashokgudivada0276@gmail.com");
	 driver.findElement(By.name("text")).sendKeys("ashokgudivada0276@gmail.com");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div")).click();
	  Thread.sleep(5000);
	  }
  @Test
  public void login2() throws Exception {
	  driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input")).sendKeys("haidarling");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div")).click();
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", ".\\Browsers\\chromedriver.exe");
	  driver =new ChromeDriver ();
	  driver.manage().window().maximize();
  }
}
