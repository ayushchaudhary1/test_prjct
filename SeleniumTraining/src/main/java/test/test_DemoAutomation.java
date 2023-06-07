package test; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.DemoAutomation;

public class test_DemoAutomation {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		
		DemoAutomation D = new DemoAutomation(driver);
		D.test();
		D.chk(null);
	}
}