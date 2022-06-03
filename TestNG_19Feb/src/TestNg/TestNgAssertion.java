package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNgAssertion {

	WebDriver driver;
	@BeforeMethod
	public void setup() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			driver= new ChromeDriver();			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://kite.zerodha.com/");
}
	@Test
	public void Username() throws InterruptedException {
	WebElement Username =	driver.findElement(By.xpath("//input[@id=\"userid\"]"));
	WebElement Password  =  driver.findElement(By.xpath("//input[@id=\"password\"]"));
	
	//AssertTrue
         Assert.assertTrue(Username.isDisplayed());
         Username.sendKeys("GP8097");
         
         Thread.sleep(3000);
         Assert.assertTrue(Password.isDisplayed());
         Password.sendKeys("Swami@0110");
         
         Thread.sleep(3000);
         driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
         
     // AssertFalse
         Assert.assertFalse(Username.isDisplayed());
         Username.sendKeys("GP8097");
         
         Thread.sleep(3000);
         Assert.assertFalse(Password.isDisplayed());
         Password.sendKeys("Swami@0110");
         
         Thread.sleep(3000);
         driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
         
      // AssertEqual
	}    
         @Test
         public void Kitelogin() {
      boolean  b = driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]")).isDisplayed();
         Assert.assertTrue(b);
         Assert.assertEquals(b, true);
         }

	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}

	}
