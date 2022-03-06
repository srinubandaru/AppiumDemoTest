package AppiumDemo.AppiumDemoTest;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class CalculaterTest {
	
	//WebDriver d1;
	//AndroidDriver d2;
	
static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		try {
			
			openCalculator();
			
		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			System.out.println(exp.getStackTrace());
		
		}

	}
	
	public static void openCalculator() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi Note 5 Pro");
		cap.setCapability("udid", "fddf6a9a");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9.1.18");
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		

			
	driver=new AppiumDriver<MobileElement>(url,cap);
			
		
		
		
		
		System.out.println("Application startrd ........!!!!");
		
	}

}
