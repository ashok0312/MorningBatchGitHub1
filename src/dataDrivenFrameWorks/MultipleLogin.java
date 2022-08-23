package dataDrivenFrameWorks;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class MultipleLogin {
	WebDriver driver;	


	@Test
	public void LoginRetesting() throws Exception{
		
		driver.get("http://www.prakampanam.com/user");	
		
		Thread.sleep(3000);
		FileInputStream fi=new FileInputStream("C:\\Users\\LENOVO\\datadrivenfolder\\multiplelogin.xls");
		Workbook w=Workbook.getWorkbook(fi);
		Sheet s=w.getSheet("Sheet1");
		
		for(int i=1; i < s.getRows(); i++)
		{	
			driver.findElement(By.id("edit-name")).clear();
			driver.findElement(By.id("edit-name")).sendKeys(s.getCell(0, i).getContents());
			driver.findElement(By.id("edit-pass")).sendKeys(s.getCell(1, i).getContents());
			driver.findElement(By.id("edit-submit")).click();
			Thread.sleep(5000);
			try{
				Thread.sleep(3000);
				driver.findElement(By.linkText("Log out")).click();
				System.out.println("Pass");
			}
			catch(Exception e)
			{
				System.out.println("Fail");
			}
		}    
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:.\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}

