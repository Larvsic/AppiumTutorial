package luisMavenAppium.TestAppiumTutorial;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTutorialHybridCapabilities {
		
		public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException {
	        System.out.println( "Appium Tutorial" );
	        
	        //Best practice to set an absolute path
	        File fileApk = new File("src");
	        File file = new File(fileApk,"ApiDemos-debug.apk"); //fileApk constructor
	        
	        DesiredCapabilities desiredCap = new DesiredCapabilities();
	        
	        if(device.equals("emulator"))
	        {
	        	
	        	desiredCap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android emulator" );
	        	
	        }
	        else if(device.equals("real"))
	        {
	        	
	        	 desiredCap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device" ); //This will work just when there is only one device attached
	        	
	        }
	        
	        desiredCap.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
	        AndroidDriver<AndroidElement> androidDriver =new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),desiredCap); //All the capabilities are passed as an argument
	        return androidDriver;
	        /// Since here is ready to install and run the app. Not test yet
	        
		

	}

}
