package TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	
	SoftAssert softassert =new SoftAssert();
	SoftAssert softassert1 =new SoftAssert();
	
	
	@Test
	public void demoTest() {
		
		softassert.assertEquals("Welcome", "Welcome");
		softassert.assertEquals("Selenium", "Selenium");
		System.out.println("Successfully Passed Test1!");
		softassert.assertAll(); 
// it will collect the result of all the assetion and in case of any failure mark, the test as failed.
	}
	@Test
	public void demoTest2() {
		
		softassert1.assertEquals("Welcome", "elcome");
		softassert1.assertEquals("Selenium", "Selenium");
		System.out.println("Successfully Passed Test2");
		softassert1.assertAll();
}
}
