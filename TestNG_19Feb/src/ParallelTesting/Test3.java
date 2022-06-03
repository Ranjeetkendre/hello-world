package ParallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 {
	
	    WebDriver driver;
		@SuppressWarnings("deprecation")
		@Test
		public void Module3() throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
				driver= new ChromeDriver();			
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("https://www.amazon.in/");
				Thread.sleep(3000);
				driver.quit();
	}
		
}
		
		

