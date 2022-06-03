package WebdriverLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();		  
		  //ID
		  driver.get("https://www.facebook.com/");
          Thread.sleep(3000);
          driver.findElement(By.id("email")).sendKeys("ABCD");
          
          Thread.sleep(3000);
          driver.findElement(By.id("pass")).sendKeys("ABCD");
          
          Thread.sleep(3000);
          driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		  
	}

}
