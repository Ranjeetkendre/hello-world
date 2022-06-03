package TestNg;

import org.testng.annotations.Test;

public class DependsonMethod {

	
	@Test
	public void loginTest() {
		System.out.println("Login page");
	//	int i=10/0;
	}
	@Test(dependsOnMethods = "loginTest")
	public void Homepage() {
		System.out.println("HomePage");
	}
	
	@Test(dependsOnMethods = "loginTest")
	
	public void SearchpageTest() {
		System.out.println("LoginTest");
	}
	@Test(dependsOnMethods = "loginTest")
	public void RegPage() {
		System.out.println("Reg page");

	}
	
}
