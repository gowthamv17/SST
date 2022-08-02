package revit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Login {

	public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {
		DesktopOptions option1 = new DesktopOptions();
        option1.setApplicationPath("C:\\Program Files\\Autodesk\\Revit 2018\\Revit.exe");
        WiniumDriver driver2 = new WiniumDriver(new URL("http://localhost:9999"), option1);
        Thread.sleep(40000);

        Robot keyss = new Robot();
        keyss.keyPress(KeyEvent.VK_CONTROL);
        keyss.keyPress(KeyEvent.VK_N);
       // keyss.keyPress(KeyEvent.VK_ENTER);
        keyss.keyRelease(KeyEvent.VK_CONTROL);
        keyss.keyRelease(KeyEvent.VK_N);
       keyss.keyPress(KeyEvent.VK_ENTER);
       
//       Thread.sleep(10000);
//       
//       keyss.keyPress(KeyEvent.VK_CONTROL);
//       keyss.keyPress(KeyEvent.VK_S);
//       keyss.keyRelease(KeyEvent.VK_CONTROL);
//       keyss.keyRelease(KeyEvent.VK_S);
//       driver2.findElementById("1001").sendKeys("test11");
//       driver2.findElementById("1").click();
//       Thread.sleep(5000);
//        
	}

}
