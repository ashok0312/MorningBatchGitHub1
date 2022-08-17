package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemoFb {

	static WebDriver driver ;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver =new ChromeDriver ();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() throws Exception {

		driver.findElement(By.name("email")).sendKeys("Muthu");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("9052706004");
		Thread.sleep(2000);

		driver.findElement(By.name("login")).click();

	}

}
