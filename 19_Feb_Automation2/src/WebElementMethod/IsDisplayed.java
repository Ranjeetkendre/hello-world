package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {


		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();	  
		  //Xpath
		  driver.get("https://www.facebook.com/");
	      
		  boolean b= driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).isDisplayed();
	      System.out.println(b);
	
	}

}
