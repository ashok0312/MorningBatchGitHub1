package advancedmethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PopupAlertBox {
	WebDriver driver ;
	
  @Test
  public void popupAlertBox() throws Exception {
/*	//  driver.findElement(By.xpath("//*[@id=\"sel-blocks\"]/div[5]/div[3]/span[3]/a")).click();     //selenium advanced not working
	//  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(1000);
	  driver.switchTo().alert().accept();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  driver =new ChromeDriver ();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("http://www.seleniumlearn.com/how-handle-alert-box-using-selenium");
	  Thread.sleep(1000);
  }*/
	  
	  driver.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();  
		driver.switchTo().alert().accept(); // Ok button click on alert window
	}

	@BeforeTest
	public void beforeTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumlearn.com/how-handle-alert-box-using-selenium");
		Thread.sleep(3000);		
		JavascriptExecutor ashok = (JavascriptExecutor)driver;
		  ashok.executeScript("scroll(0,500)");

	}
}
