package luisMavenAppium.TestAppiumTutorial;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Appium tutorial from UDEMY
 */

/*
 * PRErequisites:
 * Appium Server is Started
 * Make shure your emulator is opened
 *  My Desired CAPABILITIES
 * 	I want to open emulator 
 *  I want to let install the app 
 *  Which OS  
 *  Connection Step
 *
 */
public class AppiumTutorialCapabilitiesInit {
	
    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
        System.out.println( "Appium Tutorial" );
        
        //Best practice to set an absolute path
        File fileApk = new File("src");
        File file = new File(fileApk,"ApiDemos-debug.apk"); //fileApk constructor
        

        DesiredCapabilities desiredCap = new DesiredCapabilities();
        //desiredCap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device" ); This will work just when there is only one device attached
        desiredCap.setCapability(MobileCapabilityType.DEVICE_NAME,"ALE-L23" );
        desiredCap.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
        AndroidDriver<AndroidElement> androidDriver =new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),desiredCap); //All the capabilities are passed as an argument
        return androidDriver;
        /// Since here is ready to install and run the app. Not test yet
        
    }
}
