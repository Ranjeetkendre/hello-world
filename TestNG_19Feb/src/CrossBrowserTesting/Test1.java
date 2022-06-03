package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

	WebDriver driver;
	@Parameters("Browsername")
	@SuppressWarnings("deprecation")
	@Test
	public void KiteLogin(String Browsername) throws InterruptedException {
		
		
		if(Browsername.equals("Chrome")) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");				
		driver = new ChromeDriver();  //Launch browser		
		}
		else if(Browsername.equals("Edge")) {
	    System.setProperty("webdriver.edge.driver", "C:\\Installer\\msedgedriver.exe");				
		driver = new EdgeDriver();  //Launch browser
		}
		else if(Browsername.equals("IE")) {
		    System.setProperty("webdriver.Ie.driver", "C:\\Installer\\IEDriverServer.exe");				
			driver = new InternetExplorerDriver();  //Launch browser
		}		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("GP8097");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Swami@0110");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys("449192");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(3000);
		  String title = driver.getTitle();
		  System.out.println(title);
		String ExpectedResult = "GP8097";
		
		
		String ActualResult =driver.findElement(By.xpath("//span[contains(text(),'GP8097')]")).getText();
		
		if(ExpectedResult.equals(ActualResult)) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(4000);
		driver.quit();
	}
}
