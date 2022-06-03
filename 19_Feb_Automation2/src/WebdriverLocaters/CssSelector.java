package WebdriverLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
	
 
		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();	  
		  //Name
		  driver.get("https://app.hubspot.com/login");
		  Thread.sleep(3000);
//		  driver.findElement(By.cssSelector("#username")).sendKeys("Test@123");
//		  driver.findElement(By.cssSelector("#password")).sendKeys("RR23");
//		  driver.findElement(By.cssSelector("input#username")).sendKeys("Test123");
//		  driver.findElement(By.cssSelector("input#password")).sendKeys("RRR");
		  driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("Rdkendre@gmail.com");
		  driver.findElement(By.cssSelector("input.form-control.private-form__control.login-password.m-bottom-3")).sendKeys("Paasssssssss");
		  Thread.sleep(3000);
		  driver.findElement(By.cssSelector("span.UICheckbox__PrivateCheckboxIcon-kw9nah-4.dFVnzf.private-checkbox__dash")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.cssSelector("#loginBtn")).click();
	}

}
