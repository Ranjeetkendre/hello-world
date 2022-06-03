package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssetion {

	
	@Test
	public void demoTest() {
		
		
		Assert.assertTrue(false);
		System.out.println("False");
		Assert.assertEquals("Welcome", "Welcome"); // True - Passed
		Assert.assertEquals("Selenium", "selenium");// True -Passed
		
		System.out.println("Successfully Passed");
		
	}
	
	@Test
	public void demoTest1() {
		Assert.assertEquals("Welcome", "Welcome");
		Assert.assertEquals("Selenium", "Selenium");  // Failed		
		System.out.println("Successfully Passed!!!");
		System.out.println("Successfully Passed!!!");
		System.out.println("Successfully Passed!!!");
		System.out.println("Successfully Passed!!!");
	}
}
