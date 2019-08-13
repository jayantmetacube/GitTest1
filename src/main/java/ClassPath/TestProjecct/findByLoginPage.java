package ClassPath.TestProjecct;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Mobileappium.initialiseApk2;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

//All the objects belonging to one page will defined the single java class


public class findByLoginPage

{
	
	public findByLoginPage (AndroidDriver<AndroidElement> driver)
	
     {
		
		PageFactory.initElements(new AppiumFieldDecorator (driver), this);
	 
     }
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	public WebElement username ;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Female']")
	public WebElement radiobutton ;
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	public WebElement contrydrpdwn ;
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement letsshop ;
		
	@AndroidFindBy(xpath="//android.view.View[@index='1']")
	public WebElement e1 ; 
	
	
	
	@AndroidFindBy(xpath="//android.view.View[@index='2']")
    public WebElement e2;
	
}
