package luisMavenAppium.TestAppiumTutorial;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumTurotialScroll extends AppiumTutorialCapabilitiesInit {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> androidDriver = Capabilities();
		
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		//SCROLL untill find
		//There is not direct method to specify scroll. such as swipe
		//This is using Adnroid API inside Appium API
		androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"); //This sentence scroll untill find WebView
		
		
		
		

	}

}
