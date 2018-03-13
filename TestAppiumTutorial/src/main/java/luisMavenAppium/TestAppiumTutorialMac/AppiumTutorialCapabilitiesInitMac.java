package luisMavenAppium.TestAppiumTutorialMac;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTutorialCapabilitiesInitMac {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone de Luis");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "ae4442a76552dccdf53e68bd65998b3ce6daf6ba");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		desiredCapabilities.setCapability(MobileCapabilityType.APP, "//Users/html5-5//Desktop//UICatalog.app");
		
		IOSDriver driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
		
		
		
		

	}

}
