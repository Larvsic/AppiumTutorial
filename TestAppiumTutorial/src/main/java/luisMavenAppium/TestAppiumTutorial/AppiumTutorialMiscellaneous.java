package luisMavenAppium.TestAppiumTutorial;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class AppiumTutorialMiscellaneous extends AppiumTutorialCapabilitiesInit {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> androidDriver = Capabilities();
		
		System.out.println(androidDriver.currentActivity());
		
		System.out.println(androidDriver.getContext()); //views, native, hybrid, webview
		
		System.out.println(androidDriver.getOrientation());
		
		System.out.println(androidDriver.isLocked());
		
		//androidDriver.hideKeyboard(); is used when the keyboard is 
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		//This is how you can press the back button
		androidDriver.pressKeyCode(AndroidKeyCode.BACK);
		
		

	}

}
