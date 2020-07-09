package test;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSTest extends DesiredCapa {
	
	
	public static void main(String[] args) throws MalformedURLException {
		IOSDriver<IOSElement> driver = capabilities();	
		driver.findElementByAccessibilityId("AAPLAlertViewController").click();
		driver.findElementByAccessibilityId("Text Entry").click();
		driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("Hello");
		driver.findElementByAccessibilityId("OK").click();
		driver.quit();
	}
}
