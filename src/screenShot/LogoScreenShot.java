package screenShot;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogoScreenShot {
	WebDriver driver;


	@SuppressWarnings("unused")
	@Test 
	public void TakeScreenShot() throws Exception{
		driver.get("http://seleniumlearn.com/");
		Thread.sleep(7000);
		WebElement screen = driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img"));
		
		Thread.sleep(5000);

		   File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         FileHandler.copy(f, new File("C:\\Screenshot\\logo2.PNG"));
	}


	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
