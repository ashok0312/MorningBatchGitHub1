package selenium.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsersLaunch {
	static WebDriver driver ;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		

	}

}
