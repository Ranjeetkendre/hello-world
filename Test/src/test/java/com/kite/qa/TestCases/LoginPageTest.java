package com.kite.qa.TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Kite.qa.base.TestBase;
import Com.Kite.qa.pages.HomePage;
import Com.Kite.qa.pages.LoginPage;
import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();  //how call super class const - using super keyword
	}
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage =new LoginPage();
		
	}
		 @Test(priority=2)
		 public void LoginPageTitleTest() throws InterruptedException {
				String Title = loginpage.ValidateLoginPageTitle(props.getProperty("Username"), props.getProperty("Password"), props.getProperty("PIN"));
				 Assert.assertEquals(Title, "Kite - Zerodha's fast and elegant flagship trading platform");
			}
		 @Test(priority=3)
		 public void KiteUserID() throws InterruptedException {
			boolean UserID= loginpage.validateKiteloginUserID(props.getProperty("Username"), props.getProperty("Password"), props.getProperty("PIN"));
			Assert.assertTrue(true);
         }
		 @Test(priority=1)
		 public void loginTest() throws InterruptedException {
		HomePage homepage=loginpage.login(props.getProperty("Username"), props.getProperty("Password"), props.getProperty("PIN"));
		Assert.assertTrue(true);
		 }
	 @AfterMethod
	 public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
		
}
