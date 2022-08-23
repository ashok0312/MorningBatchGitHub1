package dataDrivenFrameWorks;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

public class LoginSingleUser {
	WebDriver driver;

	@Test
	public void ReadData() throws IOException, JXLException {
		driver.get("http://prakampanam.com/user");

		FileInputStream fi = new FileInputStream("C:\\Users\\LENOVO\\datadrivenfolder\\datadrivenexel.xls"); // Here your xls path.
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet(0);

		driver.findElement(By.id("edit-name")).sendKeys(s.getCell(0, 1).getContents());
		driver.findElement(By.id("edit-pass")).sendKeys(s.getCell(1, 1).getContents());
		driver.findElement(By.id("edit-submit")).click();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:.\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
