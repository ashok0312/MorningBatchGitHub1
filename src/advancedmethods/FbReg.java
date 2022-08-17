package advancedmethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class FbReg {
	WebDriver driver ;
  
  @BeforeClass
  public void beforeClass() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  Thread.sleep(2000);
	  driver =new ChromeDriver ();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
  @Test
  public void fbr() throws InterruptedException {
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
  }
  @Test
  public void fbrg() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.findElement(By.name("firstname")).sendKeys("don");
	  Thread.sleep(5000);
	  driver.findElement(By.name("lastname")).sendKeys("sandeep");
  }
  @Test
  public void fb1() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.findElement(By.id("u_2_g_9L")).sendKeys("9215454544");
	  Thread.sleep(5000);
	  driver.findElement(By.name("reg_passwd__")).sendKeys("sandeep@");
  }
  @Test
  public void fb2() throws InterruptedException {
	  Thread.sleep(2000);
	  new Select (driver.findElement(By.xpath("//*[@id=\"day\"]"))).selectByValue("9");
	  Thread.sleep(2000);
	  new Select (driver.findElement(By.xpath("//*[@id=\"month\"]"))).selectByVisibleText("Dec");
	  Thread.sleep(2000);
	  new Select (driver.findElement(By.xpath("//*[@id=\"year\"]"))).selectByValue("1991");
	  driver.findElement(By.xpath("//*[@id=\"u_e_o_ir\"]/span[2]/label")).click();
	  
  }


}
