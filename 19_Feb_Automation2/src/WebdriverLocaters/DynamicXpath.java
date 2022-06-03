package WebdriverLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();	  
		  //Xpath
		  driver.get("https://www.facebook.com/");
		  //driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Rohit");
		  Thread.sleep(4000);		  
		  driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("Rahul");
		  driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("HSBCWelocme@123");
		  Thread.sleep(4000);
		  
		  //1. Dynamic id :Button
		  //id = u_0_d_ms 
		  
		  driver.findElement(By.xpath("//button[contains(@id,'u_0_d_')]")).click();
		  
		  //2.starts-with
		  //id= u_0_d_
		 // driver.findElement(By.xpath("//button[starts-with(@id,\"u_0_d_\")]")).click();
		  
		  //3. ends-with
		  //id= __Tm
          //driver.findElement(By.xpath("//button[ends-with(@id,\"_TG\")]")).click()		  
		  

	}

}
