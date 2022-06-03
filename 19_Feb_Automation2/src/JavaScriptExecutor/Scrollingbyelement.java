package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingbyelement {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/");
			Thread.sleep(4000);
			

			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			Thread.sleep(4000);
			
		WebElement Text =driver.findElement(By.xpath("//h2[contains(text(),'Web Templates')]"));
		
		js.executeScript("arguments[0].scrollIntoView();", Text);
				
			
	}

}
