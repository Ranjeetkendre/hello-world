package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) throws InterruptedException {
	
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();	  
		  //Xpath
		  driver.get("https://app.hubspot.com/login");
		  Thread.sleep(4000);
//		  boolean b =  driver.findElement(By.xpath("id=\"loginBtn\"")).isEnabled();
//		  System.out.println(b);
		  
		boolean b1=  driver.findElement(By.xpath("//i18n-string[contains(text(),'Log in')]")).isEnabled();
		System.out.println(b1);
		  
//		  boolean b=  driver.findElement(By.xpath("//button[@type=\"submit\"]")).isEnabled();
//		  System.out.println(b);
		
	}

}
