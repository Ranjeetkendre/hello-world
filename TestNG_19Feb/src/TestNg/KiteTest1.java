package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTest1 {
// it can pick any test cases sequence is not present
	
	WebDriver driver;
	//1  4 7
	@SuppressWarnings("deprecation")	
	@BeforeMethod
	public void setup() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			driver= new ChromeDriver();			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://kite.zerodha.com/");
	}
	//2
	@Test
	public void KiteLoginpageTitle() {
		String Title =driver.getTitle();
		System.out.println(Title);
	}	
	//5
	@Test
	public void kitelogoTest() {
	boolean b=driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]")).isDisplayed();
	System.out.println(b);
	}
	
	//8
	@Test 
	public void forgetuserlink() {
		boolean b1=driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID or password?')]")).isDisplayed();
		System.out.println(b1);
	}	
	
	//3 6 9
       @AfterMethod
         public void Teardown() {
         driver.quit();
}
}
