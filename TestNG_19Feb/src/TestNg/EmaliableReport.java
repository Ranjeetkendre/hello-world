package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmaliableReport {

	
	@Test
	public void google() {
		Reporter.log("Running Testcase1", true);
		System.out.println("Running Google test");

		}
	@Test
	public void SearchTest() {
		Reporter.log("Running Testcase2", true);
		System.out.println("Running Google Searcg test");

		}
}
