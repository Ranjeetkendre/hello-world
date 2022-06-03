package WebdriverLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdiver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();  
		  //Name
		  driver.get("https://www.facebook.com/");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.name("email")).sendKeys("Rahul");
		  Thread.sleep(3000);
		  driver.findElement(By.name("pass")).sendKeys("Xyzzz");
		  Thread.sleep(3000);
		  driver.findElement(By.name("login")).click();
		  Thread.sleep(10000);
		  driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();

		 
	}

}
