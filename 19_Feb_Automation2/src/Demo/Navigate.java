package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		
        driver.navigate().back();
    	Thread.sleep(5000);
    	
    	driver.navigate().forward();
    	Thread.sleep(5000);
    	
    	driver.navigate().refresh();
    	Thread.sleep(5000);

        driver.close();
        

		
		
		
	}

}
