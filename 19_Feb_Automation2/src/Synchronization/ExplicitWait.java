package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();  
		  driver.get("https://www.facebook.com/");
		  WebElement element =  driver.findElement(By.xpath("//input[@id=\"email\"]"));
		 
	}
	
	public static void sendkeys(WebDriver driver1,Duration timeout,WebElement element,String value) {
		
		new WebDriverWait(driver1,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

}
