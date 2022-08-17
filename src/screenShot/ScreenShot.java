package screenShot;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v103.database.Database;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShot {

	WebDriver driver;

	public void Screenshot() throws IOException {
	//	DateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		//Date date = new Date();
	//	String time = dateFormat.format(date);
	
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(f,new File("C:\\Screenshot\\g.PNG" ));

	}

	@Test
	public void seleniumlearn() throws Exception {
		driver.get("http://seleniumlearn.com");
		Thread.sleep(2000);
		Screenshot();
	}
	
	@Test
	public void google() throws Exception {
		driver.get("http://google.com");
		Thread.sleep(2000);
		Screenshot();
		
		driver.findElement(By.name("q")).sendKeys("Screenshot using Selenium"+Keys.ENTER);
		Screenshot();
		
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


	
}
