package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Threasleep {

	public static void main(String[] args) throws InterruptedException{
		
		
		 System.setProperty("webDriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  
		  driver.get("https://www.facebook.com");
		  
		  Thread.sleep(15000);
		  
		  driver.close();
	}

}
