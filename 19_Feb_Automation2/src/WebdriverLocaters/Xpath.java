package WebdriverLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

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
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
		  Thread.sleep(2000);
	      //driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		  //driver.findElement(By.xpath("//button[text()='Log In']")).click();
		  driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
	}
}
