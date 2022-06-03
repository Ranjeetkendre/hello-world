package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get {

	public static void main(String[] args) {
		
	
		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  
		  driver.get("https://www.google.com");		
		  //use- This method is used to open an application
		  //2. get method accepts the string i/p	
		//  driver.close();
	}

}
