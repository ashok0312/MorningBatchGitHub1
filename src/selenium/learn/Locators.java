package selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	static WebDriver driver ;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		
		driver = new ChromeDriver ();
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver .get("http://www.tirupatinews.in/wp-login.php?redirect_to=http%3A%2F%2Fwww.tirupatinews.in%2Fwp-admin%2F&reauth=1");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("log")).sendKeys("Chandra");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("user_pass")).sendKeys("Manual@2022");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("wp-submit")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div.wp-menu-name")).click();
		
		

	}

}
