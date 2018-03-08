package luisMavenAppium.TestAppiumTutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumTutorialSwipe extends AppiumTutorialCapabilitiesInit {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> androidDriver = Capabilities();
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		androidDriver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		
		//androidDriver.findElementByXPath("//*[@content-desc='Control deslizante circular de horas: 1']").click();	//not performed. In another app is probably working
		TouchAction touchAction = new TouchAction(androidDriver);
		
		touchAction.press(androidDriver.findElementByClassName("android.view.View")).moveTo(267, 777).release().perform();		
		androidDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		androidDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("YA se ejecutó el primer swipe");
		
		androidDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		androidDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Va el segundo");
		//touchAction.press(androidDriver.findElementByClassName("android.view.View")).moveTo(93, 601).release().perform();	
		//touchActions.

	}

}
