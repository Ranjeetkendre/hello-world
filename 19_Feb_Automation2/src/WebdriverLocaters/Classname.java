package WebdriverLocaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname {

	public static void main(String[] args) throws InterruptedException {
	
		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();	  
		  //Name
		  Thread.sleep(3000);
		  driver.get("https://www.facebook.com/");
		  
		
		  boolean b=  driver.findElement(By.className("uiContextualLayerPare")).isDisplayed();
		  System.out.println(b);
	
	     
	        driver.quit();

	}

}
