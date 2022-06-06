package com.kite.qa.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Kite.qa.base.TestBase;
import Com.Kite.qa.pages.HomePage;
import Com.Kite.qa.pages.LoginPage;
import junit.framework.Assert;


public class HomePageTest extends TestBase{

	
	LoginPage loginpage;
	boolean homepage;
	
	public HomePageTest() {
		super();
	}
	// public static Logger log = LogManager.getLogger(TestBase.class.getName());
	@BeforeMethod
	public void setup() throws InterruptedException {
		 initialization();
	//	 log.info("Driver is initialized");
		 loginpage=new LoginPage();
		 homepage=loginpage.validateKiteloginUserID(props.getProperty("Username"), props.getProperty("Password"), props.getProperty("PIN"));
	//	 log.info("Usernames & Password is Entered");		 
	}
	
	@Test	
	 public void LoginPageTitleTest() throws InterruptedException {
			String Title = loginpage.ValidateLoginPageTitle(props.getProperty("Username"), props.getProperty("Password"), props.getProperty("PIN"));
			 Assert.assertEquals(Title, "Dshboard / Kite");
		//	 log.info("Login page Title ");
	}
	
    @AfterMethod
     public void TearDown() throws InterruptedException {
	 Thread.sleep(2000);
	 driver.quit();
}
	
}
