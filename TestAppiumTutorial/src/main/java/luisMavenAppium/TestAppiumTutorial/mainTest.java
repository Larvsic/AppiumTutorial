package luisMavenAppium.TestAppiumTutorial;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class mainTest extends AppiumTutorialCapabilitiesAPKInstalled {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		System.out.println( "Appium Tutorial" );
		
		AndroidDriver<AndroidElement> androidDriver = Capabilities2();
        
       
        System.out.println("Done!!!!!!!!!");
        
        

	}

}
