package advancedmethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class DropdownSelect {
	WebDriver driver ;
  @Test
  public void dropDownSelect() {
	  
	 // new Select (driver.findElement(By.xpath("//select[@id='transactionType']"))).selectByVisibleText("Developer");      //selectByVisibleText
	  
	  // new Select (driver.findElement(By.id("transactionType"))).selectByValue("2");    //selectByValue
	  
	  new Select (driver.findElement(By.xpath("//select[@id='transactionType']"))).selectByIndex(3);     //selectByIndex
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumlearn.com/program-drop-down-select-option");
  }

}
