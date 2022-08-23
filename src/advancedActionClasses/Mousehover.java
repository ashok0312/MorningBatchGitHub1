package advancedActionClasses;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Mousehover {
	WebDriver driver;

	@Test
	public void mouseover() throws Exception {
		driver.get("http://seleniumlearn.com/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("menu-336-1"))).build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.linkText("Useful Information"))).click().perform();

	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ".\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}