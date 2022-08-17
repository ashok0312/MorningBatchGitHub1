package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Locaters {

	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");

		driver=new ChromeDriver ();
		Thread .sleep(3000);
		driver.manage().window().maximize();

		driver.get("http://seleniumlearn.com/user");
	}

	@Test 
	void id() throws Exception {

		driver.findElement(By.id("edit-name")).sendKeys("DonChandra");

		Thread.sleep(2000);

		driver.findElement(By.name("pass")).sendKeys("Don");

		//Thread.sleep(2000);

	}

	@Test //name
	void name() throws Exception {

		driver.findElement(By.name("captcha_response")).sendKeys("15");

		Thread.sleep(2000);
		


	// driver.findElement(By.id("edit-submit")).click();
		
	

	//	Thread.sleep(2000);

	//driver.findElement(By.id("edit-name")).clear();



	}
	
	//@Disabled
	@Test 
	void cssS() throws Exception {

	//	driver.findElement(By.cssSelector("input.form-submit")).click(); 
		
   driver.findElement(By.cssSelector("input.form-submit")).click();  

	//	Thread.sleep(2000);
		
		//driver.findElement(By.id("edit-name")).clear();
		
		


	}
}
