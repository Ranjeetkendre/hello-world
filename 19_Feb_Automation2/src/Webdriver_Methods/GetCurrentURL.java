package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  
		  driver.get("https://www.google.com");		  
		  Thread.sleep(10000);
		  
		  String title = driver.getTitle();
		  String URL = driver.getCurrentUrl();
		  System.out.println(title);
		  System.out.println(URL);
		  
		  Thread.sleep(4000);
		  
		
	}

}
