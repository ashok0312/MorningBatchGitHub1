package selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpath {
	
	static WebDriver driver ;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		
		driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("http://seleniumlearn.com/user");
		
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("Chandra"); //inspectCopyFullPath
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("ChandraDon");  //inspectCopyXpath
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='edit-captcha-response']")).sendKeys("15"); //selectorHub
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();  // ownCode
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='edit-name']")).clear(); //selectorHub 
		
		Thread.sleep(4000);
		
		driver.close();
	

	}
}