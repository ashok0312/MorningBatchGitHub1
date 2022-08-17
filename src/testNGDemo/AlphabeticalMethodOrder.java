package testNGDemo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class AlphabeticalMethodOrder {

	//WebDriver driver ;

	@BeforeTest
	public void beforeTest() {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Lib\\chromedriver.exe");

		//driver=new ChromeDriver () ;

		//driver.manage().window().maximize();
		
		System.out.println("@beforeTest");

	}

	@Test
	public void testcas1() {
		System.out.println("@testcas1");
	}
	@Test
	public void testcase2() {
		System.out.println("@testcase2");
	}




	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}


	@AfterMethod
	public void afterMethod() {
		System.out.println("@afterMethod");
	}


	@BeforeClass
	public void beforeClass() {
		System.out.println("@beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}



	@AfterTest
	public void afterTest() { 
		System.out.println("@AfterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}

}
