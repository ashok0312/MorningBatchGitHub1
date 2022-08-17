package advancedActionClasses;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageScreenShot {
	WebDriver driver;
	
		@Test
		public void fullPageScreenshot() throws IOException, InterruptedException {
			driver.get("http://seleniumlearn.com/selenium-tutorial");
			Thread.sleep(3000);
	
			Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			Thread.sleep(3000);
			ImageIO.write(s.getImage(), "PNG", new File("C:\\Screenshot.png"));
}
		
		@BeforeTest
		  public void beforeTest() throws Exception {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
			driver=new ChromeDriver ();
			driver.manage().window().maximize();
			Thread.sleep(3000);
		
		  }
}

