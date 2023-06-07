package ui;  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoAutomation {
	WebDriver driver;
	public static void main(String[] args) {
		DemoAutomation D = new DemoAutomation();
		D.max();
		D.test();
		D.chk(null);
	}
	
	public void max() {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
	}
	
	public void test() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement a = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		a.click();
		a.sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	}
	public Boolean chk(Boolean res) {
		res = driver.findElement(By.xpath("//body[1]/div[5]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/span[1]")).isDisplayed();
		System.out.println(res);
		Assert.assertTrue(res);
		return res;
	}
}
