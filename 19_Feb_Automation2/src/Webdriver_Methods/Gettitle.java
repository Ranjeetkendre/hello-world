package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

	public static void main(String[] args) throws InterruptedException {
		 
		String expectedresult="Gooogle";
		
		 System.setProperty("webDriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.google.com");		  
		  Thread.sleep(10000);
		  String title = driver.getTitle();
		
		  System.out.println(title);
		  if(title.equals(expectedresult)) {
			  System.out.println("Coorect title");
		  }
		  else {
			  System.out.println("Wrong title");
		  }	  
		  driver.close();
		  

	}

}
