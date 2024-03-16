package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public WebDriver driver;
	
	@BeforeTest
	public void driverSetUp() {
		driver = initDriver();
	}
	
	
	public WebDriver  initDriver() {
		
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}

}
