package TestNg;
import org.testng.annotations.Test;
public class ExpectedException {

// Q - if u want to handle exception without try catch block so how will u handle it
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void Test() {	
		
		System.out.println("Handle numberformat exception");
		String s ="100A";
		Integer.parseInt(s);		
	}
}
