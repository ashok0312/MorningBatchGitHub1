package testNGDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class TestNGDataprovider {

	WebDriver driver ;

	public String str;

	@DataProvider (name="datainput")
	public String[][]login(){

		return new String [][] {

			{ "ashok", "InValidPassword" }, 
			{ "ashok", "9000109120" },
			{ "chandra", "ABCDEF" },
			{ "ravi", "123456789" },
			{ "hari", "ABCDEFGHI" },
			{ "indraja", "9980251000"} 

		};	

	} 

	@Test(dataProvider="datainput")
	public void login(String user,String pass) throws Exception {

		Thread.sleep(2000);

		driver.get("http://prakampanam.com/user");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys(user);
		driver.findElement(By.name("pass")).sendKeys(pass);  
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		
		try {
			driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
			str ="Pass";
			System.out.println(str);
			
		}
		
		catch (Exception e)
	
		{
			str ="Fail";
					System.out.println(str);
		}

	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}

