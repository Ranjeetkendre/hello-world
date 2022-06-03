package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
	
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();	  
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Rdkendre@123");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//input[@id=\"email\"]")).clear();
		  driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Rdkendre@123");
		  driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("WQ123");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//input[@id=\"pass\"]")).clear();

	}

}
