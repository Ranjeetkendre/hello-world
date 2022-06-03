package WebdriverLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
	

		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();	  
		
		  driver.get("https://login.yahoo.com/");
		  Thread.sleep(4000);
		  //1. Xpath
//		     driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("TesAutomation@yahoo.com");
//           driver.findElement(By.xpath("//input[@id=\"login-signin\"]")).click();
           
           //2.ID
//         driver.findElement(By.id("login-username")).sendKeys("TesAutomation@yahoo.com");
//         driver.findElement(By.id("login-signin")).click();
         
         //3.Name
//         driver.findElement(By.name("username")).sendKeys("Test@ahoo.com");
//         Thread.sleep(2000);
//         driver.findElement(By.name("signin")).click();
		  
		  //4.CSS Selector
//		  driver.findElement(By.cssSelector("#login-username")).sendKeys("Test@123");
//		  Thread.sleep(2000);
//		  driver.findElement(By.cssSelector("#login-signin")).click();
		  
		  //5.LinkText
//         driver.findElement(By.linkText("Forgot username?")).click();
         
         //6.PartialLinktext
 //        driver.findElement(By.partialLinkText("Forgot")).click(); 
           
		  //7.Classname
//		  driver.findElement(By.className("phone-no")).sendKeys("RR@123");
//		  Thread.sleep(2000);
//		  driver.findElement(By.className("pure-button")).click();
		  		 
	   //Tagname
	}

}
