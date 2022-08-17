package sikuliDemo;

import org.testng.annotations.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class Sikuli1 {
	Screen s = new Screen ();
	@Test
	public void windows () throws FindFailed, Exception {
	//s.click("C:\\Users\\LENOVO\\OneDrive\\Documents\\Custom Office Templates\\a.PNG");
		//s.click("C:\\Users\\LENOVO\\OneDrive\\Documents\\Custom Office Templates\\a.PNG");
		s.doubleClick("C:\\SikuliScreenShots\\Capture.PNG") ;
		s.dragDrop("C:\\Users\\LENOVO\\OneDrive\\Documents\\Custom Office Templates\\aa.PNG", "C:\\Users\\LENOVO\\OneDrive\\Documents\\Custom Office Templates\\e.PNG");
	}
	@BeforeTest
	public void beforeTest() {
	}

}
