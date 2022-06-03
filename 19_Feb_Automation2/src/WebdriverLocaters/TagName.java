package WebdriverLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();	  
		  //Tagname
		  driver.get("http://demo.automationtesting.in/Register.html");
		  Thread.sleep(4000);
		  driver.findElement(By.tagName("input")).sendKeys("Rohit");
		  driver.findElement(By.tagName("textarea")).sendKeys("rrrrr");

	}

}
