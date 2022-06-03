package TestNg;

import org.testng.annotations.Test;

public class ExceptionTimeout {
 
	@Test(timeOut = 3000)
	public void voidinfiniteloop() {
		for(;;) {
			System.out.println(1);
			
		}
	}
	
}
