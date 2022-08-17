package testNGDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataProvider2 {
	WebDriver driver ;
	String str ;
	@DataProvider (name= "datainput" )
	
	public String [][]login(){
		return new String [][] {
			{"ashok","ashok1817"},
			{"narasimha","narasimha0237"},
			{ "ashok", "9000109120" },
			{"ganesh","ganesh45"},
			{ "ravi", "123456789" },
			{"tarun","tarun117"},
			{"revanth","revanth123"},
			{"Chandra","Manual@2022"},
			{"sandeep","sandeep39"},
			{ "indraja", "9980251000"} 
			
			
		};
		
		
	}
	
  @Test(dataProvider="datainput")
  public void login(String user,String pass) throws Exception {
	  Thread.sleep(2000);

		driver.get("http://prakampanam.com/user");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys(user);
		 Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys(pass);  
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		 Thread.sleep(2000);
		
		try {
			driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
	  
	/*	
		driver .get("http://www.tirupatinews.in/wp-login.php?redirect_to=http%3A%2F%2Fwww.tirupatinews.in%2Fwp-admin%2F&reauth=1");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("log")).sendKeys(user);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("user_pass")).sendKeys(pass);
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("wp-submit")).click();
		
		Thread.sleep(3000);
		try {
		driver.findElement(By.cssSelector("div.wp-menu-name")).click();*/
		
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
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  Thread.sleep(2000);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  
  }

}
