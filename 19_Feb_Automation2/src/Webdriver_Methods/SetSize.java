package Webdriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		
		

		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  
		  driver.get("https://www.google.com");		
	//	  driver.manage().window().maximize();
		                          //We  //He
		  Dimension Size = new Dimension(200,500);
		  Thread.sleep(5000);
		  driver.manage().window().setSize(Size);
		  
		  Thread.sleep(5000);
		  
		  driver.close();
		 		  
	}

}
