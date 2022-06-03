package ParallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Test4 {
 
	@Test
	public void Module1() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(3000);
			driver.quit();
			
}
	@Test
	public void Module2() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.quit();			
			
}
}

