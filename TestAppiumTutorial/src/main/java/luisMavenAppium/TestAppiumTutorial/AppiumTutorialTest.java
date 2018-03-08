package luisMavenAppium.TestAppiumTutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumTutorialTest extends AppiumTutorialCapabilitiesInit {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> androidDriver = Capabilities();
		
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Xpath id className, androidUIautomator
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		androidDriver.findElementByXPath("//android.widget.CheckBox[@resource-id='android:id/checkbox']").click();
		//androidDriver.findElementById("android:id/checkbox").click(); // Also can be this way when is unique 
		
		androidDriver.findElementByXPath("(//android.widget.RelativeLayout)[1]").click();// Here the number 2 is because it has 2 option with the same name, so you put the number to identify which will be clicked
		
		androidDriver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		androidDriver.findElementById("android:id/button1").click();

		
		
		
		
		
		
	}

}
