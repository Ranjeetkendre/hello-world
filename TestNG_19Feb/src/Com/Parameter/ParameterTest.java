package Com.Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
	
	@Test
	public void kiteloginpage() {
		driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
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
