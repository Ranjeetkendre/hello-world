package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear2 {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();	  
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(4000);
	     WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	     email.sendKeys("Ranjeet");	 
		 Thread.sleep(4000);
	     email.clear();
	     Thread.sleep(4000);
	     email.sendKeys("XYZ");
	     Thread.sleep(4000);
	     email.clear();
	     System.out.println("Validation completed");
	     
	     WebElement Pass = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
	     
	     Pass.sendKeys("QWE13");
	     Thread.sleep(4000);
	     Pass.clear();
	    
	}

}
