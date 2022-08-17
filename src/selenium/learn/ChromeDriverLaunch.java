package selenium.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverLaunch {

	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");

		driver = new ChromeDriver ();	

		//	public static void main(String[] args) throws InterruptedException {


		//	System.setProperty("webdriver.gecho.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\geckodriver.exe");

		//	driver = new FirefoxDriver ();	

		Thread . sleep (5000);

		driver.manage ().window().maximize();

		Thread . sleep (5000);

		//	driver.manage ().window().minimize();

		//Thread . sleep (5000);

		driver . get ("https://www.google.com/");

		Thread . sleep (5000);

		driver . navigate ().to("https://www.facebook.com/");
		Thread . sleep (5000);

		driver . navigate ().back();
		Thread . sleep (5000);

		driver . navigate ().forward();
		Thread . sleep (5000);

		driver . navigate ().refresh();

		driver.close();


	}

}
