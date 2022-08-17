package selenium.learn;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Driver;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemo {

	static WebDriver driver ;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");

		driver = new ChromeDriver ();

		Thread.sleep (5000);

	}



	@AfterAll
	static void tearDownAfterClass() throws Exception {

		driver.close ();

	}

	@Test
	void fb () throws InterruptedException {

		driver.get("https://www.facebook.com/");

		driver.navigate().back ();


		Thread.sleep (3000);

	}

//@Disabled
	@Test 
	void google () throws Exception {
		driver.get("https://www.google.com/");


		driver.navigate().back ();


		Thread.sleep (3000);


	}
//@Disabled
	@Test
	void gmail () throws InterruptedException {
		driver.get("https://www.gmail.com/");

		Thread.sleep (3000);
	}
// @ Ignore // For Only J unit 3
	@Test
	void Twitter () throws InterruptedException {
		driver.get("https://twitter.com/i/flow/login");

		Thread.sleep (5000);
	}

}
