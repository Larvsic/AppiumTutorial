package luisMavenAppium.PageObjectPattern;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import luisMavenAppium.TestAppiumTutorial.AppiumTutorialCapabilitiesInit;

public class AppiumTutorialPageObjectTEST extends AppiumTutorialCapabilitiesInit {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
AndroidDriver<AndroidElement> androidDriver = Capabilities();
		
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AppiumTutorialPOHomePage homePage = new AppiumTutorialPOHomePage(androidDriver);
		AppiumTutorialPOPreferencesPage preferences = new AppiumTutorialPOPreferencesPage(androidDriver);
		AppiumTutorialPODependenciesPAge preferencesDep = new AppiumTutorialPODependenciesPAge(androidDriver);
		homePage.Preferences.click();
		preferences.Dependencies.click();
		preferencesDep.WIFI.click();
		

	}

}
