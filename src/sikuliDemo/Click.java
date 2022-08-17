package sikuliDemo;

import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class Click {
	Screen s = new Screen ();
  @Test
  public void f() throws SikuliException {
	  s.click("C:\\Users\\LENOVO\\OneDrive\\Documents\\Custom Office Templates\\C.PNG");
	 // s.doubleClick("C:\\SikuliScreenShots\\Capture.PNG") ;
	  }
}
