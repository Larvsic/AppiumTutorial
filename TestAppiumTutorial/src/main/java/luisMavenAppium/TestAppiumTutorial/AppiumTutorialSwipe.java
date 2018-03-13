package luisMavenAppium.TestAppiumTutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumTutorialSwipe extends AppiumTutorialCapabilitiesInit {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> androidDriver = Capabilities();
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		androidDriver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		
		//androidDriver.findElementByXPath("//*[@content-desc='Control deslizante circular de horas: 1']").click();	//not performed. In another app is probably working
		TouchAction touchAction = new TouchAction(androidDriver);
		
		touchAction.press(androidDriver.findElementByClassName("android.view.View")).moveTo(267, 777).perform();		
	
		System.out.println("YA se ejecutó el primer swipe");
		Thread.sleep(5000L);
		System.out.println("Va el segundo");
		touchAction.press(androidDriver.findElementByClassName("android.view.View")).moveTo(93, 601).release().perform();	
		//touchActions.

	}

}
