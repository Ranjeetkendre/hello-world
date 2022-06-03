package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) {
	
		System.setProperty("webDriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1. get method
		//This method is used to open application/URL
		//get methosis acept the string i/p only
		driver.get("https://www.facebook.com");
	}

}
