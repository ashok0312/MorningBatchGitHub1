package selenium.learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators5to8 {
	
	static WebDriver driver ;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		
		driver = new ChromeDriver () ;
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("http://seleniumlearn.com/");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Java")).click();
		
		driver.findElement(By.partialLinkText("all ")).click();
		
	//	List<WebElement>googlelinks = driver.findElements(By.tagName("a"));
		
	//	System.out.println("googlelinks ="+ googlelinks.size());
		

	}

}
