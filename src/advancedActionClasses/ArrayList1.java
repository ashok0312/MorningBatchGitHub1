package advancedActionClasses;
import java.util.ArrayList;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ArrayList1 {
	WebDriver driver;

	@Test
	public void newTabinBrowser() throws Exception{
		driver.get("https://irctc.co.in/");
		Thread.sleep(7000);
		driver.findElement(By.linkText("e-Catering")).click();
		
		ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(1));
		
		driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/div[1]/div[1]/div/div/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("mobileNum")).sendKeys("9000109120");
		driver.findElement(By.name("email")).sendKeys("techlearn.india@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div/div[2]/div/form/div[2]/button[2]")).click();
		Thread.sleep(3000);
		ArrayList<String> firsttab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(firsttab.get(0));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}