package Webdriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
	

		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  
		  driver.get("https://www.google.com");	
		  Thread.sleep(7000);
		  Point P=new Point(500, 300);
		  Thread.sleep(7000);
		  driver.manage().window().setPosition(P);
		  Thread.sleep(7000);
		  System.out.println(driver.manage().window().getPosition());
		  
	}

}
