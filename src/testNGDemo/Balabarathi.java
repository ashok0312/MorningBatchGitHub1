package testNGDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Balabarathi {
	WebDriver driver ;
  @Test
  public void login() throws Exception {
	  driver.findElement(By.xpath("//*[@id=\"text-13263966988\"]")).sendKeys("ASHOK");
	  driver.findElement(By.xpath("//*[@id=\"text-241482569216\"]")).sendKeys("kumar Gudivada");
	  driver.findElement(By.xpath("//*[@id=\"text-23732060291\"]")).sendKeys("ashokgudivada@gmail.com");
	//  driver.findElement(By.xpath("//*[@id=\"erf_form_381\"]/div/div[5]/div/div/div/div[2]")).click();
	//  Thread.sleep(3000);
	 // driver.findElement(By.xpath("//*[@id=\"iti-item-in\"]/span[1]")).click();
	  //Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"field-DVYLZM9QELAAq8K\"]")).sendKeys("9966996666");
	  driver.findElement(By.xpath("//input[@id='field-krP8MPeuzRrukdo']")).sendKeys("sai mahal center");
	  driver.findElement(By.xpath("//input[@id='field-IQsTTT9SxEPs3LH']")).sendKeys("vuyyuru");
	  driver.findElement(By.xpath("//input[@id='field-2Ngu0gfcgyZYrFE']")).sendKeys("ap");
	  driver.findElement(By.xpath("//input[@id='field-5vlVJGcSKva7av0']")).sendKeys("521165");
	  new Select (driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("India");
	  driver.findElement(By.xpath("//textarea[@id='textarea-5589244956']")).sendKeys("hellooo Darling");
	  new Select (driver.findElement(By.xpath("//*[@id=\"field-rUN19TKpQsSOX3X\"]"))).selectByVisibleText("Ages 7-12 Years Stories For Reading Book");
	  driver.findElement(By.xpath("//textarea[@id='field-SUtF8PwfCXGXx46']")).sendKeys("hai ");
	//  driver.findElement(By.xpath("//*[@id=\"field-8lqEle2zeOhMu0a\"]")).sendKeys("C:\\Users\\LENOVO\\OneDrive\\Documents\\Custom Office Templates\\a.PNG");
      driver.findElement(By.xpath("//*[@id=\"field-8lqEle2zeOhMu0a\"]")).sendKeys("C:\\Users\\LENOVO\\OneDrive\\Documents\\Custom Office Templates\\a.PNG");
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  Thread.sleep(2000);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("http://baalabharathi.com/upload-story/");
	  
  }

}
