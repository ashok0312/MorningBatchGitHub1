package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Locators2 {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		
		driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception { 
	}

	@Test
	void id() throws Exception {
		driver.findElement(By.name("email")).sendKeys("ashokgudivada1817@gmail.com");
		
		Thread .sleep(2000);
		
		driver.findElement(By.name("pass")).sendKeys("");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click();
		
	
		
		}

}
