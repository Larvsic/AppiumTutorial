package luisMavenAppium.TestAppiumTutorial;

import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumTutorialDragAndDrop extends AppiumTutorialCapabilitiesInit {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> androidDriver = Capabilities();
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		TouchAction touchAction = new TouchAction(androidDriver);
		touchAction.longPress(androidDriver.findElementById("io.appium.android.apis:id/drag_dot_1")).moveTo(androidDriver.findElementById("io.appium.android.apis:id/drag_dot_3")).release().perform();
	}

}
