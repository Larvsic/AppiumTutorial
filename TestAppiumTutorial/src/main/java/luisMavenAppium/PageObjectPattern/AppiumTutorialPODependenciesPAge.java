package luisMavenAppium.PageObjectPattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppiumTutorialPODependenciesPAge {
	
public AppiumTutorialPODependenciesPAge(AppiumDriver androidDriver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='android:id/checkbox']")
	public WebElement WIFI;

}
