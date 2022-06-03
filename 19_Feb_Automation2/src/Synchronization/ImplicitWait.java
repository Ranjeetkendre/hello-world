package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
	
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		  
		// Implicit wait always applied globally -it's applicable for all webelemet on the webpage.
		// Dynamic in nature
		  driver.get("https://www.redbus.in/");
     
		  driver.findElement(By.id("src")).sendKeys("Pune");
		 
		  driver.findElement(By.xpath("//li[@data-id=\"130\"]")).click();
		
          driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Mumbai");	
      
          driver.findElement(By.xpath("//li[@data-id=\"462\"]")).click();
          driver.findElement(By.xpath("//label[contains(text(),'Date')]")).click();
       
          driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
          driver.findElement(By.xpath("//button[contains(text(),'Search Buses')]")).click();
      	
          
	}

}
