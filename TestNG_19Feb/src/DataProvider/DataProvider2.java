package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvider2 {

	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void SetUp() {
		
		ChromeOptions opions =new ChromeOptions();
		opions.addArguments("--disable-notifications");
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		 
		  driver = new ChromeDriver(opions); 
		  
		  driver.manage().window().maximize();  
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.get("https://kite.zerodha.com/");		
	}
	@Test(dataProvider="loginData")
	public void loginTest(String User, String PWD, String PIN,String EXP) throws InterruptedException {
		//	System.out.println(User+PWD+PIN+EXP);
		WebElement Username =driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		Thread.sleep(1000);
		Username.sendKeys(User);
		
		WebElement Password =driver.findElement(By.xpath("//input[@id=\"password\"]"));
		Thread.sleep(1000);
		Password.sendKeys(PWD);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(1000);
		
		WebElement PINnu=driver.findElement(By.xpath("//input[@id=\"pin\"]"));
		Thread.sleep(1000);
		PINnu.sendKeys(PIN);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(1000);
		
		String ExpectedTitle ="Dashboard / Kite";
		String ActualTitle =driver.getTitle();
		System.out.println(ActualTitle);
		
		if(EXP.equals("Valid")) {
			if(ExpectedTitle.equals(ActualTitle)) {
				driver.findElement(By.xpath("//span[@class=\"user-id\"]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),' Logout')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'Change user')]")).click();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
			else if(EXP.equals("inValid")) {
				if(ExpectedTitle.equals(ActualTitle)) {
					driver.findElement(By.xpath("//span[@class=\"user-id\"]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//a[contains(text(),' Logout')]")).click();
					Thread.sleep(3000);
					Assert.assertTrue(true);
				}
			}				
		}
	@DataProvider(name="loginData")
	public String [][] getData() {	
		String loginData[][] ={
			{"GP8097","Swami@0110",	"449192","Valid"},
			{"GP8097","Swami@0110",	"449192","Valid"},
			{"GP8097","Swami@0110",	"449192","Valid"},
			{"GP8097","Swami@0110",	"449192","Valid"},
	};
	return loginData;
}
	@AfterClass
	public void teardowm() {
		driver.quit();
	}
}