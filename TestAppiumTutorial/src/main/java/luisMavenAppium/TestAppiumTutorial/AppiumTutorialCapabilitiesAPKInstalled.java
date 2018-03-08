package luisMavenAppium.TestAppiumTutorial;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppiumTutorialCapabilitiesAPKInstalled {

		public static AndroidDriver<AndroidElement> Capabilities2() throws MalformedURLException {
	        System.out.println( "Appium Tutorial" );
	        
	        DesiredCapabilities desiredCap2 = new DesiredCapabilities();
	        desiredCap2.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	        desiredCap2.setCapability(MobileCapabilityType.DEVICE_NAME,"ALE-L23" );
	        //Grant permissions to start the app
	        desiredCap2.setCapability("autoGrantPermissions","true");
	        ////// Set the package
	        desiredCap2.setCapability("appPackage", "mx.com.bancoazteca.bazdigitalmovil");
	        ////// Set The main activity
	        desiredCap2.setCapability("appActivity","mx.com.bancoazteca.bancadigital.landing.presentation.view.LandingActivity");
	        
	        AndroidDriver<AndroidElement> androidDriver =new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),desiredCap2); //All the capabilities are passed as an argument
	        return androidDriver;
	        /// Since here is ready to install and run the app. Not test yet
	        

	}

}
