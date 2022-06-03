package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByPixel {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0,10000)", "");
		
		Thread.sleep(4000);
		
		js.executeAsyncScript("window.scrollBy(0,-5000)", "");
	
		
	
		
	}

}
