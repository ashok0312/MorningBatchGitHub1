package advancedActionClasses;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class DragAndDrop2 {
	WebDriver driver ;
  @Test
  public void rightClick() throws InterruptedException {
	  
	  Actions ashok =new Actions (driver);
	  Thread.sleep(1000);
	  WebElement vignesh =driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  Thread.sleep(1000);
	  WebElement reventh = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	  Thread.sleep(1000);
	  ashok.dragAndDrop(vignesh, reventh).build().perform();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	driver=new ChromeDriver ();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
	Thread.sleep(3000);
  }

}
