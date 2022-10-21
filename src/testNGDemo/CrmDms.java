package testNGDemo;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class CrmDms {
	WebDriver driver ;
	String str ;
	@Test (priority =2)
	  public void LoginInValidUserID() throws Exception {
		  driver.findElement(By.xpath("//*[@id=\"s_swepi_1\"]")).sendKeys("GA4_1");
		  driver.findElement(By.xpath("//*[@id=\"s_swepi_2\"]")).sendKeys("Crm@6060");
		  driver.findElement(By.xpath("//*[@id=\"s_swepi_22\"]")).click();
		  String expError = "The user ID or password that you entered is incorrect. Please check the spelling and try again.(SBL-UIF-00272)";
		  Thread.sleep(2000);
		  System.out.println("expError : "+expError);
		  String actError = driver.findElement(By.xpath("//*[@id=\"statusBar\"]")).getText();
		  Thread.sleep(2000);
		  System.out.println("actError :"+ actError);
		  Assert.assertEquals(actError, expError);
		  
		  }
	  
  @Test(priority =1)
  public void LoginInValidPassword() throws Exception {
	  driver.findElement(By.xpath("//*[@id=\"s_swepi_1\"]")).sendKeys("GA4_1002600");
	  driver.findElement(By.xpath("//*[@id=\"s_swepi_2\"]")).sendKeys("Crm@122");
	  driver.findElement(By.xpath("//*[@id=\"s_swepi_22\"]")).click();
	  String expError = "The user ID or password that you entered is incorrect. Please check the spelling and try again.(SBL-UIF-00272)";
	  Thread.sleep(2000);
	  System.out.println("expError : "+expError);
	  String actError = driver.findElement(By.xpath("//*[@id=\"statusBar\"]")).getText();
	  Thread.sleep(2000);
	  System.out.println("actError :"+ actError);
	  Assert.assertEquals(actError, expError);
	  
	  }
  @Test (priority =3)
  public void LoginValidUserIdAndPassword() throws Exception {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"s_swepi_1\"]")).sendKeys("GA4_1002600");
	  driver.findElement(By.xpath("//*[@id=\"s_swepi_2\"]")).sendKeys("sEP@2020");
	  driver.findElement(By.xpath("//*[@id=\"s_swepi_22\"]")).click();
	  Thread.sleep(5000);
	 String expError = "Welcome Back GUDIVADA ASHOK KUMAR of JASPER INDUSTRIES PVT. LTD.. You last accessed on";
	Thread.sleep(2000);
	 System.out.println("expError : "+expError);
	 String actError = driver.findElement(By.xpath("//*[@id=\"s_3_l_salutation\"]/div/div")).getText();
	 Thread.sleep(2000);
	 System.out.println("actError :"+ actError);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"tb_0\"]")).click();
	  try {
	  driver.findElement(By.xpath("//*[@id=\"tb_item_4\"]/button")).click();
	  str = "Pass";
	  System.out.println(str);
	  }
	  catch (Exception e) 
	  {
		  str = "Fali";
		  System.out.println(str);
	  }
	  
	  
	  }
  @Test (priority =0)
  public void IsSlected () {
	  boolean rememberme = driver.findElement(By.xpath("//*[@id=\"s_swepi_3\"]")).isSelected();
	if  (rememberme ==true)
	{
		System.out.println("isSelected");
		}
	else 
	{
		System.out.println("Is Not isSelected");
		
	}
	  
	  
  }
  @Test (priority=4,enabled=true)
  public void TabVehicle () throws Exception {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"s_swepi_1\"]")).sendKeys("GA4_1002600");
	  driver.findElement(By.xpath("//*[@id=\"s_swepi_2\"]")).sendKeys("sEP@2022");
	  driver.findElement(By.xpath("//*[@id=\"s_swepi_22\"]")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"s_sctrl\"]/div/ul/li[6]/a/span")).click();
	  Thread.sleep(5000);
	  new Select (driver.findElement(By.xpath("//*[@name=\"s_vis_div\" and @title='Visibility']"))).selectByVisibleText("All Visible Vehicles");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", ".\\Browsers\\chromedriver.exe" );
	  driver =new ChromeDriver ();
	  driver.manage().window().maximize();
	  driver.get("https://crmdms.inservices.tatamotors.com/siebel/app/workshop/enu?SWECmd=Start");
	  
			  }

}
