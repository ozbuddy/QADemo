package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class test1 extends BaseTest {
	@Test
	public void launchApplication() {
		// this is a test1
		driver.get("https://rahulshettyacademy.com/client/");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginIn("userName", "password");
		
		
	}

}
