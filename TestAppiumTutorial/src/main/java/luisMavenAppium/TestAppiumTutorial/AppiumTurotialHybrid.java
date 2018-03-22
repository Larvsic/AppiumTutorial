package luisMavenAppium.TestAppiumTutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumTurotialHybrid extends AppiumTutorialHybridCapabilities {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
	AndroidDriver<AndroidElement> androidDriver = Capabilities("real");
		
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Xpath id className, androidUIautomator
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		androidDriver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		androidDriver.findElementByXPath("//android.widget.CheckBox[@resource-id='android:id/checkbox']").click();
		//Commit

	}

}
