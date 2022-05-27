package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

/*@BeforeSuite --Set System property for chrome driver
@BeforeTest -- Launch Browser
@BeforeClass --Login to application
@BeforeMethod -- EnterURL
@Test --Google Title test
@AfterMethod --Logout from app
@BeforeMethod -- EnterURL
@Test --Search Text
@AfterMethod --Logout from app
@BeforeMethod -- EnterURL
@Test --Google logo
@AfterMethod --Logout from app
@AfterClass -- Close browser
@AfterTest --Delete cookies*/

	
// We use only @Beforeclass, @BeforeMethod @Test @Aftermethod, @AterTest
	//Precondition annotations - Starts with @before
	@BeforeSuite   //1
	public void SetUp() {
		System.out.println("@BeforeSuite --Set System property for chrome driver");
	}
	@BeforeTest  //2
	public void LaunchBrowser() {
		System.out.println("@BeforeTest -- Launch Browser");
	}
	
	@BeforeClass  //3
	public void login() {
		System.out.println("@BeforeClass --Login to application");
	}
	@BeforeMethod  //4
	public void EnterURL() {
		System.out.println("@BeforeMethod -- EnterURL");
	}
	//Testcases - Starting with @Test
	@Test   //1
	public void GoogleTitleTest() {
		System.out.println("@Test --Google Title test");
	}
	@Test  //2
	public void SerachText() {
		System.out.println("@Test --Search Text");
	}	
	@Test  //3
	public void googleLogo(){
		System.out.println("@Test --Google logo");
	}
	//Post condition -- Starts with @After
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod --Logout from app");
	}
	
	@AfterClass
	public void closebrowser() {
		System.out.println("@AfterClass -- Close browser");
	}
	@AfterTest
	public void deletecookies() {
		System.out.println("@AfterTest --Delete cookies");
	}
}
