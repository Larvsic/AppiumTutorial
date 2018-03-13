package luisMavenAppium.TestAppiumTutorial;

import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumTutorialGestures extends AppiumTutorialCapabilitiesInit{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> androidDriver=  Capabilities();
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		// Tap Gesture - TouchAction class 
		
		TouchAction touchAction = new TouchAction(androidDriver);
		touchAction.tap(androidDriver.findElementByXPath("//android.widget.TextView[9]")).perform();
		
		//touchAction.tap(androidDriver.findElementByXPath("//android.widget.TextView[0]")).perform();
		androidDriver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
		touchAction.longPress(androidDriver.findElementByXPath("//android.widget.TextView[@text='People Names']")).perform();
		//This could be also with .press"...".waitAction(3000).release().perform(); The number 3000 is 3 seconds
		
		System.out.println(androidDriver.findElementById("android:id/alertTitle").getText());
		
		//CORE gestures : Tap, Press and Release, Swipe, Drag and Drop, Scroll
		

	}

}
