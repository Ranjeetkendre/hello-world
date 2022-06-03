package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingTestNG {

	
	@Test
	public void m1() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://kite.zerodha.com");
		
		 Thread.sleep(2000)	;
		 driver.quit();
	}
	
	@Test
	public void m2() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://kite.zerodha.com");
		
		 Thread.sleep(2000)	;

		
	}
}
