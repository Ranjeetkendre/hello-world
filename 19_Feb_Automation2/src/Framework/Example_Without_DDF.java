package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Example_Without_DDF {

	public static void main(String[] args) throws InterruptedException {
		  ChromeOptions Option=new ChromeOptions();
			
			Option.addArguments("--disable-notifications");
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
	 
		 WebDriver driver = new ChromeDriver(Option); 
		 
		 driver.manage().window().maximize();		 	  
	  
		  Thread.sleep(4000);
			driver.get("https://kite.zerodha.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//Username
			driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("GP8097");
			//Password
            driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Swami@0110");
            
            driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
            driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys("449192");
            
            driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

            
            String ExpectedUser = "GP8097";
            
           String ActualResult =driver.findElement(By.xpath("//span[contains(text(),'GP8097')]")).getText();
            
            if(ExpectedUser.equals(ActualResult)) 
            	System.out.println("Pass");            
            else
            	System.out.println("Fail");
	}

}
