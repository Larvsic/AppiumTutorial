package luisMavenAppium.PageObjectPattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

//All the objects belonging to one page, will be defined in java class
//So this class will be written with all the objects of home page of the app

public class AppiumTutorialPOHomePage {
	
	//1. Is to call the driver object from testcase to pageobject file
	
	
	//Concatenate driver
	public AppiumTutorialPOHomePage(AppiumDriver androidDriver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this); //CONSTRUCTOR REFERING ITSELF
		//IF you are working with selenium only, you can put PageFactory.initElements(driver, this); 
		
	}
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement Preferences;
	//Below show the same thing as above
	//androidDriver.findElementByXPath("//android.widget.TextView[@text='Preference']");
	
	
	

}
