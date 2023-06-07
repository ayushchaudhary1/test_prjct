import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import bsh.Capabilities;
import io.appium.java_client.AppiumDriver;


public class note {
	
	

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException {
		
		
		AppiumDriver driver = null;
		
		DesiredCapabilities appCapabilities = new DesiredCapabilities();
		appCapabilities.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
		appCapabilities.setCapability("appArguments", "Window");
		appCapabilities.setCapability("appWorkingDir", "WindowPC");
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), appCapabilities);
		((WebDriver) driver).manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.find_element_by_name("Help");
	}

}
