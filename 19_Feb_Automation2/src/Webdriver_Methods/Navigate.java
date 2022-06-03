package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
	
		
		 System.setProperty("webDriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.facebook.com");	
		  Thread.sleep(4000);
		  String page1=driver.getTitle();
		  System.out.println(page1);
		  
		  driver.navigate().to("https://www.amazon.in/");
		  
		  Thread.sleep(4000);
		  String page2=driver.getTitle();
		  System.out.println(page2);
		  
		  driver.navigate().back();
		  Thread.sleep(4000);
		  
		  driver.navigate().refresh();
		  driver.navigate().forward();	  
		  
		  System.out.println(driver.getTitle());
		  Thread.sleep(4000);
	  
		  driver.close();
		  
	}
}
