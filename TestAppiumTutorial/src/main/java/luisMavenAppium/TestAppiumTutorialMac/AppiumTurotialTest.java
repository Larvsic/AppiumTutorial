package luisMavenAppium.TestAppiumTutorialMac;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class AppiumTurotialTest extends AppiumTutorialCapabilitiesInitMac{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		IOSDriver<IOSElement> driver = Capabilities(); // IF i want to use this method, without creating an object from the complete class, you can make static the class (public static IOSDriver<IOSElement>Capabilities() throws MalformedURLException {) so you can access directly

	}

}
