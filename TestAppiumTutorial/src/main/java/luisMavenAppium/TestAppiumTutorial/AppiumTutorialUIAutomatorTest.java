package luisMavenAppium.TestAppiumTutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumTutorialUIAutomatorTest extends AppiumTutorialCapabilitiesInit {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> androidDriver = Capabilities();
		
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		androidDriver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Validate all clickable feature

		System.out.println(androidDriver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize());
		
	}

}
