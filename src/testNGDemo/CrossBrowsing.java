package testNGDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CrossBrowsing {
public WebDriver driver;


	
    @Parameters({ "browser" })   
    @BeforeTest
    public void openBrowser(String browser) throws InterruptedException {

        try {

        	if (browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
                driver = new ChromeDriver();
                Thread.sleep(2000);
                driver.manage().window().maximize();
                Thread.sleep(2000);
        	}
           else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\geckodriver.exe");
                Thread.sleep(2000);
                driver = new FirefoxDriver();
                Thread.sleep(2000);
                driver.manage().window().maximize();
              	
              } 
             
            /*        
            else if (browser.equalsIgnoreCase("Edge")) {
                System.setProperty("webdriver.edge.driver", "F:\\lib\\msedgedriver.exe");
    		driver = new EdgeDriver();
            }
            
               else if (browser.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver","D:\\lib\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }

            else if (browser.equalsIgnoreCase("opera")) {
                System.setProperty("webdriver.opera.driver","D:\\lib\\operadriver.exe");  //--->IE for Windows path
                driver=new OperaDriver();
             }

        else (browser.equalsIgnoreCase("safari")) {
            System.setProperty("webdriver.safari.driver", "D:\\lib\\safariDriver.exe"); //To stop uninstall each time
             driver = new SafariDriver();
             }*/

        } 
        catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void Run() throws Exception {
     
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Cross Browser Testing in TestNG"+Keys.ENTER);
        Thread.sleep(5000);
       
       // driver.close();
    }
}