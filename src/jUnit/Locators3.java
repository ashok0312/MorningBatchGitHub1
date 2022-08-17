package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Locators3 {

	static WebDriver driver ;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.get("http://www.tirupatinews.in/wp-admin");

		Thread.sleep(3000);

	}



	@Test
	void cssSelector() throws Exception {
		
		driver.findElement(By.cssSelector(".input")).sendKeys("Chandra"); // cssSelector
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("user_pass")).sendKeys("Manual@2022");// id
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("wp-submit")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("wp-menu-name")).click();
		
		
	}

}
