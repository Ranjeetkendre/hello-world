package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://kite.zerodha.com");
		
		 Thread.sleep(2000);	
	}

}
