package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG1 {

	WebDriver driver ;

	@BeforeTest
	public void beforeTest() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");

		driver = new ChromeDriver ();

		driver.manage().window().maximize();

		Thread.sleep(3000);
	}

	@Test
	public void zomoto() throws Exception {

		driver.get("http://zomato.com");
		Thread.sleep(3000);
	}


	@Test
	public void flipkart() throws Exception {

		Thread.sleep(3000);

		driver.get("http://flipkart.com");


	}

	@Test
	public void google() throws InterruptedException {


		driver.get("http://google.com");
		Thread.sleep(3000);
	}

	@Test
	public void swiggy() throws Exception {
		driver.get("http://swiggy.com");
		Thread.sleep(3000);
	}

	@Test
	public void seleniumlearn() throws Exception {

		driver.get("http://seleniumlearn.com");

		Thread.sleep(3000);
	}

	@Test
	public void seleniumdev() throws Exception {

		driver.get("http://selenium.dev");
		Thread.sleep(3000);

	}




	@AfterTest
	public void afterTest() {

		driver.close();
	}

}
